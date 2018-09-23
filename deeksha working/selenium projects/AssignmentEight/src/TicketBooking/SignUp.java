package TicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	public static void signinlink() throws Exception
	{
		WebElement signin=InvokingSite.driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]"));
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		signin.click();
	}
	public static void enterdetail() throws Exception
	{
		WebElement username=InvokingSite.driver.findElement(By.name("userName"));
		username.sendKeys("rani.gupta@gmail.com");
		WebElement password=InvokingSite.driver.findElement(By.name("password"));
		password.sendKeys("abcd@1234");
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		
		
		WebElement login=InvokingSite.driver.findElement(By.name("login"));
		login.click();
	}
	
}
