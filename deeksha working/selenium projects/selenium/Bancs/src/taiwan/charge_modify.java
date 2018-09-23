
package taiwan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class charge_modify {
	
		public static String RemId;
		public String chargemodify (WebDriver wd,String amnt)
		{
			try{
				wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		    
		        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		        
				 WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Outward Remittance']"));
			       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to remittance window");
				wd.switchTo().frame("panel2");
				WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
				Source_sys.sendKeys("Manual Entries-Fax");
				System.out.println("Source System is selected");
				Thread.sleep(5000);
				wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512004537");
				System.out.println("debit account entered");
				Thread.sleep(2000);
				
				
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("100");
				Thread.sleep(5000);
				System.out.println("Amount entered");
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("789456123");
				System.out.println("credit account entered");

     //save button click
				
				

				  wd.findElement(By.id("Save49")).click();
				System.out.println("Save button clicked");
				
				Alert save = wd.switchTo().alert();
				save.accept();
				Thread.sleep(2000);	

				
            	Alert remitance = wd.switchTo().alert();
				String S=remitance.getText();
				System.out.println(S);
				RemId = S.substring(S.indexOf("-") + 2);
				System.out.println(RemId);
				remitance.accept();
                


//charge details clicking			
				  WebDriverWait wait31 = new WebDriverWait(wd, 20);
			    	wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/form/div/div[3]/div/div[2]/fieldset/div/a"))).click();
					
				  System.out.println("Navigating to Charge details window");
			
			    Thread.sleep(2000);	
		
		//charge details window		
			//  WebElement webobject3= wd.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[6]/div/input"));
			    wd.switchTo().defaultContent();
			    wd.switchTo().frame("panel3");
			    System.out.println("Frame is switched");
			    
			    WebElement webobject3= wd.findElement(By.id("pim_ct_ChargesDetailstwo_wca_CHRG_AMT"));
				    
			 //   WebElement webobject3= wd.findElement(By.xpath("/html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[6]/div/input"));
			    webobject3.clear();
			  System.out.println("Charge value is cleared");
			  (webobject3).sendKeys("25");
			  wd.findElement(By.id("Save")).click();
				System.out.println("Save button is clicked");
			  
			   
			  Alert save8 = wd.switchTo().alert();
			    save8.accept();
			    System.out.println("alert ok clicked again");
			    
				
				
				
				
				
				
				
				  wd.switchTo().defaultContent();
				    wd.switchTo().frame("panel2");
				    System.out.println("Frame is switched again");
				
				wd.findElement(By.id("Save&Close50")).click();
				System.out.println("Save and close");
				Alert save2 = wd.switchTo().alert();
				save2.accept();
			//	Alert remitance = wd.switchTo().alert();
				//String S=remitance.getText();
				//System.out.println(S);
				//RemId = S.substring(S.indexOf("-") + 2);
				//System.out.println(RemId);
			//	remitance.accept();
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


