package com.selenium.practice.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {
 
	WebDriver driver;
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			getFunction();
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	public void getFunction()
	{
		try {
			driver.get("https://www.amazon.in");
			String title =driver.getTitle();
			System.out.println(title);	
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
		
			e.printStackTrace();
		} 
        }
	
	public static void main(String args[])
	{
		getCommands obj=new getCommands();
		obj.invokeBrowser();
	}
}
