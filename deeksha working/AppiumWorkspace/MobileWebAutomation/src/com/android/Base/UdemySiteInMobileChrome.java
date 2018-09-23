package com.android.Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class UdemySiteInMobileChrome {

	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

		// To invoke browser use following code
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.udemy.com");
		Thread.sleep(3000);
		driver.findElement(By.id("search-field-home")).sendKeys("java");
		driver.findElement(By.className("streamer-search__btn")).click();
		String title = driver.findElement(By.xpath("//*[@id=\"search-result-page-v3\"]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/a/h1")).getText();
		System.out.println(title);

	}

}
