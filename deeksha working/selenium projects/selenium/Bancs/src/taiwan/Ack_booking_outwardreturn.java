package taiwan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Ack_booking_outwardreturn {
	public void bookingAuthNackoutward(WebDriver wd)
	{try{
	
	wd.findElement(By.id("tabText_0")).click();
	wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    System.out.println("menu clicked");
    wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Payments List']"));
    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
    System.out.println("Payment list is openned");
	Thread.sleep(4000);
	wd.switchTo().frame("panel2");
	WebElement Source_sys = wd.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td[4]/div/input"));
	Source_sys.sendKeys("10942");
	
	System.out.println("Payment eneterd");
	 wd.findElement(By.id("Search")).click();
	System.out.println("Search is clicked");
	Thread.sleep(5000);
    wd.switchTo().defaultContent();
    WebElement wizard = wd.findElement(By.id("stppopup_text"));
    wizard.click();
    System.out.println("Wizard button clicked");
    Thread.sleep(5000);
    WebDriverWait wait1 = new WebDriverWait(wd, 20);
	wait1.until(ExpectedConditions.elementToBeClickable(By.id("tdtext2"))).click();
System.out.println("Booking List is selected");	
WebDriverWait wait3 = new WebDriverWait(wd, 20);
wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[3]/span/table/tbody/tr[2]/td[4]/a"))).click();
//  wd.switchTo().frame("detailTable4");  
System.out.println("Payment id clicked");
Thread.sleep(5000);
wd.switchTo().defaultContent();
wd.switchTo().frame("panel3");
System.out.println("Panel switched");
WebElement tabclicks = wd.findElement(By.xpath("/html/body/form/div/span/fieldset/div[2]/table/tbody/tr[2]/td[7]"));
//commands for right click
Actions action = new Actions(wd).contextClick(tabclicks);
action.build().perform();
System.out.println("right click");
Thread.sleep(5000);
//Manual Ack command:
wd.findElement(By.xpath("/html/body/form/div/div[5]/div/table/tbody/tr[3]/td/input")).click();
System.out.println("Manual ack clicked");
}catch (InterruptedException e) {
	e.printStackTrace();
}
catch(Exception e)
{
	e.printStackTrace();
}
}
	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		Bancs_login BL = new Bancs_login();
		WebDriver WD2 = BL.login_screen("RPSTaipei16","P@ssw0rd");
		Ack_booking_outwardreturn ab=new Ack_booking_outwardreturn();
		ab.bookingAuthNackoutward(WD2);
	}}