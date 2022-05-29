package sr.ice.client;
// **********************************************************************
//
// Copyright (c) 2003-2019 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import SmartHome.*;
import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;
import com.zeroc.Ice.ObjectPrx;
import com.zeroc.Ice.LocalException;

public class IceClient
{
//	public static void main(String[] args) throws IOException {
//		int status = 0;
//		Communicator communicator = null;
//
//		try {
//			// 1. Inicjalizacja ICE
//			communicator = Util.initialize(args);
//
//			// 2. Uzyskanie referencji obiektu na podstawie linii w pliku konfiguracyjnym (wówczas aplikacjê nale¿y uruchomiæ z argumentem --Ice.config=config.client)
//			//ObjectPrx base1 = communicator.propertyToProxy("Calc1.Proxy");
//
//			// 2. To samo co powy¿ej, ale mniej ³adnie
//
//
//
//			if (tv1 == null || musicPlayer == null
//					|| tvS1 == null || fridge == null || bigFridge == null || thermometer == null)
//				throw new Error("Invalid proxy");
//
//			String line = null;
//			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
//
//			do {
//				try {
//					System.out.println("Enter device ID");
//					line = in.readLine();
//
//					if (line.equals("tv1") || line.equals("musicPlayer1") || line.equals("tvSmart1")) {
//						String deviceId = line.toString();
//						System.out.println("Enter device command");
//						line = in.readLine();
//						System.out.println(deviceId + " " + line + ": ");
//						if (line.equals("turn on"))
//							System.out.println(multimediaDevices.get(deviceId).getReference().turnOn());
//						else if (line.equals("turn off"))
//							System.out.println(multimediaDevices.get(deviceId).getReference().turnOff());
//						else if (line.equals("get state"))
//							System.out.println(multimediaDevices.get(deviceId).getReference().getState());
//						else if (line.equals("opened app") && deviceId.equals("tvSmart1"))
//							System.out.println(tvS1.openedApp());
//						else if (line.equals("get list") && deviceId.equals("tvSmart1"))
//							System.out.println(tvS1.getApplicationsList());
//						else if (line.equals("open app") && deviceId.equals("tvSmart1")) {
//							System.out.println("Enter app name: ");
//							line = in.readLine();
//							try {
//								System.out.println(tvS1.openApp(line));
//							} catch (NotFound e) {
//								System.out.println("App not found. Enter one of belows!");
//								System.out.println(Arrays.toString(tvS1.getApplicationsList()));
//							}
//						} else
//							System.out.println("???");
//
//
//					} else {
//						System.out.println("???");
//					}
//
//				} catch (java.io.IOException ex) {
//					System.err.println(ex);
//				} catch (com.zeroc.Ice.TwowayOnlyException ex) {
//					System.err.println(ex);
//				} catch (DeviceTurnedOff e) {
//					System.out.println("Device is turned off! To turn it on enter 'turn on'.");
//				}
//			}while (!line.equals("x")) ;
//
//
//		} catch (LocalException e) {
//			e.printStackTrace();
//			status = 1;
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//			status = 1;
//		}
//		if (communicator != null) { //clean
//			try {
//				communicator.destroy();
//			} catch (Exception e) {
//				System.err.println(e.getMessage());
//				status = 1;
//			}
//		}
//		System.exit(status);
//	}

}