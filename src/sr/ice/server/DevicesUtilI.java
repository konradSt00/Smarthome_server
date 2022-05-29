package sr.ice.server;

import SmartHome.DevicesUtil;
import SmartHome.ObjectProxy;
import com.zeroc.Ice.Current;
import com.zeroc.Ice.ObjectPrx;

public class DevicesUtilI implements DevicesUtil {
    int N = 10;
    ObjectProxy[] availableDevices = new ObjectProxy[N];
    @Override
    public ObjectProxy[] getAvailableDevices(Current current) {
        return this.availableDevices;
    }
}
