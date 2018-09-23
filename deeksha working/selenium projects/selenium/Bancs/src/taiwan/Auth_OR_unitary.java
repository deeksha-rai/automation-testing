package taiwan;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auth_OR_unitary {
	public void authCTBT(WebDriver wd,String RemId)
	{
		try{
					wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        wd.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
	        System.out.println("Credit Transfer hover");
	        /*Actions action1 = new Actions(wd);
		    action1.moveToElement(event2).build().perform();*/
		    System.out.println("Navigating to remittance list");
		    WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Remittance List']"));
		    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
			System.out.println("Navigating to Remittance List");
			Thread.sleep(5000);
			System.out.println("Remittance id selected as search criteria");
			wd.switchTo().frame("panel2");
			
			WebElement ar=wd.findElement(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNGVAL_From)"));
	        //wd.findElement(By.xpath("//*[contain(text(),'Remittance')]/following-sibling :: td[1]/div/input")).sendKeys(RemId);
			//Rem.get(1).sendKeys("RemId");
			ar.sendKeys(RemId);


	        Thread.sleep(5000);
            System.out.println("remittance id entered");
            wd.findElement(By.id("Search")).click();
            Thread.sleep(1000);
            System.out.println("search button clicked");
            Thread.sleep(5000);
            wd.switchTo().defaultContent();
            WebElement wizard = wd.findElement(By.id("wizard"));
            wizard.click();
            System.out.println("Wizard button clicked");
            Thread.sleep(5000);
            
         /*   WebDriverWait wait = new WebDriverWait(wd, 20);
        	wait.until(ExpectedConditions.elementToBeClickable(By.id("tdtext3"))).click();
        	System.out.println("Work item window is clicked");*/
        	WebDriverWait wait1 = new WebDriverWait(wd, 20);
        	wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_4"))).click();
        System.out.println("Workitem details is selected");	
    
        WebDriverWait wait3 = new WebDriverWait(wd, 20);
    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[5]/ul/li[2]/label[3]/a"))).click();
      //  wd.switchTo().frame("detailTable4");  
    	System.out.println("remittance id clicked");
        Thread.sleep(5000);
       
        
       
      wd.switchTo().frame("panel3");
        
        WebElement tabclicks = wd.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
		//commands for right click
		Actions action = new Actions(wd).contextClick(tabclicks);
		action.build().perform();
		System.out.println("right click");
		Thread.sleep(5000);
		//Authorise command:
		//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
		
		 WebDriverWait wait13 = new WebDriverWait(wd, 20);
	    	wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td"))).click();
	   // 	Thread.sleep(2000);
	    	System.out.println("Authorise is clicked");
		Thread.sleep(5000);
		wd.switchTo().defaultContent();
		wd.switchTo().frame("panel4");
		WebDriverWait wait4 = new WebDriverWait(wd, 20);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys(Integer.toString(Create_CT_Rem.amount));
		System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(wd, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
		System.out.println("Authorise is performed");	
		WebDriverWait wait6 = new WebDriverWait(wd, 20);
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

