package model;

//Device model-Class
public class Device {

	// Android PlattformVersion
	private String platformVersion;

	private String deviceID;

	// is a test already running on the device
	private boolean isUsed = false;

	// Port on which Appium-Server instance will be started
	private String port = "";

	// current device-status (0=no test started, 1=test is about to be started,
	// 2=test running, 3=test succefully completed, 4=test failed)
	private Long status = 0L;

	// Device Language
	private String deviceLang = "de";

	public Device(String deviceID, boolean isUsed, String platformVersion) {
		super();
		this.platformVersion = platformVersion;
		this.deviceID = deviceID;
		this.isUsed = isUsed;
		this.setDeviceLang(deviceID);

	}

	public String getPlatformVersion() {
		return platformVersion.replace("\n", "");
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getDeviceLang() {
		return deviceLang;
	}

	public void setDeviceLang(String deviceLang) {
		this.deviceLang = deviceLang;
	}
}
