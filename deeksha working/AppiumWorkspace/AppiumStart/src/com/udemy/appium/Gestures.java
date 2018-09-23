package com.udemy.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures extends BaseClass {
	
	//@SuppressWarnings("deprecation")
	public static void longPress() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver=BaseClass.basemethod();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		//Tap Action--A mobile gesture
		
		TouchAction t=new TouchAction(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
//		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter'").click();
//		//Long press on customer adapter
//		Point point=driver.findElementByXPath("//android.widget.TextView[@text='People Names'").getLocation();
//		t.tap(PointOption.point(point.x, point.y)).perform();
//		//t.longPress(driver.findElementByXPath("//android.widget.TextView[@text='People Names'")).release().perform();
		//t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
	//t.press(pressOptions)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Gestures.longPress();
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
