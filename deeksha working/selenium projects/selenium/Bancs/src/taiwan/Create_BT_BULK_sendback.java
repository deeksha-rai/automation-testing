package taiwan;

import java.awt.Robot;
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

import com.opera.core.systems.internal.input.KeyEvent;

public class Create_BT_BULK_sendback  {
	
		public static String OrderId;
		public String createBTBULKsendback (WebDriver wd,String amnt)
		{
			try{
				wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		      wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		         WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Book Transfer']"));
			       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to remittance window");
				wd.switchTo().frame("panel2");
				  WebDriverWait wait3 = new WebDriverWait(wd, 20);
			    	wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/fieldset/label[2]"))).click();
			      //  wd.switchTo().frame("detailTable4");  
			    	System.out.println("is multiple clicked");
			    	
				
				
				WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
				Source_sys.sendKeys("Manual Entries-Fax");
				System.out.println("Source System is selected");
				Thread.sleep(5000);
				
				wd.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD_label")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("file level clicked");	
				
				
				WebDriverWait wait4 = new WebDriverWait(wd, 20);
				wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/fieldset/label[7]"))).sendKeys("File Level");
				System.out.println("split method selected");
			
				
				wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512004472");
				System.out.println("debit account entered");
				Thread.sleep(2000);
		
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512003522");
				System.out.println("credit account entered");
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("100");
				System.out.println("credit amount entered");

				
				
				
				wd.findElement(By.id("butName_37")).click();

				System.out.println("Save button clicked");
				Thread.sleep(4000);
                Alert save = wd.switchTo().alert();
			    save.accept();
			    Thread.sleep(2000);
			    Alert save1 = wd.switchTo().alert();
			    save1.accept();
			    System.out.println("alert ok clicked");
			    Thread.sleep(8000);
			    WebDriverWait wait30 = new WebDriverWait(wd, 20);
		    	wait30.until(ExpectedConditions.elementToBeClickable(By.id("butName_35"))).click();
	//wd.findElement(By.id("butName_35")).click();
	// WebDriverWait wait17 = new WebDriverWait(wd, 20);
//	wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[3]/div/div[5]/fieldset/div[4]/div/input")));
                System.out.println("Insert Button clicked");
				
				Thread.sleep(1000);
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512150142");
				System.out.println("credit account entered");
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("300");
				System.out.println("credit amount entered");
				
				
				wd.findElement(By.id("butName_37")).click();
			
				WebDriverWait wait7 = new WebDriverWait(wd, 25);
				wait7.until(ExpectedConditions.alertIsPresent());
				System.out.println("Save button clicked again");
				Thread.sleep(4000);
                Alert save7 = wd.switchTo().alert();
                save7.accept();
                //Alert remittance = wd.switchTo().alert();
                
                String S=save7.getText();
				System.out.println(S);
				OrderId=S.substring(24);
				
				System.out.println(OrderId);
                
			   
			    Alert save8 = wd.switchTo().alert();
			    save8.accept();
			    System.out.println("alert ok clicked again");
			
			    wd.switchTo().defaultContent();
				
				wd.findElement(By.id("tabText_0")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        wd.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		        System.out.println("Credit Transfer hover");
		        /*Actions action1 = new Actions(wd);
			    action1.moveToElement(event2).build().perform();*/
			    System.out.println("Navigating to remittance list");
			//    WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Remittance List']"));
			    WebElement webobject10 = wd.findElement(By.xpath("//p[@title='Order Master']"));
			    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject10);
				System.out.println("Navigating to Order Master");
				Thread.sleep(1000);
				System.out.println("Order reference selected as search criteria");
				
				wd.switchTo().frame("panel3");
				System.out.println("Frame switched");
				
				Thread.sleep(5000);

				WebDriverWait wait5 = new WebDriverWait(wd, 20);
				wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/table/tbody/tr[2]/td[6]/div/input"))).sendKeys(OrderId);
		        Thread.sleep(1000);
	            System.out.println("order id entered");
	            wd.findElement(By.id("Search")).click();
	            Thread.sleep(1000);
	            System.out.println("search button clicked");
	            Thread.sleep(2000);
	            
	            
	            WebElement tabclicks = wd.findElement(By.xpath("html/body/form/div/span/fieldset/div[2]/table/tbody/tr[2]/td[2]"));
				//commands for right click
				Actions action1 = new Actions(wd).contextClick(tabclicks);
				action1.build().perform();
				System.out.println("right click");
	            
				
				Thread.sleep(4000);
				  WebDriverWait wait31 = new WebDriverWait(wd, 20);
			    	wait31.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[5]/div/table/tbody/tr[3]/td/input"))).click();
				System.out.println("Modify is clicked");
				Thread.sleep(4000);
	            
	            wd.switchTo().defaultContent();
	        	wd.switchTo().frame("panel4");
				System.out.println("Frame switched again");
				Thread.sleep(3000);
				  WebDriverWait wait50 = new WebDriverWait(wd, 20);
			    	wait50.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[3]/div/div[6]/img"))).click();
				System.out.println("remittance list button is clicked");
	          
			WebElement rem = wd.findElement(By.xpath("/html/body/form/div/div[3]/div/div[7]/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[2]"));
			Actions action = new Actions(wd).contextClick(tabclicks);
			
			
			action.doubleClick(rem).perform();
			System.out.println("remittance list is clicked");
			Thread.sleep(5000);
		//deleting one transaction	
			wd.findElement(By.id("butName_36")).click();    
			System.out.println("delete is clicked");
			Alert save4 = wd.switchTo().alert();
			save4.accept();
			System.out.println("first alert is clicked");
			Thread.sleep(2000);
			Alert save6 = wd.switchTo().alert();
			save6.accept();
			Thread.sleep(3000);
			
			System.out.println("second alert is clicked");
			wd.findElement(By.id("butName_35")).click();    
			System.out.println("insert is clicked");
			
			//inserting new transaction after delete
			
			wd.findElement(By.id("butName_35")).click();
			// WebDriverWait wait17 = new WebDriverWait(wd, 20);
//			wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[3]/div/div[5]/fieldset/div[4]/div/input")));
		                System.out.println("Insert Button clicked");
						
						Thread.sleep(1000);
						
						wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("151666009");
						System.out.println("credit account entered");
						
						wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("200");
						System.out.println("credit amount entered");
						
						
						wd.findElement(By.id("butName_37")).click();
					
						WebDriverWait wait11 = new WebDriverWait(wd, 25);
						wait11.until(ExpectedConditions.alertIsPresent());
						System.out.println("Save button clicked again");
						Thread.sleep(3000);
		                Alert save11 = wd.switchTo().alert();
		                save11.accept();
		                System.out.println("First alert clicked");
		                Thread.sleep(3000);
		                Alert save12 = wd.switchTo().alert();
		                save12.accept();
		                System.out.println("Second alert clicked");
			
			
		                Thread.sleep(3000);
			
			
			
	            wd.findElement(By.id("Save&Close50")).click();
				//wait.until(ExpectedConditions.alertIsPresent());
				System.out.println("Save and close");
				Alert save5 = wd.switchTo().alert();
				save5.accept();
				
				wd.close();
				
			}	
			
		      catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			   catch(Exception e)
			   {
				   e.printStackTrace();
			   }
	      
			return OrderId;
			
		 
		}
	}


