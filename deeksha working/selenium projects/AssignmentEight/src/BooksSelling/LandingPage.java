package BooksSelling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
	public static void closePopUpBox()
    {
	WebElement close=Script.driver.findElement(By.xpath("/html/body/div[22]/div/div/div[1]/a"));
	close.click();
	}
	public static void MyAccountLink() throws Exception
	{
		WebElement accountlink= Script.driver.findElement(By.id("myAccountLink-old"));
	    Actions act=new Actions(Script.driver);
         act.moveToElement(accountlink).build().perform();
	}
	public static void CreateAnAccountLink()
	{
		String ParentSessionId=Script.driver.getWindowHandle();
         WebElement CreateAccountLink=Script.driver.findElement(By.linkText("Create an Account"));
         Actions act=new Actions(Script.driver);
         act.moveToElement(CreateAccountLink).click().build().perform();
         String childwindowSessionId= Script.driver.getWindowHandle();
         Script.driver.switchTo().window(childwindowSessionId);
		    }
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


