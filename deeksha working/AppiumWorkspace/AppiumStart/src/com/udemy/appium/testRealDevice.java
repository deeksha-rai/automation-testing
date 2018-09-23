package com.udemy.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.apache.http.auth.MalformedChallengeException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class testRealDevice {
	

	public static  void test() throws MalformedChallengeException, MalformedURLException {
	       File appDir = new File("src");
	   
	    File app = new File(appDir, "BookMyShow Entertainment_v5.4.7_apkpure.com.apk");

	DesiredCapabilities cap=new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	 AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	//driver.findElementById("com.bt.bms:id/btnLogin").click();
//	driver.findElementById("com.bt.bms:id/btnSignUp").click();
//int s=driver.findElements(By.className("android.widget.EditText")).size();
//	System.out.println(s);
//	List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
//	a.get(0).sendKeys("Appium");
//	a.get(1).sendKeys("Mobile");
//	a.get(2).sendKeys("appium@training");
//	a.get(3).sendKeys("password");
//	driver.findElementById("com.bt.bms:id/action_icon").click();
	}
	 public static void main (String[] args)
	 {
		 try {
			testRealDevice.test();
		} catch (MalformedChallengeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
