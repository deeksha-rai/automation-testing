

package taiwan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;


public class Create_BT  {
	
		public static String RemId;
		
		static DateFormat dateFormat = new SimpleDateFormat("mmss");
	    static Date date = new Date();
		public static final int amount = Integer.parseInt((dateFormat.format(date)));
	    public String createBT (WebDriver wd)
		{
			
			// String text;
			try{
				
				Thread.sleep(3000);
				//wd.findElement(By.xpath("//*[@id='userMenu']")).click(); 
				wd.findElement(By.id("userMenu")).click();
				//wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		        System.out.println("menu clicked");
		        
		       // driver.findElement(By.id("userMenu")).click();
			 	wd.findElement(By.xpath("//*[@id='firstLevelWrapper_scroll']/ul/li[2]/a ")).click();
			 	System.out.println("Clicked Credit transfer");
			 	WebElement webobject2 = wd.findElement(By.xpath("//a[@title='Book Transfer']"));
			 	((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject2); 
			 	System.out.println("Clicked Book Transfer");
		      //  Thread.sleep(3000);
		     //   wd.findElement(By.xpath("//*[@id='firstLevelWrapper_scroll']/ul/li[2]/a ")).click();
		      //  wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();
		       // System.out.println("Clicked Credit transfer");
		        //Thread.sleep(4000);
		       // WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Book Transfer']"));
			     //  ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
		        // wd.findElement(By.linkText("Book Transfer")  ).click();
		       Thread.sleep(3000);
			      
		     
				
				//System.out.println("Clicked Book Transfer");
				wd.switchTo().frame("panel2");
				
				Thread.sleep(5000);
				//wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).findElement(By.tagName("input")).sendKeys("512004472");
				
				wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("512004472");
				System.out.println("debit account entered");
				Thread.sleep(2000);
			
				wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("512004626");
				System.out.println("credit account entered");
				
				wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys(Integer.toString(amount));
				System.out.println("credit amount entered");
				
				
				wd.findElement(By.id("Save&Close55")).click();
				System.out.println("Save and close");
				Alert save = wd.switchTo().alert();
				save.accept();
				Alert remitance = wd.switchTo().alert();
				String S=remitance.getText();
				System.out.println(S);
				RemId = S.substring(S.indexOf("-") + 2);
				//System.out.println(RemId);
				remitance.accept();
				wd.close();
				
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


