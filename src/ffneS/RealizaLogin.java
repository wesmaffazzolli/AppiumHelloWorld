package ffneS;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RealizaLogin extends base {
	
	final static String CPF = "05352937984";
	final static String SENHA = "152315";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login"))); 
		
		driver.findElementByAndroidUIAutomator("text(\"Login\")").click();
		
		MobileElement elementCpf = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"CPF\")");
		elementCpf.sendKeys(CPF);
		
		MobileElement elementPassword = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Senha Eletrônica\")");
		elementPassword.sendKeys(SENHA);
		
		driver.findElementByAndroidUIAutomator("text(\"Entrar\")").click();
		

	}

}
