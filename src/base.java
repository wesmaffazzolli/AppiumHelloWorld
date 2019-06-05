import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		AndroidDriver<AndroidElement>  driver;
		
		// TODO Auto-generated method stub
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		
		//Appium Coded
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//1 jeito de montar quando o app está na pasta do PC
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "wesemulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//2 jeito de montar quando o app está no Dispositivo
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); //nome do device
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRMainActivity");
		//AndroidUIAutomator
		
		
		return driver;
	}

}
