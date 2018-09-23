package com.FlipkartTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//import org.apache.xml.utils.URI;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AndroidDriver<AndroidElement>driver;
	
	public static void setup() throws MalformedURLException
	{
		File F=new File("src");
		File fs=new File(F,"com.thunkable.android.appconmail.Flipkart_2018-02-21.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus S API 26");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BaseClass.setup();
			Loginpage.login(driver);
			OrderCapture.selectItem(driver);
			
			//CheckViews.scrollToView(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
