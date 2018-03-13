package calculator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities appCap = new DesiredCapabilities();
		// appCap.setBrowserName("Android");
		appCap.setCapability("BROWSER_NAME", "Android");

		appCap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		appCap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_23-Tester2");
		appCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
		/*
		 * appCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		 * "com.android.calculator2");
		 * appCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		 * "com.android.calculator2.Calculator");
		 */
		appCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.gouadadopavogui.myshoppingapp");
		appCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.example.gouadadopavogui.myshoppingapp.ui.MyShoppingCartUI");

		try {
			WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), appCap);

			driver.findElement(ByName.name("Produktliste")).click();
			driver.wait(10000);
			driver.findElement(ByName.name("Einkaufsliste")).click();
			driver.wait(10000);
			driver.findElement(ById.id("com.example.gouadadopavogui.myshoppingapp:id/publish_currentCart_floating_btn"))
					.click();

			// driver.findElement(ByName.name("3")).click();
			// driver.findElement(ByName.name("+")).click();
			// driver.findElement(ByName.name("2")).click();
			// driver.findElement(ByName.name("=")).click();

			// driver.wait(30000);

			driver.quit();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
