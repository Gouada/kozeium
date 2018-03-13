package api.apps.interfaces;

public interface Application {

	public Object open(String deviceID);

	public void forceStop(String deviceID);

	public String getPackageID();

	public String getLuncherActivityID();

	public void clearAppData(String deviceID);

	public String getApkPath();

}
