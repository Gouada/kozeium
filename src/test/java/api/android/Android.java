package api.android;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverService;

import core.ADB;
import core.manager.DriverManager;
import io.appium.java_client.android.AndroidDriver;

public class Android {
	public static DriverManager driverManager = new DriverManager();
	public static AndroidDriver<WebElement> driver;
	public static ADB adb = new ADB();
	public static Apps apps = new Apps();
	public static HashMap<String, AndroidDriver<WebElement>> driverMap = new HashMap<>();
	public static HashMap<String, DriverService> driverserviceMap = new HashMap<>();
	// public int driverCounter;

}
