



package taiwan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_BOBT  {
	
		public static String RemId;
		public String createBT (WebDriver wd,String amnt)
		{
			try{
				wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        
		        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		        
				 WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Template List']"));
			       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to Template window");
				Thread.sleep(5000);
				wd.switchTo().frame("panel2");
				//wd.switchTo().frame("panel3");
				System.out.println("Frame switched");
				//wd.findElement(By.xpath("/html/body/form/div/div[3]/div[2]/input")).click();
	       	WebDriverWait wait3 = new WebDriverWait(wd, 20);
				wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[3]/div[2]/input"))).click();
				//wait3.until(ExpectedConditions.elementToBeClickable(By.id("Search"))).click();
				
				Thread.sleep(5000);
	            System.out.println("Search is clicked");
	            
				
	            Thread.sleep(9000);
	            wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	
	            WebElement tabclicks = wd.findElement(By.xpath("/html/body/form/div/span/fieldset/div[2]/table/tbody/tr[2]/td[2]"));
				//commands for right click
				Actions action = new Actions(wd).contextClick(tabclicks);
				action.build().perform();
				System.out.println("right click");
				Thread.sleep(1000);
				//wd.findElement(By.id("ct_w_RemTmpltLst_CASL_Table_m_1_5")).click();
				wd.findElement(By.xpath("html/body/form/div/div[5]/div/table/tbody/tr[5]/td/input")).click();
				 Thread.sleep(2000);
		        System.out.println("Create Remittance is clicked");
		        Thread.sleep(1000);
		        Alert save1 = wd.switchTo().alert();
			    save1.accept();
			    Thread.sleep(1000);
			    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
			    String wind1 = wd.getWindowHandle();
	            wd.switchTo().window(wind1);
	            Thread.sleep(1000);
	            System.out.println("Changing the window");
			    
		        wd.switchTo().frame("panel3");
	              
		      
		    	System.out.println("Frame switched again");
		     
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("100");
		    	//wd.findElement(By.xpath("html/body/form/div/div[5]/div/table/tbody/tr[5]/td/input")).findElement(By.tagName("input")).sendKeys("100");
		   //wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("100");
		    	System.out.println("credit amount entered");
		        
		     
		        
				
				wd.findElement(By.id("Save&Close50")).click();
				System.out.println("Save and close");
				Alert save = wd.switchTo().alert();
				save.accept();
				Alert remitance = wd.switchTo().alert();
				String S=remitance.getText();
				System.out.println(S);
				RemId = S.substring(S.indexOf("-") + 2);
				//System.out.println(RemId);
				remitance.accept();
				wd.quit();
				
			}	
			
		      catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			   catch(Exception e)
			   {
				   e.printStackTrace();
			   }
	      
			return RemId;
		 
		}
	}

	


