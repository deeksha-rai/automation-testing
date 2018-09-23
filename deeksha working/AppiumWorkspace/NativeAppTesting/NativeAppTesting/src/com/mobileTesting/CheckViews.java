package com.mobileTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CheckViews {
	public static void scrollToView(AndroidDriver<AndroidElement> driver)
	{

    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		
	}
}
