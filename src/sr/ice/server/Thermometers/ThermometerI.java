package sr.ice.server.Thermometers;

import SmartHome.Temperature;
import SmartHome.TemperatureData;
import SmartHome.Thermometer;
import com.zeroc.Ice.Current;

public class ThermometerI implements Thermometer {

    Temperature currentTemperature = new Temperature(15, "*C");

    TemperatureData[] historicalTemperatures = {new TemperatureData(1, new Temperature(15, "*C")),
            new TemperatureData(2, new Temperature(3, "*C")),
            new TemperatureData(3, new Temperature(16, "*C")),
            new TemperatureData(4, new Temperature(25, "*C")),
            new TemperatureData(5, new Temperature(22, "*C")),
            new TemperatureData(6, new Temperature(33, "*C")),
            new TemperatureData(7, new Temperature(5, "*C")),
    };
    @Override
    public Temperature getCurrentTemperature(Current current) {
        return currentTemperature;
    }

    @Override
    public TemperatureData[] getLastWeekTemperature(Current current) {
        return historicalTemperatures;
    }
}
