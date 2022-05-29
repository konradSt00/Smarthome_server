package sr.ice.server.Fridges;

import SmartHome.*;
import com.zeroc.Ice.Current;
import org.omg.CORBA.TRANSACTION_MODE;

public class FridgeI implements Fridge {

    private Temperature currentTemperature = new Temperature(2, "*C");
    @Override
    public Temperature currentTemperature(Current current) {
        return this.currentTemperature;
    }

    @Override
    public Status changeTemperature(int temperature, Current current) throws TemperatureOutOfRange {
        if(temperature < TemperatureRange.MIN.value()){
            throw new TemperatureOutOfRange("Entered temperature is to low!");
        }else if( temperature > TemperatureRange.MAX.value()){
            throw new TemperatureOutOfRange("Entered temperature is to high!");
        }else {
            this.currentTemperature.value = temperature;
            return Status.SUCCESS;
        }

    }
}
