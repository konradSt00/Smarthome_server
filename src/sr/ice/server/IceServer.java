package sr.ice.server;
import SmartHome.ObjectProxy;
import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;
import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.Identity;
import sr.ice.server.Fridges.BigFridgeI;
import sr.ice.server.Fridges.FridgeI;
import sr.ice.server.MultimediaDevices.MultimediaDeviceI;
import sr.ice.server.MultimediaDevices.MusicPlayerI;
import sr.ice.server.MultimediaDevices.TvSmartI;
import sr.ice.server.Thermometers.ThermometerI;

import java.util.Arrays;

public class IceServer
{
	public static int id = 2;

	public static int port = 10000 + id;
	public static void createServants(ObjectProxy[] availableDevices, ObjectAdapter adapter){
		Arrays.stream(availableDevices).forEach(device ->{
			if(device.category.equals("MD")){
				adapter.add(new MultimediaDeviceI(), new Identity(device.name, device.category));
			}
			else if(device.category.equals("MP")){
				adapter.add(new MusicPlayerI(), new Identity(device.name, device.category));
			}
			else if(device.category.equals("TVS")){
				adapter.add(new TvSmartI(), new Identity(device.name, device.category));
			}
			else if(device.category.equals("F")){
				adapter.add(new FridgeI(), new Identity(device.name, device.category));
			}
			else if(device.category.equals("BF")){
				adapter.add(new BigFridgeI(), new Identity(device.name, device.category));
			}
			else if(device.category.equals("T")){
				adapter.add(new ThermometerI(), new Identity(device.name, device.category));
			}
		});
	}
	public void t1(String[] args)
	{
		int status = 0;
		Communicator communicator = null;

		try	{
			// Init
			communicator = Util.initialize(args);
			String address = "tcp -h 127.0.0.2 -p "+port+" -z : udp -h 127.0.0.2 -p "+port+" -z";
			ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints(
					"Adapter1", address);

			// Defining object/devices
			ObjectProxy[] availableDevices = new ObjectProxy[7];
			availableDevices[0] = new ObjectProxy("tv" + id, "MD", address);
			availableDevices[1] = new ObjectProxy("musicPlayer" + id, "MP", address);
			availableDevices[2] = new ObjectProxy("tvSmart"+ id, "TVS", address);
			availableDevices[3] = new ObjectProxy("fridge" + id, "F", address);
			availableDevices[4] = new ObjectProxy("bigFridge" + id, "BF", address);
			availableDevices[5] = new ObjectProxy("thermometer" + id, "T", address);
			availableDevices[6] = new ObjectProxy("util" + id, "Util", address);

			//Util servant
			DevicesUtilI devicesUtilServant = new DevicesUtilI();
			devicesUtilServant.availableDevices = availableDevices;

			//Devices servants
			createServants(availableDevices, adapter);
			adapter.add(devicesUtilServant, new Identity("util" + id, "Util"));

			adapter.activate();
			System.out.println("Entering event processing loop...");
			communicator.waitForShutdown(); 		
			
		}
		catch (Exception e) {
			System.err.println(e);
			status = 1;
		}
		if (communicator != null) {
			try {
				communicator.destroy();
			}
			catch (Exception e) {
				System.err.println(e);
				status = 1;
			}
		}
		System.exit(status);
	}


	public static void main(String[] args)
	{
		IceServer app = new IceServer();
		app.t1(args);
	}
}
