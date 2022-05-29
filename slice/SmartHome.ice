
#ifndef SMARTHOME_ICE
#define SMARTHOME_ICE

module SmartHome
{
  enum Status { SUCCESS, FAIL };
  enum State { ON, OFF };
  enum TemperatureRange {MIN, MAX};

  exception NotFound {};
  exception DeviceTurnedOff {};
  exception ContainerFull {};
  exception TemperatureOutOfRange{ string text; }

  struct TvApp
  {
      string name;
      string category;
  }
  struct Song
  {
    string name;
    int duration;
    string category;
  }

  struct Temperature
  {
    int value;
    string unit = "*C";
  }

  struct TemperatureData
  {
    int dayBack;
    Temperature avgTemperature;
  }

  struct ObjectProxy
  {
    string name;
    string category;
    string address;
  }

  sequence<TvApp> Applications;
  sequence<Song> Songs;
  sequence<TemperatureData> TemperatureHistory;
  sequence<ObjectProxy> AvailableDevices;

  interface MultimediaDevice
  {
    Status turnOff();
    Status turnOn();
    State getState();
  };

  interface TvSmart extends MultimediaDevice
  {
    Applications getApplicationsList();
    Status openApp(string appName) throws NotFound, DeviceTurnedOff;
    TvApp openedApp() throws DeviceTurnedOff;
  }

  interface MusicPlayer extends MultimediaDevice
  {
    Songs getAvailableSongs() throws DeviceTurnedOff;
    Status playSong(string songName) throws DeviceTurnedOff, NotFound;
    Song currentlyPlaying() throws DeviceTurnedOff;
  }

  interface Fridge
  {
    Temperature currentTemperature();
    Status changeTemperature(int temperature) throws TemperatureOutOfRange;
  }

  interface BigFridge extends Fridge
  {
      Status produceIce() throws ContainerFull;
  }

  interface Thermometer
  {
    Temperature getCurrentTemperature();
    TemperatureHistory getLastWeekTemperature();
  }

  interface DevicesUtil
  {
    AvailableDevices getAvailableDevices();
  }

};

#endif
