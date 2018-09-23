package BooksSelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void FirstName()
	{
	
		WebElement fname=Script.driver.findElement(By.id("fName"));
		fname.sendKeys("Ravi");
	}
	public static void LastName()
	{
		WebElement lname=Script.driver.findElement(By.id("lName"));
		lname.sendKeys("Gupta");
	}
	public static void Email()
	{
		WebElement email=Script.driver.findElement(By.id("email"));
		email.sendKeys("ravigupta1@gmail.com");
	}
	public static void ConfirmEmail()
	{
		WebElement confrmmail=Script.driver.findElement(By.id("confirmEmail"));
		confrmmail.sendKeys("ravigupta1@gmail.com");
	}
	public static void Password()
	{
		WebElement pwd=Script.driver.findElement(By.id("password"));
		pwd.sendKeys("Ravi@12345");
	}
	public static void ConfirmPassword()
	{
		WebElement cnfpwd=Script.driver.findElement(By.id("confPassword"));
		cnfpwd.sendKeys("Ravi@12345");
	}
	public static void SecuirtyQuestion()
	{
		WebElement securtyquestn=Script.driver.findElement(By.id("securityQuestion-replacement"));
		Select sct=new Select(securtyquestn);
		sct.selectByValue("What is your pet's name?");
	}
	public static void SecurityAnswer()
	{
		WebElement securtyans=Script.driver.findElement(By.id("securityAnswer"));
		securtyans.sendKeys("Rocky");
	}
	public static void CreateAcntlnk()
	{
		WebElement clickCreatAcnt=Script.driver.findElement(By.id("btnCreateAccount"));
		clickCreatAcnt.click();
	}
}
