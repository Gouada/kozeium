package core.manager;

import java.net.URISyntaxException;

import org.apache.log4j.Level;

import core.MyLogger;

/* This  class provide information about Test-Server ie.: OS, Class Path, maven path*/
public class ServerManager {

	private static String android_home = "";
	private static String maven_bin_folder = "";
	private static String node_js_path = "";
	private static String appium_js_path = "";

	public ServerManager() {
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	public static String getServerOS() {
		// server_os = System.getenv("os_name");
		String server_os = System.getProperty("os.name");
		return server_os;
	}

	public static boolean isWindows() {
		if (getServerOS().contains("Windows")) {
			MyLogger.logger.info("Execution Server was WINDOWS");
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLinux() {
		if (getServerOS().contains("Linux")) {
			MyLogger.logger.info("Execution Server was Linux");
			return true;
		} else {
			return false;
		}
	}

	public static String getAndroidPath() {
		try {
			if (android_home == null || android_home.equals("")) {
				android_home = System.getenv("ANDROID_HOME");
				if (android_home == null) {
					MyLogger.logger.error(
							"ANDROID_HOME IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE ANDROID_HOME PATH ... ");
					throw new Exception(
							"ANDROID_HOME IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE ANDROID_HOME PATH ... ");
				}
			}
		} catch (Exception e) {
			MyLogger.logger
					.error("ANDROID_HOME IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE ANDROID_HOME PATH ... ");
		}
		return android_home;
	}

	public static String getMavenBinFolder() {
		try {
			if ((maven_bin_folder == null) || (maven_bin_folder == "")) {
				maven_bin_folder = System.getenv("M2_HOME");
				maven_bin_folder = maven_bin_folder.replace("\\", "//") + "//bin";
				if (maven_bin_folder == null) {
					MyLogger.logger.error(
							"maven_bin_folder IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE maven_bin_folder... ");
					throw new Exception(
							"maven_bin_folder IST NOT SET OR COULD NOT BE FOUND. PLEASE SET THE maven_bin_folder ... ");
				}
			}
		} catch (Exception e) {
			MyLogger.logger.error(
					"maven_bin_folder IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE maven_bin_folder... ");
			System.out.println(e.getStackTrace());
		}
		return maven_bin_folder;
	}

	public static String getNodeJSPath() {
		try {
			if (node_js_path == null || node_js_path == "") {
				node_js_path = System.getenv("NODE_JS");
				node_js_path = node_js_path.replace("\\", "//");
				//MyLogger.logger.info("node_js_path:  "+ node_js_path);
				if (node_js_path == null || node_js_path == "") {
					MyLogger.logger.error("Node_JS PATH is not set or could not befound, please set node_js path");
					throw new Exception("Node_JS PATH is not set or could not befound, please set node_js path");
				}
			}
		} catch (Exception e) {
			if (node_js_path == null || node_js_path == "") {
				MyLogger.logger.error("Node_JS PATH is not set or could not befound, please set node_js path");
				System.out.println(e.getStackTrace());
			}
		}
		return node_js_path;
	}

	public static String getAppiumJSPath() {
		try {
			if (appium_js_path == null || appium_js_path == "") {
				appium_js_path = System.getenv("APPIUM_JS").replace("\\", "//");
				//MyLogger.logger.info("appium_js_path:  "+ appium_js_path);
				if (appium_js_path == null || appium_js_path == "") {
					MyLogger.logger.error("APPIUM_JS PATH is not set or could not befound, please set node_js path");
					throw new Exception("APPIUM_JS PATH is not set or could not befound, please set node_js path");
				}
			}
		} catch (Exception e) {
			MyLogger.logger.error("APPIUM_JS PATH is not set or could not befound, please set node_js path");
			System.out.println(e.getStackTrace());
		}
		return appium_js_path;
	}

	public String getCurrentWorkingDirectory() {
		String currentDirectory = "";
		try {
			currentDirectory = this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			currentDirectory = currentDirectory.replace("\\", "//").replaceFirst("/", "").replace("kozeium.jar", "");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return currentDirectory;
	}

}
