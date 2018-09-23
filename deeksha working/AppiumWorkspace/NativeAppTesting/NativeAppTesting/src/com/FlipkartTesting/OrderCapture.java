package com.FlipkartTesting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OrderCapture {
	public static void selectItem(AndroidDriver<AndroidElement>driver)
	{
		
		System.out.println(3);
		driver.findElementByXPath("\\android.view.View[@content-desc='Fashion']").click();
		driver.findElementByXPath("\\android.view.View[@content-desc='womens-fashion-june-store']").click();
		driver.findElementByXPath("\\android.view.View[@content-desc='womens-denim-freebie-store']").click();
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(content-desc(\"womens-top-wear-store\"));");
		driver.findElementByXPath("\\android.view.View[@content-desc='womens-top-wear-store']").click();
		driver.findElementByXPath("\\android.view.View[@content-desc='womens-fashion-june-store']").click();

	}
}
