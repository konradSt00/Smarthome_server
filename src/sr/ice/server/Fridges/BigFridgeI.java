package sr.ice.server.Fridges;

import SmartHome.BigFridge;
import SmartHome.ContainerFull;
import SmartHome.Status;
import SmartHome.TemperatureOutOfRange;
import com.zeroc.Ice.Current;

public class BigFridgeI extends FridgeI implements BigFridge {

    private int MAX_ICE_LEVEL = 3;
    private int currentIceLevel = 2;
    @Override
    public Status produceIce(Current current) throws ContainerFull {

        if(currentIceLevel == MAX_ICE_LEVEL)
            throw new ContainerFull();

        this.currentIceLevel ++;
        return Status.SUCCESS;
    }

}
