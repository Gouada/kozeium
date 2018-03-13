package core;

import static core.constants.Constants.PORTS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.Device;

public class JsonReadWriter {

	private final JSONParser parser = new JSONParser();
	private final JSONObject deviceListJsonObject = new JSONObject();
	private Device device;
	private CapabilitiesDevice deviceCcapas;
	private final ArrayList<Device> deviceList = new ArrayList<>();

	public static String deviceListFileName = "src/test/resources/devicesList.json";
	// public static String deviceCapasFileName =
	// "src/test/resources/deviceCapasList.json";

	@SuppressWarnings("unchecked")
	public synchronized void writeToFile(ArrayList<Device> newDeviceList) {
		if (newDeviceList != null && newDeviceList.size() > 0) {
			JSONArray devices = new JSONArray();
			// JSONArray devicesCapabilities = new JSONArray();

			int i = 0;
			for (Device device : newDeviceList) {

				JSONObject deviceProp = new JSONObject();
				JSONObject currentDeviceCapabities = new JSONObject();

				deviceProp.put("deviceID", device.getDeviceName());
				deviceProp.put("palttfromVersion", device.getPlatformVersion());

				deviceProp.put("inUse", device.isUsed());
				if (!device.getPort().equals("") && device.getPort() != "") {
					deviceProp.put("port", device.getPort());
				} else {
					deviceProp.put("port", PORTS[i]);
				}
				deviceProp.put("status", device.getStatus());
				devices.add(deviceProp);

				// currentDeviceCapabities = deviceProp;
				// currentDeviceCapabities.put("appPackage", Package);
				// currentDeviceCapabities.put("appLuncherActivity", activity);
				// currentDeviceCapabities.put("port", i);
				// devicesCapabilities.add(currentDeviceCapabities.toJSONString());
				i++;
			}
			deviceListJsonObject.put("deviceList", devices);
			try (FileWriter file = new FileWriter(deviceListFileName)) {

				file.write(deviceListJsonObject.toJSONString());
				file.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}

			// System.out.print("JsonFile file output" + deviceListJsonObject);
		}
	}

	public synchronized ArrayList<Device> readFromFile() {
		ArrayList<Device> readDeviceList = new ArrayList<>();
		try {
			Object obj = parser.parse(new FileReader(deviceListFileName));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray devicesJList = new JSONArray();
			devicesJList = (JSONArray) jsonObject.get("deviceList");

			for (Object deviceObject : devicesJList) {
				if (deviceObject != null) {
					JSONObject deviceJsonObject = (JSONObject) deviceObject;
					String device_name = (String) deviceJsonObject.get("deviceID");
					String plattVersion = (String) deviceJsonObject.get("palttfromVersion");
					boolean inUse = (boolean) deviceJsonObject.get("inUse");
					String port = (String) deviceJsonObject.get("port");
					Long status = (Long) deviceJsonObject.get("status");

					Device device = new Device(device_name, inUse, plattVersion);
					device.setPort(port);
					device.setStatus(status);
					readDeviceList.add(device);

					// System.out.println(device_name + " " + inUse + " .... " +
					// plattVersion);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// this.deviceList.sort(new Comparator<new >);
		return readDeviceList;
	}

	public synchronized void updateList(Device usedDevice) {
		ArrayList<Device> currentList = readFromFile();
		ArrayList<Device> updatedtList = new ArrayList<Device>();
		for (Device device : currentList) {
			if (device.getDeviceName().equals(usedDevice.getDeviceName())) {

				device = usedDevice;
				MyLogger.logger.info("updating device prop/capas...");
			}
			updatedtList.add(device);
		}
		writeToFile(updatedtList);
	}
}
