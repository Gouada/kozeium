package model;

public class Device {

	private String platformVersion;
	private String deviceName;
	private boolean isUsed = false;
	private String port = "";
	private Long status = 0L;

	public Device(String deviceName, boolean isUsed, String platformVersion) {
		super();
		this.platformVersion = platformVersion;
		this.deviceName = deviceName;
		this.isUsed = isUsed;
	}

	public String getPlatformVersion() {
		return platformVersion.replace("\n", "");
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
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
}
