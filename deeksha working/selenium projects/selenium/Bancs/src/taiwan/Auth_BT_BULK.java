package taiwan;



import java.util.List;
import java.util.concurrent.TimeUnit;

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




	public class Auth_BT_BULK {
		
		//public void authBTBULK(WebDriver wd,String OrderId)
		
		public void authBTBULK(WebDriver wd)
		{
			try{
				Thread.sleep(4000);		
				wd.findElement(By.id("userMenu")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        
		        Thread.sleep(2000);
		        wd.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
		        System.out.println("Credit Transfer hover");
		       
			    System.out.println("Navigating to remittance list");
			    Thread.sleep(2000);
			//    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Remittance List']"));
			    WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Order Master List']"));
			    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to Order Master");
				Thread.sleep(1000);
				System.out.println("Order reference selected as search criteria");
				wd.switchTo().frame("panel2");
				
				WebElement ar=wd.findElement(By.id("propertyMap(MCB_SearchWC_wca_MBRSEQNO_RNGVAL_From)"));
		        //wd.findElement(By.xpath("//*[contain(text(),'Remittance')]/following-sibling :: td[1]/div/input")).sendKeys(RemId);
				//Rem.get(1).sendKeys("RemId");
				//ar.sendKeys("110985");
				ar.sendKeys("21164");
				//ar.sendKeys(OrderId);
				
				//List<WebElement> Rem=wd.findElements(By.id("propertyMap(MCB_SearchWC_wca_MBRSEQNO_RNGVAL_From)"));
		        
				//Rem.get(1).sendKeys(OrderId);


		        Thread.sleep(1000);
	            System.out.println("remittance id entered");
	            wd.findElement(By.id("Search")).click();
	            Thread.sleep(1000);
	            System.out.println("search button clicked");
	            Thread.sleep(2000);
	            wd.switchTo().defaultContent();
	            WebElement wizard = wd.findElement(By.id("wizard"));
	            wizard.click();
	            System.out.println("Wizard button clicked");
	            Thread.sleep(2000);
	           
	        	WebDriverWait wait1 = new WebDriverWait(wd, 20);
	        	wait1.until(ExpectedConditions.elementToBeClickable(By.id("userListLabel_3"))).click();
	        System.out.println("Workitem details is selected");	
	    //
	        WebDriverWait wait3 = new WebDriverWait(wd, 20);
	    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/ul/ul/li[2]/ul/li[3]/ul/li[4]/ul/li[2]/label[3]/a"))).click();
	      //  wd.switchTo().frame("detailTable4");  
	    	System.out.println("remittance id clicked");
	       
	        Thread.sleep(5000);
           
          wd.switchTo().frame("panel3");
            
            WebElement tabclicks = wd.findElement(By.xpath("html/body/div[4]/div[2]/div[5]/div[4]/table/tbody/tr/td[7]"));
			//commands for right click
			Actions action = new Actions(wd).contextClick(tabclicks);
			action.build().perform();
			System.out.println("right click");
			//Authorise
			//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
			Thread.sleep(5000);
			  WebDriverWait wait31 = new WebDriverWait(wd, 20);
		    	wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td"))).click();
			System.out.println("Authorise is clicked");
			Thread.sleep(7000);
  	wd.switchTo().defaultContent();
			wd.switchTo().frame("panel4");
			WebDriverWait wait4 = new WebDriverWait(wd, 20);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys("400");
			System.out.println("value sent to text box");
			WebDriverWait wait5 = new WebDriverWait(wd, 20);
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
			System.out.println("Authorise is performed");	
			WebDriverWait wait6 = new WebDriverWait(wd, 20);
			wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
			 System.out.println("Save is clicked");	
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
	
	



