package api.apps.navigator;

import static api.apps.navigator.AppStaticData.APP_LAUNCHER_ACTIVITY_ID;
import static api.apps.navigator.AppStaticData.APP_PACKAGE_ID;

import api.android.Android;
import api.apps.interfaces.Application;
import api.apps.navigator.tripPlaner.TripPlaner;

public class DBNavigator implements Application {

	public TripPlaner tripPlaner = new TripPlaner();

	@Override
	public Object open(String deviceID) {
		try {
			Android.adb.startApp(APP_PACKAGE_ID, APP_LAUNCHER_ACTIVITY_ID, deviceID);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void forceStop(String deviceID) {
		try {
			Android.adb.stopApp(APP_LAUNCHER_ACTIVITY_ID, APP_LAUNCHER_ACTIVITY_ID, deviceID);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getPackageID() {
		return APP_PACKAGE_ID;
	}

	@Override
	public String getLuncherActivityID() {
		return APP_LAUNCHER_ACTIVITY_ID;
	}

	@Override
	public void clearAppData(String deviceID) {
		Android.adb.clearAppData(deviceID, getPackageID());
	}

	@Override
	public String getApkPath() {
		return "D:\\myApps\\apks\\db-navigator-16-06-p09-00.apk";
	}

}
