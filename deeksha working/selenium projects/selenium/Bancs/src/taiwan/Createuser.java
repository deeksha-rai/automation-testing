package taiwan;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Createuser {
	public void authCTBT(WebDriver wd)
	{

		try{
			wd.findElement(By.id("tabText_0")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	       
	        wd.findElement(By.xpath("//span[@title='Security Management']")).click();
	        
			 WebElement webobject1 = wd.findElement(By.xpath("//p[@title='User']"));
		       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
			System.out.println("Navigating to user  window");
	wd.switchTo().frame("panel2");
			Thread.sleep(2000);
			System.out.println("Switch to panel2");
			wd.findElement(By.id("ar_ct_UserDetail_N_wca_BusPartnerId")).click();
			System.out.println("Business Partner clicked");
			wd.findElement(By.id("ar_ct_UserDetail_N_wca_EmpID")).sendKeys("889429"); //Optional tag
			System.out.println("Employee Ref entered");
			wd.findElement(By.id("ar_ct_UserDetail_N_wca_FirstName")).sendKeys("Surabhi"); 
			System.out.println("First Name entered");
			wd.findElement(By.id("ar_ct_UserDetail_N_wca_LastName")).sendKeys("Nayak"); 
			System.out.println("Last Name entered");
			wd.findElement(By.id("ar_ct_UserDetail_N_wca_OfficeID")).sendKeys("GBTMUINDEL"); 
			System.out.println("Office ID entered");
			wd.findElement(By.id("ar_ct_UserAccess_N_wca_LoginId")).sendKeys("Surabhi1"); 
			System.out.println("Login ID entered");
			wd.findElement(By.id("ar_ct_UserAccess_N_wca_Password")).sendKeys("abcd1234"); 
			System.out.println("Password entered");
			wd.findElement(By.id("ar_ct_UserAccess_N_wca_ConfirmPassword")).sendKeys("abcd1234"); 
			System.out.println("Password Confirmed");
			wd.findElement(By.name("ar_ct_UserDetail_N_wca_DfltProcessingCenter")).click(); //Clicks on the field
			wd.findElement(By.name("ar_ct_UserDetail_N_wca_DfltProcessingCenter_button")).click(); //Clicks the qbe and qbe opens up
			Thread.sleep(5000);
			 wd.switchTo().frame("CWpanel1"); 
             System.out.println("Changed to new panel for Originator id for instrument"); 
             WebElement myFrame = wd.findElement(By.name("mywindowframe")); 
             wd.switchTo().frame(myFrame);
			Thread.sleep(3000);
			wd.findElement(By.id("srchBut_0")).click();
			
			System.out.println("Searched clicked");
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
 

