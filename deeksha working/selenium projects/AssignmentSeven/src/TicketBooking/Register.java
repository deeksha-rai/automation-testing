package TicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	//static WebDriver InvokingSite.driver=InvokingSite.driver;
	public static  void newUser() throws Exception
	{
		WebElement Register=InvokingSite.driver.findElement(By.linkText("REGISTER"));
		Register.click();
		Thread.sleep(4000);
		WebElement firstname=InvokingSite.driver.findElement(By.name("firstName"));
		firstname.sendKeys("rani");
		WebElement lastname=InvokingSite.driver.findElement(By.name("lastName"));
		lastname.sendKeys("gupta");
		WebElement phone=InvokingSite.driver.findElement(By.name("phone"));
		phone.sendKeys("8752213494");
		WebElement email=InvokingSite.driver.findElement(By.id("userName"));
		email.sendKeys("ranigupta");
		WebElement address=InvokingSite.driver.findElement(By.name("address1"));
		address.sendKeys("New dlf colony");
		WebElement  city=InvokingSite.driver.findElement(By.name("city"));
		city.sendKeys("noida");
		WebElement state=InvokingSite.driver.findElement(By.name("state"));
		state.sendKeys("Uttar Pradesh");
		WebElement pincode=InvokingSite.driver.findElement(By.name("postalCode"));
		pincode.sendKeys("273545");
		WebElement country=InvokingSite.driver.findElement(By.name("country"));
		Select countryname=new Select(country);
		countryname.selectByValue("92");
		JavascriptExecutor jse=(JavascriptExecutor)InvokingSite.driver;
		jse.executeScript("scroll(0,200)", "");
		Thread.sleep(1000);
		WebElement username=InvokingSite.driver.findElement(By.name("email"));
		username.sendKeys(" rani.gupta@gmail.com");
		WebElement password=InvokingSite.driver.findElement(By.name("password"));
		password.sendKeys("abcd@1234");
		
		WebElement confirmPassword=InvokingSite.driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("abcd@1234");
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		
		WebElement submit=InvokingSite.driver.findElement(By.name("register"));
		submit.click();
		
	}
	
	}


