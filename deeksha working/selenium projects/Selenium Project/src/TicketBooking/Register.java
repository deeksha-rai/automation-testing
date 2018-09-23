package TicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	static WebDriver drivero=InvokingSite.driver;
	public  void newUser() throws Exception
	{
		WebElement Register=drivero.findElement(By.linkText("REGISTER"));
		Register.click();
		Thread.sleep(4000);
		WebElement firstname=drivero.findElement(By.name("firstName"));
		firstname.sendKeys("rani");
		WebElement lastname=drivero.findElement(By.name("lastName"));
		lastname.sendKeys("gupta");
		WebElement phone=drivero.findElement(By.name("phone"));
		phone.sendKeys("8752213494");
		WebElement email=drivero.findElement(By.id("userName"));
		email.sendKeys("ranigupta");
		WebElement address=drivero.findElement(By.name("address1"));
		address.sendKeys("New dlf colony");
		WebElement  city=drivero.findElement(By.name("city"));
		city.sendKeys("noida");
		WebElement state=drivero.findElement(By.name("state"));
		state.sendKeys("Uttar Pradesh");
		WebElement pincode=drivero.findElement(By.name("postalCode"));
		pincode.sendKeys("273545");
		WebElement country=drivero.findElement(By.name("country"));
		Select countryname=new Select(country);
		countryname.selectByValue("INDIA");
		WebElement username=drivero.findElement(By.name("email"));
		username.sendKeys("rani.gupta@gmail.com");
		WebElement password=drivero.findElement(By.name("password"));
		username.sendKeys("abcd@1234");
		WebElement confirmPassword=drivero.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("abcd@1234");
		WebElement submit=drivero.findElement(By.name("register"));
		submit.click();
		
	}
	public static void main(String args[])
	{
		
		InvokingSite.openSite();
		Register obj=new Register();
		try {
			obj.newUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
