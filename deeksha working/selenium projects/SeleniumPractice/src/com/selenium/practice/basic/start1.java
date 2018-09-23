package com.selenium.practice.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class start1 {

   	WebDriver driver1;
		public void invokeBrowser()
		{
			try {
				System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome driver\\chromedriver.exe");
				driver1=new ChromeDriver();
				driver1.manage().deleteAllCookies();
				driver1.manage().window().maximize();
				driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	            driver1.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
				driver1.get("https://www.edureka.co");
				searchItem();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		public void searchItem()
		{
			driver1.findElement(By.id("homeSearchBar")).sendKeys("java");
			try {
				Thread.sleep(40000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			//driver1.findElement(By.className("nav-search-submit nav-sprite"));
		}
		public static void main(String[] args) {
			start1 obj=new start1();
			obj.invokeBrowser();

		}
 }


