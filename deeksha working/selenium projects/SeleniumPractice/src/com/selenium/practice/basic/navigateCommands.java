package com.selenium.practice.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {
	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chrome driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			navigateFunction();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void navigateFunction() {
		try {
			driver.get("https://www.amazon.in");
			System.out.println("Hi");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("microwave oven");
			System.out.println("hello");
			driver.findElement(By.className("nav-input")).click();
			System.out.println("by");
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("2");
			driver.navigate().forward();
			driver.navigate().refresh();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		navigateCommands obj = new navigateCommands();
		obj.invokeBrowser();
	}
}
