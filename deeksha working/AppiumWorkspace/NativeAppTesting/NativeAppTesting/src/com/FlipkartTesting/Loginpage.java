package com.FlipkartTesting;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Loginpage {
	
	public static void login(AndroidDriver<AndroidElement>driver) throws InterruptedException
	{
		
		//Not done properly
		Thread.sleep(9000);
		System.out.println(1);
		List<AndroidElement>la=driver.findElementsByClassName("android.widget.Image");
		la.get(0).click();
		System.out.println(2);
		//Thread.sleep(3000);
		//driver.findElementByClassName("android.widget.EditText").click();
//		driver.findElementByClassName("android.widget.EditText").sendKeys("deeksharai09@gmail.com");
//		driver.findElementByClassName("android.widget.EditText").click();
		
	}

}
