package com.udemy.e2eTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {
	public static void setCapabilitesApp() throws MalformedURLException, InterruptedException {
		File f=new File("src");
		File fs=new File(f,"BookMyShow Entertainment_v5.4.7_apkpure.com.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver <AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(5000);
//		driver.findElementByXPath("android.widget.EditText[@text='Email or phone']").sendKeys("deeksharai09");
//		driver.findElementById("identifierNext").click();
//		driver.findElementByXPath("android.widget.EditText[@text='Enter your password']").sendKeys("Imfhry@de80");
//		driver.findElementById("passwordNext").click();
//		driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.findElementById("com.raaga.android:id/skip_login_btn").click();
		//driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(index(\"11\"));");
		
		
		
	
	}
	public static void main(String[] args) throws InterruptedException
	{
		try {
			Capabilities.setCapabilitesApp();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
