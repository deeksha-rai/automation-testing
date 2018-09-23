package com.selenium.assignmentfour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageContext {
	
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String str=driver.findElement(By.tagName("body")).getText();
			System.out.println(str);
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PageContext obj=new PageContext();
		obj.invokeBrowser();
	}

}
