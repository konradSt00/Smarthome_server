package sr.ice.server.MultimediaDevices;


import SmartHome.MultimediaDevice;
import SmartHome.State;
import SmartHome.Status;
import com.zeroc.Ice.Current;

public class MultimediaDeviceI implements MultimediaDevice {
    State currentState = State.OFF;
    @Override
    public Status turnOff(Current current) {
        if(this.currentState == State.ON){
            this.currentState = State.OFF;
            return Status.SUCCESS;
        }
        return Status.FAIL;
    }

    @Override
    public Status turnOn(Current current) {
        if(this.currentState == State.OFF){
            this.currentState = State.ON;
            return Status.SUCCESS;
        }
        return Status.FAIL;
    }

    @Override
    public State getState(Current current) {
        return this.currentState;
    }
}
