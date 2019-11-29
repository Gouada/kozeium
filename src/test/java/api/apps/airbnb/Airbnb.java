package api.apps.airbnb;

import api.android.Android;
import api.apps.interfaces.Application;

import static api.apps.airbnb.AppStaticData.APP_LAUNCHER_ACTIVITY_ID;
import static api.apps.airbnb.AppStaticData.APP_PACKAGE_ID;

public class Airbnb implements Application {

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
        return ".C:\\Apks\\XING_v8.1.13.3j_apkpure.com.apk";
    }

}

