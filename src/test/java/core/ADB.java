package core;

import static core.Constants.SCREEN_SHOT_FILE_TYPE;

//this class provide utilyties for ADB-Operations
// i.e.: App-installation, providing device informations (plattform-version, device_id etc...)

import static core.constants.Constants.PATH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Level;

import core.manager.ServerManager;

public class ADB {

	private String android_plattform_path;
	private final ServerManager serverManager = new ServerManager();
	private String adbCommandString;
	private ArrayList<String> connectedDeviceIds = new ArrayList<>();
	private String deviceID = "";
	private static String SCREEENSHOTS_FOLDER = "/sdcard/screenshots/";

	public ADB() {
		// Setting logglevel
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	public ADB(String deviceID) {
		this.deviceID = deviceID;
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	public String getAndroid_plattform_path() {
		return android_plattform_path;
	}

	public void setAndroid_plattform_path(String android_plattform_path) {
		this.android_plattform_path = android_plattform_path;
	}

	public String getAdbCommandString() {
		return adbCommandString;
	}

	public void setAdbCommandString(String adbCommandString) {
		this.adbCommandString = adbCommandString;
	}

	public ArrayList<String> getConnectedDeviceIds() {
		return connectedDeviceIds;
	}

	public void setConnectedDeviceIds(ArrayList<String> connectedDeviceIds) {
		this.connectedDeviceIds = connectedDeviceIds;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public ServerManager getServerManager() {
		return serverManager;
	}

	// this method execute first a cd-command to Android-Sdk-plattform-tools
	// folder execute the provided "adbCommand" and return the server response
	// as String

	private String executeADBComannd(String adbCommand) {
		Process process;
		BufferedReader bufferedReader;
		// InputStream inPutStream;

		String outPutString = "";

		// test is executed on a windows machine
		if (serverManager.isWindows()) {
			try {

				adbCommand = adbCommand.replace("adb", serverManager.getAndroidPath() + "\\platform-tools\\adb");
				MyLogger.logger.info("executing command... " + adbCommand);
				process = Runtime.getRuntime().exec(adbCommand);
				process.waitFor();

				// save server response in a string variable this string is
				// parsed later on, i.e. to save connected devices-names in an
				// array-string
				bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
				String s;
				while ((s = bufferedReader.readLine()) != null) {
					outPutString += s + "\n";
				}
				// System.out.println("outPutString..." + outPutString);

				MyLogger.logger.info("server output " + outPutString);

			} catch (IOException e) {
				throw new RuntimeException(e.getMessage());
				// e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return outPutString;
		} else if (serverManager.isLinux()) {
			return outPutString;
		} else {
			return null;
		}

	}

	/*
	 * @Test public void test() throws Throwable { String[] test; // , test2; //
	 * try { // test2 = executeADBComannd("adb devices -l"); // test =
	 * getCurrentApp("emulator-5554"); // System.out.println("...." + test); //
	 * + test2
	 *
	 * // System.out.println("... uninstalling app"); //
	 * unInstallApp("emulator-5556", //
	 * "com.example.gouadadopavogui.myshoppingapp"); //
	 * System.out.println("... uninstalled app"); // //
	 * System.out.println("... installing app"); // installApp("emulator-5556",
	 * // "D:\\myApps\\MyShoppingApp\\app\\local", "app-release"); //
	 * System.out.println("... installed app"); // //
	 * System.out.println("... starting app"); //
	 * startApp("com.example.gouadadopavogui.myshoppingapp", //
	 * "ui.MyShoppingCartUI", "emulator-5556"); //
	 * System.out.println("... started app"); // //
	 * System.out.println("... stopping app"); //
	 * stopApp("com.example.gouadadopavogui.myshoppingapp", //
	 * "ui.MyShoppingCartUI", "emulator-5556"); //
	 * System.out.println("... stopped app"); // //
	 * System.out.println("... starting app"); //
	 * startApp("com.example.gouadadopavogui.myshoppingapp", //
	 * "ui.MyShoppingCartUI", "emulator-5556"); //
	 * System.out.println("... started app");
	 *
	 * test = getConnectedDevices(); System.out.println(test[0]);
	 * System.out.println(test[1]);
	 *
	 * } catch (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 *
	 * }
	 */
	public void startServer() {
		executeADBComannd(" adb start-server");
	}

	public void stopServer() {
		executeADBComannd(" adb kill-server");
	}

	public ArrayList<String> getConnectedDevices() {
		String outPut;
		String[] spitedOput;

		// paring server output to save only device-ids
		try {
			outPut = executeADBComannd(" adb devices");
			int i = 0;
			spitedOput = outPut.split("\n");

			for (String line : spitedOput) {
				System.out.println(":::" + line);

				line = line.trim();
				if (line.endsWith("device")) {
					connectedDeviceIds.add(line.replace("device", "").trim());
					i++;
				}
			}
			return connectedDeviceIds;
		} finally {
			// int j = 0;
			// System.out.println("..starting.....");
			// for (String dIs : connectedDeviceIds) {
			// System.out.println("DeviceId........" + dIs);
			// j++;
			// }
			// System.out.println("..done.....");
		}
	}

	public String getPlattformVersion(String deviceID) throws InterruptedException {
		String platformVersion = executeADBComannd("adb -s " + deviceID + " shell getprop ro.build.version.release");
		// System.out.println("platformVersion:" + platformVersion);
		return platformVersion;
	}

	public void installApp(String deviceID, String apkName) {
		executeADBComannd("adb -s " + deviceID + " install -r -d " + PATH + "\\" + apkName);
		MyLogger.logger.info("installed " + apkName);
	}

	public boolean isAppInstalled(String deviceID, String packageID) {
		String packageCurrent = executeADBComannd(
				" adb -s " + deviceID + " shell pm list packages | grep " + packageID);

		if (packageCurrent != null) {
			return true;
		} else {
			return false;
		}
	}

	public void unInstallApp(String deviceID, String packageID) {
		if (isAppInstalled(deviceID, packageID)) {
			executeADBComannd("adb -s " + deviceID + " uninstall " + packageID);
			MyLogger.logger.info("unstalled " + packageID);
		}
	}

	public void clearAppData(String deviceID, String packageID) {
		executeADBComannd("adb -s " + deviceID + " clear " + packageID);
		MyLogger.logger.info("cleared app " + packageID + " data");
	}

	public String getCurrentAppInForeGround(String deviceID) throws InterruptedException {
		String currentApp = executeADBComannd(
				" adb -s " + deviceID + " shell dumpsys window windows | grep mCurrentFocus");
		return currentApp;
	}

	public void startApp(String packageId, String launcherActivity, String deviceID) throws InterruptedException {
		executeADBComannd(
				" adb -s " + deviceID + " shell am start -n " + packageId + "/" + packageId + "." + launcherActivity);
		MyLogger.logger.info("started App " + launcherActivity + " on " + deviceID);
	}

	public void stopApp(String packageId, String launcherActivity, String deviceID) throws InterruptedException {
		executeADBComannd(" adb -s " + deviceID + " shell am force-stop " + packageId);
		MyLogger.logger.info("stopped " + launcherActivity);
	}

	public void moveAppToforground(String packageId, String launcherActivity, String deviceID)
			throws InterruptedException {
		executeADBComannd(" adb -s " + deviceID + " ");
	}

	public void moveAppToBackground(String packageId, String launcherActivity, String deviceID)
			throws InterruptedException {
		executeADBComannd(" adb -s " + deviceID + " ");
	}

	public void pushfile(String deviceID, String originPath, String destinationPath) throws InterruptedException {
		executeADBComannd(" adb -s " + deviceID + " push " + originPath + " " + destinationPath);
		MyLogger.logger.info("pushed from " + originPath + " to " + destinationPath);
	}

	public void pullFile(String deviceID, String filename, String destinationPath) throws InterruptedException {
		executeADBComannd(" adb -s " + deviceID + " pull " + SCREEENSHOTS_FOLDER + filename + " " + destinationPath);
		MyLogger.logger.info("pulled from " + SCREEENSHOTS_FOLDER + " to " + destinationPath);
	}

	public void takeScreenShot(String deviceID, String filename) throws InterruptedException {
		executeADBComannd("adb -s " + deviceID + " shell screencap " + SCREEENSHOTS_FOLDER + filename);
		MyLogger.logger.info("took screenshot and saved in " + SCREEENSHOTS_FOLDER + filename);
	}

	public void removeFile(String deviceID, String filename) throws InterruptedException {
		executeADBComannd("adb  -s " + deviceID + " rm -f" + SCREEENSHOTS_FOLDER + filename);
	}

	public void saveScreeenShootOnServer(String deviceID, String filename, String server_path) {
		try {
			takeScreenShot(deviceID, filename);
			pullFile(deviceID, filename, server_path);
			removeFile(deviceID, filename);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String setScreenShotFilename(String step_name) {
		Calendar timestp = Calendar.getInstance();

		// on error save screenshot under following name
		String filename = deviceID + Long.toString(timestp.getTimeInMillis()) + "_" + step_name + "."
				+ SCREEN_SHOT_FILE_TYPE;
		return filename;

	}

	public void rebootDevice(String deviceID) {
		executeADBComannd(" adb -s " + deviceID + " reboot");
		MyLogger.logger.info("device rebooted");
	}

	public String getDeviceModel(String deviceID) {
		return executeADBComannd(" adb -s " + deviceID + " shell getProp ro.product.model");
	}

	public String getSerialNumber(String deviceID) {
		return executeADBComannd("adb -s" + deviceID + " shell getProp ro.serialno");
	}

	public void unlockDevice(String deviceID) {
		executeADBComannd("adb -s " + deviceID + " shell input keyevent 82");
	}

	public void enterDevicePwd(String deviceID, String pwd) {
		executeADBComannd("adb -s " + deviceID + "shell input text " + pwd);
	}

	public void PressEnter(String deviceID) {
		executeADBComannd("adb -s " + deviceID + "shell input keyevent 66");
	}

	public void pressHomeKey(String deviceID) {
		executeADBComannd("adb -s " + deviceID + "shell keyvent 3");
	}

	public void pressBackButton(String deviceID) {
		executeADBComannd("adb -s " + deviceID + "shell keyevent 4");
	}

	public void startEmulator(String deviceName) // i.e.: Device_1
	{
		// cd back to android sdk/tools - tools foder and run
		// emulator -avd deviceName
	}

	public String getDeviceLang(String deviceID) {
		return executeADBComannd("adb -s " + deviceID + " shell getprop persist.sys.locale").replace("\n", "").trim();
	}
}
