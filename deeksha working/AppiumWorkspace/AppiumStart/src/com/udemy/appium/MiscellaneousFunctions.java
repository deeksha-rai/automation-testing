package com.udemy.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MiscellaneousFunctions extends BaseClass{

	public static void randomFunction() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=BaseClass.basemethod();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getContext());
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//To perform keyboard operations
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MiscellaneousFunctions.randomFunction();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
