package core;

//this is an utility class for writing reading and updating a json-file
// methods of this class are synchronised to avoid parallel access to file

import model.Device;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static core.constants.Constants.PORTS;

// be sure to import the correct classes of json.simple and notgoogle gson i.e.

public class JsonReadWriter {

	private final JSONParser parser = new JSONParser();
	private final JSONObject deviceListJsonObject = new JSONObject();
	// private final ServerManager serverManager = new ServerManager();
	// private final String currentderstory =
	// serverManager.getCurrentWorkingDirectory();

	/* devicesList.json is in src\main\resources */
	private String deviceListFileName = "/devicesList.json";

	// this method save connected devices into a json-file
	@SuppressWarnings("unchecked")
	public synchronized void writeToFile(ArrayList<Device> newDeviceList) {
		if (newDeviceList != null && newDeviceList.size() > 0) {
			JSONArray devices = new JSONArray();

			int i = 0;
			// iterate over a device-list and save each device with its
			// properties
			// into json-file see Device-Class for device-properties description
			for (Device device : newDeviceList) {

				JSONObject deviceProp = new JSONObject();
				// JSONObject currentDeviceCapabities = new JSONObject();

				deviceProp.put("deviceID", device.getDeviceID());
				deviceProp.put("palttfromVersion", device.getPlatformVersion());

				deviceProp.put("inUse", device.isUsed());

				// if a test was already started at this port with this device
				// then nothing to change
				if (!device.getPort().equals("")) { //device.getPort() != "" &&
					deviceProp.put("port", device.getPort());
				} else { // starting test for first time at this port
					deviceProp.put("port", PORTS[i]);
				}
				deviceProp.put("status", device.getStatus());
				deviceProp.put("deviceLang", device.getDeviceLang());
				devices.add(deviceProp);

				i++;
			}
			deviceListJsonObject.put("deviceList", devices);
			// try (FileWriter file = new FileWriter(deviceListFileName)) {

			// writing to json-file
			try {
				FileWriter file = new FileWriter(getClass().getResource(deviceListFileName).getPath());
				file.write(deviceListJsonObject.toJSONString());
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// this method read and return a device-list out of a json-file
	public synchronized ArrayList<Device> readFromFile() {
		ArrayList<Device> readDeviceList = new ArrayList<>();
		try {
			// reading from file
			Object obj = parser.parse(new FileReader(getClass().getResource(deviceListFileName).getPath()));

			// saving into JSONOBJECT
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray devicesJList;

			// get json-list
			devicesJList = (JSONArray) jsonObject.get("deviceList");

			// iterate over the json-list to create a device ArrayList
			for (Object deviceObject : devicesJList) {
				if (deviceObject != null) {
					JSONObject deviceJsonObject = (JSONObject) deviceObject;
					String device_ID = (String) deviceJsonObject.get("deviceID");
					String plattVersion = (String) deviceJsonObject.get("palttfromVersion");
					boolean inUse = (boolean) deviceJsonObject.get("inUse");
					String port = (String) deviceJsonObject.get("port");
					Long status = (Long) deviceJsonObject.get("status");
					String deviceLang = (String) deviceJsonObject.get("deviceLang");

					Device device = new Device(device_ID, inUse, plattVersion);
					device.setPort(port);
					device.setStatus(status);
					device.setDeviceLang(deviceLang);
					readDeviceList.add(device);
				}
			}
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
		return readDeviceList;
	}

	// this method update an existing json-file
	public synchronized void updateList(Device usedDevice) {
		ArrayList<Device> currentList = readFromFile();
		ArrayList<Device> updatedtList = new ArrayList<Device>();
		try {
			for (Device device : currentList) {
				if (device.getDeviceID().equals(usedDevice.getDeviceID())) {

					device = usedDevice;
					MyLogger.logger.info("updating device prop/capas..." + device.getDeviceID());
				}
				updatedtList.add(device);
			}
			writeToFile(updatedtList);
		} catch (Exception e) {
			MyLogger.logger.error("unexpected error while updating device list");
		}
	}
}
