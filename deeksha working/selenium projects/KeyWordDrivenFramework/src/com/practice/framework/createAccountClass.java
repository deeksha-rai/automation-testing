package com.practice.framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createAccountClass {

	public static WebDriver driver=homePage.driver;
	public static void provideDetail() throws InterruptedException, IOException
	{ Thread.sleep(3000);
		WebElement title =driver.findElement(By.id("id_gender2"));
		title.click();
		WebElement frstNm=driver.findElement(By.id("customer_firstname"));
		frstNm.sendKeys(valueReadingClass.FirstNm);
		WebElement lastNm=driver.findElement(By.id("customer_lastname"));
		lastNm.sendKeys(valueReadingClass.LastNM);
		WebElement pwd=driver.findElement(By.id("passwd"));
		pwd.sendKeys(valueReadingClass.Password);
		
		Select days=new Select(driver.findElement(By.id("days")));
		String day=Integer.toString(valueReadingClass.DOBDay);
		days.selectByValue(day);
		Select moths=new Select(driver.findElement(By.id("months")));
		String month=Integer.toString(valueReadingClass.DOBMonth);
		moths.selectByValue(month);
		Select years=new Select(driver.findElement(By.id("years")));
		String yr=Integer.toString(valueReadingClass.DOBYear);
		years.selectByValue(yr);
		TakingScreenShot.takess();
		
	 driver.findElement(By.id("firstname")).sendKeys(valueReadingClass.Fname);
	 driver.findElement(By.id("lastname")).sendKeys(valueReadingClass.Lname);
	 driver.findElement(By.id("company")).sendKeys(valueReadingClass.Company);
	 driver.findElement(By.id("address1")).sendKeys(valueReadingClass.Address);
	driver.findElement(By.id("city")).sendKeys(valueReadingClass.City);
	Select state=new Select(driver.findElement(By.id("id_state")));
	String stat=Integer.toString(valueReadingClass.State);
	state.selectByValue(stat);
	String pin=Integer.toString(valueReadingClass.PinCode);
	driver.findElement(By.id("postcode")).sendKeys(pin);
	String phn=Integer.toString(valueReadingClass.PhnNumb);
	driver.findElement(By.id("phone_mobile")).sendKeys(phn);
	driver.findElement(By.id("alias")).sendKeys(valueReadingClass.Alias);
	TakingScreenShot.takess();
	driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
}
}