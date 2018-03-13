package core.manager;

import org.apache.log4j.Level;

import core.MyLogger;

public class ServerManager {

	private static String server_os;
	private static String android_home = "";
	private static String maven_bin_folder = "";

	public ServerManager() {
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	public static String getServerOS() {
		// server_os = System.getenv("os_name");
		server_os = System.getProperty("os.name");
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

	public static String getAndroidPath() throws Throwable {

		if (android_home == null || android_home.equals("")) {
			android_home = System.getenv("ANDROID_HOME");
			if (android_home == null) {
				MyLogger.logger.debug(
						"ANDROID_HOME IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE ANDROID_HOME PATH ... ");
				throw new Exception(
						"ANDROID_HOME IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE ANDROID_HOME PATH ... ");
			}
		}
		android_home = "D:\\NonBKU\\Android-sdk-windows";
		return android_home;
	}

	public static String getMavenBinFolder() throws Exception {
		if (maven_bin_folder == null || maven_bin_folder == "") {
			maven_bin_folder = System.getenv("M2_HOME");
			maven_bin_folder = maven_bin_folder.replace("\\", "//") + "//bin";
			if (maven_bin_folder == null) {
				MyLogger.logger.debug(
						"maven_bin_folder IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE maven_bin_folder... ");
				throw new Exception(
						"maven_bin_folder IST NOT SET OR 	COULD NOT BE FOUND. PLEASE SET THE maven_bin_folder ... ");
			}
		}
		// maven_bin_folder =
		// "D:\SDE\SDC\LunaRiM\binary\org.apache.maven.3.0.4.win_3.0.4/bin";
		return maven_bin_folder;
	}

}
