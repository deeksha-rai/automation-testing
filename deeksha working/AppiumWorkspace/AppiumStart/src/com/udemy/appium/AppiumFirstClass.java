package com.udemy.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumFirstClass {

	public static void main(String[] args) {
		
		try {
         File f=new File("src");
         System.out.println("src");
         File fs =new File(f,"ApiDemos-debug.apk");
         DesiredCapabilities cap=new DesiredCapabilities();
         cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
         System.out.println(2);
         cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
         System.out.println(fs.getAbsolutePath());
         
			AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
		} 
		
		catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

}
