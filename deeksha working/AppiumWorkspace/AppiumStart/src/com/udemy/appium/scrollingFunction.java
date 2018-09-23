package com.udemy.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingFunction extends BaseClass {
	
	public static void scrollFunc() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=BaseClass.basemethod();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Remember the code as it is android code
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scrollingFunction.scrollFunc();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
