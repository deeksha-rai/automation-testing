package taiwan;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Btbulksendback {
		
		public void authBULKBTsendback(WebDriver wd,String OrderId)
		{
			try{
				wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		        System.out.println("Credit Transfer hover");
		        
			    System.out.println("Navigating to remittance list");
			//    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Remittance List']"));
			    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Order Master']"));
			    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to Order Master");
				Thread.sleep(1000);
				System.out.println("Order reference selected as search criteria");
				wd.switchTo().frame("panel2");
				List<WebElement> Rem=wd.findElements(By.id("propertyMap(MCB_SearchWC_wca_MBRSEQNO_RNGVAL_From)"));
		        Rem.get(1).sendKeys(OrderId);


		        Thread.sleep(1000);
	            System.out.println("remittance id entered");
	            wd.findElement(By.id("Search")).click();
	            Thread.sleep(1000);
	            System.out.println("search button clicked");
	            Thread.sleep(2000);
	            wd.switchTo().defaultContent();
	            WebElement wizard = wd.findElement(By.id("stppopup_text"));
	            wizard.click();
	            System.out.println("Wizard button clicked");
	            Thread.sleep(2000);
	            WebDriverWait wait1 = new WebDriverWait(wd, 20);
	        	wait1.until(ExpectedConditions.elementToBeClickable(By.id("tdtext3"))).click();
	        System.out.println("Workitem details is selected");	
	    //
	        WebDriverWait wait3 = new WebDriverWait(wd, 20);
	    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[4]/span/table/tbody/tr[2]/td[4]/a"))).click();
	      //  wd.switchTo().frame("detailTable4");  
	    	System.out.println("remittance id clicked");
	        wd.switchTo().frame("panel3");
              WebElement tabclicks = wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]"));
			//commands for right click
			Actions action = new Actions(wd).contextClick(tabclicks);
			action.build().perform();
			System.out.println("right click");
			//Authorise
			//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
			Thread.sleep(1000);
			  WebDriverWait wait31 = new WebDriverWait(wd, 20);
		    	wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[2]/div/div/table/tbody/tr/td/input"))).click();
			System.out.println("Authorise is clicked");
			Thread.sleep(2000);
  	wd.switchTo().defaultContent();
			wd.switchTo().frame("panel4");
			WebDriverWait wait4 = new WebDriverWait(wd, 20);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/div/div/fieldset/div[3]/input"))).sendKeys("500");
			System.out.println("value sent to text box");
		
	//sendback operation
			
			WebDriverWait wait5 = new WebDriverWait(wd, 20);
		//	wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_12"))).click();
			System.out.println("Authorise is performed");	
			Thread.sleep(4000);
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("verAuth_sendback"))).click();
			System.out.println("sendback is clicked");	
			Thread.sleep(4000);
		wd.findElement(By.xpath("html/body/div[6]/div[3]/div[2]/table/tbody/tr[2]/td[2]/div/select")).sendKeys("Wrong currency");
			System.out.println("dropdown value is entered");	
				WebDriverWait wait6 = new WebDriverWait(wd, 20);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
			 System.out.println("Save is clicked");	
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
	
	



