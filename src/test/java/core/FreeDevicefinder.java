package core;

// this class has been implemented to achieve more zentralized device management
// this is a singleton class. it provide a device for each thred started from Teststarter-class
import java.util.ArrayList;

import org.apache.log4j.Level;

import model.Device;

public class FreeDevicefinder {

	public static FreeDevicefinder singleFreeDevicefinder;
	private JsonReadWriter jsonReadWriter;// = new JsonReadWriter();
	private ArrayList<Device> deviceList;

	public FreeDevicefinder() {
	}

	public static synchronized FreeDevicefinder getInstance() {
		if (singleFreeDevicefinder == null) {
			singleFreeDevicefinder = new FreeDevicefinder();
		}
		return singleFreeDevicefinder;
	}

	public synchronized void setDeviceList() {
		MyLogger.logger.setLevel(Level.DEBUG);
		MyLogger.logger.info("reading from connected device list ");
		jsonReadWriter = new JsonReadWriter();
		this.deviceList = jsonReadWriter.readFromFile();
		if (this.deviceList == null) {
			MyLogger.logger.info("device is empty");
		}
	}

	// find a device ready for test in device-list and set its status to in-use.
	// this device
	// cannot be used then parallely for another test
	public synchronized Device findReadyDevice() {
		setDeviceList();
		Device foundDevice = null;
		MyLogger.logger.info("finding free device ");
		jsonReadWriter = new JsonReadWriter();

		// for (Device device : this.deviceList) {
		int i = 0;
		while (foundDevice == null && this.deviceList.size() > i) {
			Device device = this.deviceList.get(i);
			// if free device is found go out of loop
			if (!device.isUsed() && device.getStatus() == 1) {
				foundDevice = device;
				foundDevice.setUsed(true);
				foundDevice.setStatus(2L);

				jsonReadWriter.updateList(foundDevice);
				MyLogger.logger.info("found free device " + foundDevice.getDeviceID());
				// break;
			}
			i++;
		}
		if (foundDevice == null) {
			MyLogger.logger.info("no free device found .... FreeDevicefinder");
		}
		return foundDevice;
	}

	// find a free device in device-list and set its status to in-use.
	// this device
	// cannot be used then parallely for another test
	public synchronized Device findFreeDevice() {
		setDeviceList();
		Device foundDevice = null;
		MyLogger.logger.info("finding free device ");
		jsonReadWriter = new JsonReadWriter();

		// for (Device device : this.deviceList) {
		int i = 0;
		while (foundDevice == null && this.deviceList.size() > i) {
			Device device = this.deviceList.get(i);
			// if free device is found go out of loop
			if (!device.isUsed() && device.getStatus() == 0) {
				foundDevice = device;
				foundDevice.setUsed(true);
				foundDevice.setStatus(2L);

				jsonReadWriter.updateList(foundDevice);
				MyLogger.logger.info("found free device " + foundDevice.getDeviceID());
				// break;
			}
			i++;
		}
		if (foundDevice == null) {
			MyLogger.logger.info("no free device found .... FreeDevicefinder");
		}
		return foundDevice;
	}

	public synchronized void updateDeviceInDeviceListFile(Device device) {
		jsonReadWriter = new JsonReadWriter();
		jsonReadWriter.updateList(device);
	}

	public Device waitForFreeDevice(int seconds) throws InterruptedException {
		Device freeDevice = null;
		Timer timer = new Timer();
		timer.start();
		while (!timer.isExpired(seconds) && freeDevice == null) {
			freeDevice = findFreeDevice();
			// if () {
			// break;
			Thread.sleep(20000);
		}
		return freeDevice;
	}

}
