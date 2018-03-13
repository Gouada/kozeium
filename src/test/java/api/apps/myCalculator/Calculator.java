package api.apps.myCalculator;

import api.android.Android;
import api.apps.interfaces.Application;

public class Calculator implements Application {

	@Override
	public Object open(String deviceID) {
		try {
			Android.adb.startApp(getPackageID(), getPackageID(), deviceID);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void forceStop(String deviceID) {
		try {
			Android.adb.stopApp(getPackageID(), getLuncherActivityID(), deviceID);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public String getPackageID() {
		return "com.android.calculator2";
	}

	@Override
	public String getLuncherActivityID() {
		return "com.android.calculator2.Calculator";
	}

	@Override
	public void clearAppData(String deviceID) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getApkPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
