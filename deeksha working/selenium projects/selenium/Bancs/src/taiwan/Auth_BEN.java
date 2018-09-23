
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
public class Auth_BEN {
		
		
		public static String Amt1,Amt2;
		

		public void authCTBT(WebDriver wd,String RemId)
	
		{
			try{
					wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		        System.out.println("Credit Transfer hover");
		        /*Actions action1 = new Actions(wd);
			    action1.moveToElement(event2).build().perform();*/
			    System.out.println("Navigating to remittance list");
			    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Remittance List']"));
			    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to Remittance List");
				Thread.sleep(1000);
				System.out.println("Remittance id selected as search criteria");
				wd.switchTo().frame("panel2");
				
				List<WebElement> Rem=wd.findElements(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNGVAL_From)"));
		        //wd.findElement(By.xpath("//*[contain(text(),'Remittance')]/following-sibling :: td[1]/div/input")).sendKeys(RemId);
				//Rem.get(1).sendKeys("RemId");
			//	Rem.get(1).sendKeys(RemId);
				Rem.get(1).sendKeys(RemId);

		        Thread.sleep(1000);
	            System.out.println("remittance id entered");
	            wd.findElement(By.id("Search")).click();
	            Thread.sleep(1000);
	            System.out.println("search button clicked");
	            Thread.sleep(2000);
	            
	            WebElement webobject2 = wd.findElement(By.xpath("/html/body/form/div/span/fieldset/div[2]/table/tbody/tr[2]/td[6]"));   
	            String abc=webobject2.getAttribute("svrVal");
	            
	            System.out.println("amount is "+abc);
	            
	            
	            wd.switchTo().defaultContent();
	            WebElement wizard = wd.findElement(By.id("stppopup_text"));
	            wizard.click();
	            System.out.println("Wizard button clicked");
	            Thread.sleep(2000);
	            
	        
	        	WebDriverWait wait1 = new WebDriverWait(wd, 20);
	        	wait1.until(ExpectedConditions.elementToBeClickable(By.id("tdtext4"))).click();
	        System.out.println("Workitem details is selected");	
	  
	        WebDriverWait wait3 = new WebDriverWait(wd, 20);
	    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[19]/div/div/div[3]/div[3]/table[2]/tbody/tr/td[3]/table/tbody/tr/td[5]/span/table/tbody/tr[2]/td[4]/a"))).click();
	   
	    	System.out.println("remittance id clicked");
	       
	        Thread.sleep(3000);
	        wd.switchTo().defaultContent();
          wd.switchTo().frame("panel3");
            
            WebElement tabclicks = wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]"));
			//commands for right click
			Actions action = new Actions(wd).contextClick(tabclicks);
			action.build().perform();
			
			System.out.println("right click");
			Thread.sleep(2000);
		//	wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();
			WebDriverWait wait10 = new WebDriverWait(wd, 20);
			
			wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input"))).click();
			
			Thread.sleep(2000);
			System.out.println("Authorise is clicked");
			
			wd.switchTo().defaultContent();
			wd.switchTo().frame("panel4");
			
			Thread.sleep(3000);
			System.out.println("Frame switched");
			
		
			WebDriverWait wait4 = new WebDriverWait(wd, 20);
			wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/div/div/fieldset/div[3]/input"))).sendKeys(abc);
			System.out.println("value sent to text box");
			WebDriverWait wait5 = new WebDriverWait(wd, 20);
			wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_12"))).click();
			System.out.println("Authorise is performed");	
			WebDriverWait wait6 = new WebDriverWait(wd, 20);
			wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
			 System.out.println("Save is clicked");	
			
				wd.findElement(By.xpath("//*[contain(text(),'Remittance')]/following-sibling :: td[1]/div/input")).sendKeys("90166");
		        Thread.sleep(1000);
	            System.out.println("remittance id entered");
	            wd.findElement(By.id("Search")).click();
	            Thread.sleep(1000);
	            System.out.println("search button clicked");
		  	
	            (new WebDriverWait(wd, 100)).until(new ExpectedCondition<Boolean>() {
	    			public Boolean apply(WebDriver driver) {
	    				try {
	    					
	    					
	    					WebElement tabclicks = driver.findElement(By.id("pf_w_RemSearch_Table"));
	    					
	    					//commands for right click
	    					Actions action = new Actions(driver).contextClick(tabclicks);
	    					action.build().perform();
	    					
	    					System.out.println("right click");
	    					Thread.sleep(500);
	    					//WebElement we = driver.findElement(By.id("pf_w_RemSearch_Table_m_1_4"));
	    					for (int i=0;i<3;i++){
	    						action.sendKeys(Keys.ARROW_DOWN).build().perform();
	    					}
	    					
	    					action.sendKeys(Keys.RETURN).build().perform();
	    					System.out.println("right click return");
	    					
	    					return true;
	    				} catch (Exception e) {
	    					return false;
	    				}
	    			}
	    		});
	            
	            String wind1 = wd.getWindowHandle();
	            wd.switchTo().window(wind1);
	            Thread.sleep(1000);
	            System.out.println("Changing the window");
	            wd.switchTo().frame("panel3");
	            Thread.sleep(1000);
	            System.out.println("Changing the frame");
	            wd.findElement(By.id("Authorise73")).click();
	            System.out.println("authorized button clicked");
	            wd.findElement(By.id("image1")).click();
	            System.out.println("txn authorized");
	            Thread.sleep(1000);
	            wd.switchTo().alert().accept();
	            Thread.sleep(1000);
	            System.out.println("txn successful OK");
	            String wind2 = wd.getWindowHandle();
	            wd.switchTo().window(wind2);
	            Thread.sleep(1000);
	            System.out.println("Changing the window");
	            wd.switchTo().frame("panel2");
	            //Thread.sleep(2000);
	            System.out.println("Changing the frame");
	            wd.findElement(By.id("Search")).click();
	    		//Thread.sleep(2000);
	    		System.out.println("search button clicked");  
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
	



