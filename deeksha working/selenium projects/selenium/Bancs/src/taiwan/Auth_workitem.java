package taiwan;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import taiwan.Ordersummary;
public class Auth_workitem  {
public void wid1(WebDriver wd ) throws InterruptedException
{
	Thread.sleep(5000);
	System.out.println("Work item window is opened");	
	Set<String> s = wd.getWindowHandles();
	for (String windowObject : s) {
		wd.switchTo().window(windowObject);
	} 
	WebDriverWait wait = new WebDriverWait(wd, 20);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td/table/tbody/tr[4]/td[4]"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_3"))).click();
	System.out.println("Work item window is clicked");
	WebDriverWait wait1 = new WebDriverWait(wd, 20);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[4]/ul/li[2]/label[3]/a"))).click();
    System.out.println("Workitem details is selected");
	Thread.sleep(5000);
    wd.switchTo().frame("panel5");
	Actions oAction = new Actions(wd);
	WebElement ab= wd.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
	oAction.moveToElement(ab);
	oAction.contextClick(ab).build().perform();  /* this will perform right click */
	System.out.println("right click is performed");	
	Thread.sleep(5000);
	// wd.switchTo().frame("panel5");
	WebDriverWait wait10 = new WebDriverWait(wd, 20);
	wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td/input"))).click();
	System.out.println("authorise found and clicked");
	Thread.sleep(5000);
	
wd.switchTo().defaultContent();
	 wd.switchTo().frame("panel6");
	//WebElement abc= wd.findElement(By.xpath("//input[@id='ct_ct_Payments_dup_wca_ORGNL_INSTRCTD_AMT']"));
	//System.out.println("element clicked");	
	 //String txt=abc.getAttribute("title");
	//System.out.println("Value is fetched in string"+txt);	
	WebElement fcw =wd.findElement(By.id("ct_ct_Payments_dup_wca_AMT"));
	fcw.sendKeys(Ordersummary.abc);
	
	//fcw.sendKeys(Ordersummary.abc);
	//WebDriverWait wait3 = new WebDriverWait(wd, 20);
	//wait3.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT")).sendKeys(Ordersummary.abc);
	System.out.println("value sent to text box");	
	WebDriverWait wait4 = new WebDriverWait(wd, 20);
	wait4.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
	System.out.println("Authorise is performed");	
	WebDriverWait wait6 = new WebDriverWait(wd, 20);
	//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
	wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
	 System.out.println("Save is clicked");	
}
}