/**
 *
 */
package runners;

import java.io.IOException;

import core.FreeDevicefinder;
import model.Device;

/**
 * @author gouadadopavogui
 *
 */
public class TestStarterThread extends Thread {

	private final String command;
	private final Device device;

	// private String threadName;
	/**
	 *
	 */
	public TestStarterThread(String command, Device device) {
		this.command = command;
		this.device = device;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			// starting cucumber runner-class in a separate
			// thread
			Runtime.getRuntime().exec(command);

			// set device status to "test execution
			// starting"
			device.setStatus(1L);
			FreeDevicefinder.getInstance().updateDeviceInDeviceListFile(device);
			// update device status in device list
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
