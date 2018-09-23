package FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountInFB {
	
public static void enterdetails()
{
	WebElement firstname=InvokeBrowser.driver.findElement(By.name("firstname"));
	firstname.sendKeys("sonu");

	WebElement lastname=InvokeBrowser.driver.findElement(By.name("lastname"));
	lastname.sendKeys("baghel");

	WebElement phone=InvokeBrowser.driver.findElement(By.name("reg_email__"));
	phone.sendKeys("8756361194");

	WebElement password=InvokeBrowser.driver.findElement(By.name("password"));
	password.sendKeys("Abcd@1234");

	WebElement birthDay=InvokeBrowser.driver.findElement(By.name("birthday_day"));
	Select st=new Select(birthDay);
	st.selectByValue("27");
	
	WebElement birthmonth=InvokeBrowser.driver.findElement(By.name("birthday_month"));
	Select month=new Select(birthmonth);
	month.selectByValue("10");
	
	WebElement birthYear=InvokeBrowser.driver.findElement(By.name("birthday_year"));
	Select year=new Select(birthYear);
	year.selectByValue("1993");
	
	WebElement sex=InvokeBrowser.driver.findElement(By.id("u_0_b"));
	sex.click();
	
	
	WebElement submit=InvokeBrowser.driver.findElement(By.id("websubmit"));
	submit.click();
}

}
