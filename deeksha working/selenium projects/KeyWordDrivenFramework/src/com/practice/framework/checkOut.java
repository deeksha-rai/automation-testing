package com.practice.framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class checkOut {
 public static WebDriver driver=homePage.driver;
 public static void checkOutDetail() throws InterruptedException, IOException
 {
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	 jse.executeScript("window.scroll(0,200)", "");
	 TakingScreenShot.takess();
	 driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	 Thread.sleep(3000);
	
	 jse.executeScript("window.scroll(0,150)", "");
	 TakingScreenShot.takess();
	 driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	 Thread.sleep(2000);
	 jse.executeScript("window.scroll(0,150)", "");
	 TakingScreenShot.takess();
	 driver.findElement(By.id("cgv")).click();
	 driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	 jse.executeScript("window.scroll(0,150)", "");
	 TakingScreenShot.takess();
	 driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
	 Thread.sleep(1000);
	 jse.executeScript("window.scroll(0,150)", "");
	 TakingScreenShot.takess();
	 driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
 }
}
