package com.mobileTesting;

import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class PreferencesPage {

	
	public static void clickOnPrefernces(AndroidDriver<AndroidElement> driver)
	{
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
	//List of elements present on Preferences Page
		List<AndroidElement> la=driver.findElementsById("android:id/text1");
		for(AndroidElement i:la)
		{
			System.out.println(i.getText());
		}
		try {
			WorkingOnPrefrencesXML(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void  WorkingOnPrefrencesXML(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		//System.out.println("1");
		driver.findElementByXPath("//android.widget.TextView[@text='1. Preferences from XML']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Edit text preference']").click();
		driver.findElementById("android:id/edit").sendKeys("Deeksha");
		driver.findElementById("android:id/button1").click();
		driver.findElementByXPath("//android.widget.TextView[@text='List preference']").click();
		List<AndroidElement> list=driver.findElementsByClassName("android.widget.CheckedTextView");
		System.out.println(list.get(1).getText());
		list.get(1).click();
		driver.findElementByXPath("//android.widget.TextView[@text='Screen preference']").click();
		driver.findElementById("android:id/checkbox").click();
		
		//go Back
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Parent checkbox preference\"));");
		driver.findElementById("android:id/checkbox").click();
		
//		driver.findElementByXPath("//android.widget.TextView[@text='Chrome']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='ALWAYS']").click();
//		driver.pressKeyCode(AndroidKeyCode.BACK);
////		driver.findElementByXPath("new UiScrollable(new UiSelector.scrollIntoView(//android.widget.TextView[@text='Parent checkbox preferences']));");
		driver.findElementByXPath("//android.widget.CheckBox[@checked='false']").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}
	
}
