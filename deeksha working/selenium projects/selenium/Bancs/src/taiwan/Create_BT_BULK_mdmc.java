


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

public class Create_BT_BULK_mdmc  {
	
		public static String OrderId;
		public String createBTBULKmdmc (WebDriver wd,String amnt)
		{
			try{
				
				Thread.sleep(5000);
				wd.findElement(By.id("userMenu")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        /*WebElement event2 = wd.findElement(By.id("role0_Menu"));
		        System.out.println("Credit Transfer hover");
		        Actions action1 = new Actions(wd);
			    action1.moveToElement(event2).build().perform();*/
		        //wd.findElement(By.id("role0_Menu")).click();
		        
		        Thread.sleep(3000);
		        wd.findElement(By.xpath("//a[@title='Credit Transfer']")).click();
		        
				 WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Book Transfer']"));
			       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
				System.out.println("Navigating to remittance window");
				wd.switchTo().frame("panel2");
				

				/*	List<WebElement> is_mul = wd.findElements(By.id("ct_ct_Payments_wca_REMIT_TYPE"));
						((WebElement) is_mul).click();
						
						System.out.println("IsMultiple is selected");*/
				
				wd.findElement(By.id("ct_ct_Payments_wca_REMIT_TYPE")).click();
			      //  wd.switchTo().frame("detailTable4");  
			    	System.out.println("is multiple clicked");
			    	
				
				
				//WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
				//Source_sys.sendKeys("Manual Entries-Fax");
				//System.out.println("Source System is selected");
				Thread.sleep(5000);
				
				//split method selection:
				wd.findElement(By.id("ct_ct_Payments_wca_SPLIT_MTHD-input")).click();
				wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("file level clicked");	
				
				
				WebDriverWait wait4 = new WebDriverWait(wd, 20);
				wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[19]/div/div/ul/li[3]"))).click();
				System.out.println("split method selected as File level");
				
			/*	Select dropdown = new Select(wd.findElement(By.xpath("html/body/form/div/div/fieldset/span[5]")));
				Source_sys.sendKeys("File Level");
				System.out.println("Split method is selected");
				Thread.sleep(5000);
			//	Select dropdown = new Select(wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SPLIT_MTHD")));

			/*	WebElement Source_split = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SPLIT_MTHD_Text"));
				Source_sys.sendKeys("File Level");
				System.out.println("Split method is selected");
				Thread.sleep(5000);*/
				
				wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("014555207");
				System.out.println("debit account entered");
				Thread.sleep(2000);
			//	wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("500");
		   //Thread.sleep(5000);
			//	System.out.println("Amount entered");
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("512004626");
				System.out.println("credit account entered");
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("100");
				System.out.println("credit amount entered");

				
				//wd.findElement(By.className("grpButton"));
				
				wd.findElement(By.id("butName_41")).click();
			
			//	WebDriverWait wait = new WebDriverWait(wd, 25);
			//	wait.until(ExpectedConditions.alertIsPresent());
				System.out.println("Save button clicked");
				Thread.sleep(1000);
                Alert save = wd.switchTo().alert();
			    save.accept();
			  //  Thread.sleep(1000);
			//    Alert save10 = wd.switchTo().alert();
			//    save10.accept();
			    
			    Alert save1 = wd.switchTo().alert();
			    save1.accept();
			    System.out.println("alert ok clicked");
			    Thread.sleep(8000);
			//    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		 	 // Actions action = new Actions(wd);
		 	 //action.sendKeys(Keys.ESCAPE).build().perform();
		
	//	 WebDriverWait wait6 = new WebDriverWait(wd, 20);
//	wait6.until(ExpectedConditions.elementToBeClickable(By.id("butName_35")));
		
		 	 
		 	   
		// 	  System.out.println("Escape Button clicked");
			 //  wd.findElement(By.xpath("//span[@title='Insert']")).click();
				
		
				
				
			/*	WebDriverWait wait6 = new WebDriverWait(wd, 20);
				wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div/fieldset/label/div[13]/div/div[5]/fieldset/div[4]/div/input"))).click();
				 System.out.println("insert clicked");	*/
				
			//    Robot a = new Robot();
			//     a.keyPress(KeyEvent.VK_ENTER);
			
	//insert button clicked
	wd.findElement(By.id("butName_39")).click();
	// WebDriverWait wait17 = new WebDriverWait(wd, 20);
//	wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[3]/div/div[5]/fieldset/div[4]/div/input")));
                System.out.println("Insert Button clicked");
				
				Thread.sleep(1000);
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512004626");
				System.out.println("credit account entered");
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).findElement(By.tagName("input")).sendKeys("300");
				System.out.println("credit amount entered");
				
				
				wd.findElement(By.id("butName_41")).click();
			
				WebDriverWait wait7 = new WebDriverWait(wd, 25);
				wait7.until(ExpectedConditions.alertIsPresent());
				System.out.println("Save button clicked again");
                Alert save7 = wd.switchTo().alert();
                save7.accept();
                Alert remittance = wd.switchTo().alert();
                String S=save7.getText();
				System.out.println(S);
				OrderId=S.substring(24);
				
				System.out.println(OrderId);
                
			   
			    Alert save8 = wd.switchTo().alert();
			    save8.accept();
			    System.out.println("alert ok clicked again");
			    

			//	Alert remittance = wd.switchTo().alert();
			//	String S=remittance.getText();
				//System.out.println(S);
			//	OrderId=S.substring(4);
				
			//	RemId = S.substring(S.indexOf("-") + 2);
			//	System.out.println(OrderId);
			//	remittance.accept();
			    
				wd.findElement(By.id("Save&Close55")).click();
				//wait.until(ExpectedConditions.alertIsPresent());
				System.out.println("Save and close");
				Alert save4 = wd.switchTo().alert();
				save4.accept();
				
			//	Alert save9 = wd.switchTo().alert();
			//	save9.accept();


				
				
				wd.quit();
				
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


