package taiwan;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Authotwardreturn {
	public void AuthNackoutward(WebDriver wd)
	{try{
		wd.findElement(By.id("userMenu")).click();
		wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	    System.out.println("menu clicked");
	    wd.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
	    WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Payments List']"));
	    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
	    System.out.println("Payment list is openned");
		Thread.sleep(4000);
		wd.switchTo().frame("panel2");
		WebElement Source_sys = wd.findElement(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNGVAL_From)"));
		Source_sys.sendKeys("111327");
		
		System.out.println("Payment eneterd");
		 wd.findElement(By.id("Search")).click();
		System.out.println("Search is clicked");
		Thread.sleep(5000);
	    wd.switchTo().defaultContent();
	    WebElement wizard = wd.findElement(By.id("wizard"));
	    wizard.click();
	    System.out.println("Wizard button clicked");
	    Thread.sleep(5000);
	    WebDriverWait wait1 = new WebDriverWait(wd, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_5"))).click();
	System.out.println("Return List is selected");	

	WebDriverWait wait3 = new WebDriverWait(wd, 20);
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[6]/ul/li[2]/label[3]/a"))).click();
	//  wd.switchTo().frame("detailTable4");  
	System.out.println("Payment id clicked");
	Thread.sleep(5000);

	WebElement wizard1 = wd.findElement(By.id("wizard"));
	wizard1.click();
	System.out.println("Wizard button clicked");
	Thread.sleep(5000);
	WebDriverWait wait2 = new WebDriverWait(wd, 20);
	wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_3"))).click();
	System.out.println("Workitem List is selected");	

	WebDriverWait wait4 = new WebDriverWait(wd, 20);
	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[4]/ul/li[2]/label[3]/a"))).click();
	//wd.switchTo().frame("detailTable4");  
	System.out.println("Payment id clicked");
	Thread.sleep(5000);

	wd.switchTo().frame("panel4");

	WebElement tabclicks = wd.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
	//commands for right click
	Actions action = new Actions(wd).contextClick(tabclicks);
	action.build().perform();
	System.out.println("right click");
	Thread.sleep(5000);
	//Authorise command:
	wd.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td/input")).click();

	 //WebDriverWait wait13 = new WebDriverWait(wd, 20);
		//wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input"))).click();
//	 	Thread.sleep(2000);
		System.out.println("Authorise is clicked");
	Thread.sleep(5000);
	wd.switchTo().defaultContent();
	wd.switchTo().frame("panel5");

	WebDriverWait wait6 = new WebDriverWait(wd, 20);
	wait6.until(ExpectedConditions.elementToBeClickable(By.id("butName_2"))).click();
	System.out.println("Authorize is performed");	
	WebDriverWait wait7 = new WebDriverWait(wd, 20);
	wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
	 System.out.println("Save is clicked");	

	 Alert save = wd.switchTo().alert();
		save.accept();
		
		wd.close();
	    
	}

	catch (InterruptedException e) {
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}





		
	}
}
