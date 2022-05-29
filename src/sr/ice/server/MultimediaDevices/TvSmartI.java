package sr.ice.server.MultimediaDevices;


import SmartHome.*;
import com.zeroc.Ice.Current;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class TvSmartI extends MultimediaDeviceI implements TvSmart {

    private TvApp[] installedApps = {new TvApp("Spotify", "Music"),
            new TvApp("Netflix", "Movies"),
            new TvApp("Youtube", "Movies"),
            };

    private TvApp openedApp = null;


    @Override
    public TvApp[] getApplicationsList(Current current) {
        return this.installedApps;
    }

    @Override
    public Status openApp(String appName, Current current) throws NotFound, DeviceTurnedOff {
        if(State.OFF == this.currentState){
            throw new DeviceTurnedOff();
        }
        AtomicBoolean appOpened = new AtomicBoolean(false);
        Arrays.stream(this.installedApps).forEach(app -> {
            if(app.name.equals(appName)){
                this.openedApp = app;
                appOpened.set(true);
            }
        });
        if(appOpened.get() == false){
            throw new NotFound();
        }
        return Status.SUCCESS;
    }

    @Override
    public TvApp openedApp(Current current) throws DeviceTurnedOff {
        if(this.currentState == State.OFF)
            throw new DeviceTurnedOff();
        return this.openedApp;
    }
}
