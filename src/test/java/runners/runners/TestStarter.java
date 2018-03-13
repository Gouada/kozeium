package runners.runners;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.bcel.verifier.exc.AssertionViolatedException;

import core.ADB;
import core.CapabilitiesDevice;
import core.JsonReadWriter;
import core.MyLogger;
import core.manager.ServerManager;
import model.Device;

public class TestStarter {

	private static ArrayList<Device> devices;
	private final static ADB adb = new ADB();
	private static JsonReadWriter jsonRW = new JsonReadWriter();

	public static void main(String[] args) throws Throwable {
		try {
			startSameTestOnMultipleDevices("TripPlanerRunner");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getDeviceList() {
		ArrayList<String> connectedDevicesNames = null;
		String plattformVersion = "";
		Device device;

		connectedDevicesNames = adb.getConnectedDevices();
		if (connectedDevicesNames != null) {
			MyLogger.logger.info("Connected devices found. Starting creating list of connected devices");
			devices = new ArrayList<>();
			for (String deviceID : connectedDevicesNames) {
				try {
					plattformVersion = adb.getPlattformVersion(deviceID);
					device = new Device(deviceID, false, plattformVersion);

					devices.add(device);
					MyLogger.logger.info("added " + deviceID + " to device list");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			jsonRW.writeToFile(devices);
		} else {
			MyLogger.logger.warn("No connected device found");
			throw new AssertionViolatedException("No connected device found");
		}
	}

	public static void startSameTestOnMultipleDevices(String testClassName) throws Throwable {
		String command;
		final String finalCommand;
		Process process;
		int i = 0;
		CapabilitiesDevice capas;
		MyLogger.logger.info("Starting Test cases from " + testClassName);
		getDeviceList();
		command = ServerManager.getMavenBinFolder();
		command = command + "//mvn.bat -Dtest=" + testClassName + " test";
		finalCommand = command;
		ArrayList<Device> deviceList = jsonRW.readFromFile();
		if (deviceList.size() > 0) {
			for (Device device : deviceList) {
				if (!device.isUsed() && device.getStatus() < 1L) {

					// process = Runtime.getRuntime().exec(finalCommand);
					// process.waitFor();
					// device.setStatus(1L);
					// jsonRW.updateList(device);

					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							// process =
							try {
								Runtime.getRuntime().exec(finalCommand);
								// device.setUsed(true);
								device.setStatus(1L);
								jsonRW.updateList(device);
							} catch (IOException e) {
								e.printStackTrace();
							}
							// process.waitFor();
						}
					});
					thread.start();
				}
				// else {
				// continue;
				// }
				i++;
			}
		} else {
			MyLogger.logger.debug("Device liste is empty");
			throw new Exception("Device liste is empty");
		}
	}

	public static CapabilitiesDevice getCapas(Device device, String appPackage, String appActivity) {
		CapabilitiesDevice capas = new CapabilitiesDevice(device.getPlatformVersion(), device.getDeviceName(),
				appPackage, appActivity, null);
		return capas;
	}
}
