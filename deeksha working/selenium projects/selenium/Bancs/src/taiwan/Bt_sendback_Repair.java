package taiwan;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bt_sendback_Repair {

	
	
	public static String RemId;
	public String createORsb (WebDriver wd,String amnt)
	{
		try{
			wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");

	        wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();

			WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Book Transfer']"));
		    ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
			System.out.println("Navigating to remittance window");
			wd.switchTo().frame("panel2");
			//WebElement Source_sys = wd.findElement(By.id("selectCombo_ct_ct_Payments_wca_SRC_SYSTEM_Text"));
			//Source_sys.sendKeys("Manual Entries-Fax");
			//System.out.println("Source System is selected");
			//Thread.sleep(5000);

			//wd.findElement(By.id("ct_ct_Payments_wca_SRC_SYSTEM-button")).click();
			//System.out.println("dropdown select");
			Thread.sleep(2000);

			//wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[6]/div/div/ul/li[7]")).click();
			//System.out.println("TCMS select");

			wd.findElement(By.id("ct_ct_Payments_wca_DR_ACNT_IDNTFR")).sendKeys("512004472");
			System.out.println("debit account entered");
			Thread.sleep(2000);

			
			wd.findElement(By.id("ct_ct_Beneficiary_wca_CR_ACNT_IDNTFR")).sendKeys("151666009");
			System.out.println("credit account entered");
			
			wd.findElement(By.id("ct_ct_Beneficiary_wca_AMT")).sendKeys("110000");
			Thread.sleep(5000);
			System.out.println("Amount entered");
			
			wd.findElement(By.id("Save&Close55")).click();
			System.out.println("Save and close");
			Alert save1 = wd.switchTo().alert();
			save1.accept();
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
	
	
	public void authORsb(WebDriver wd)
	//public void authCTBT(WebDriver wd)
	{
		try{
			Thread.sleep(5000);
					wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();
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
			//ar.sendKeys("110985");

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
		Thread.sleep(3000);
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

		wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys("110000");
		//wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/fieldset/ul/li[12]div/input"))).sendKeys("1900");
		System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(wd, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
		System.out.println("Authorise is performed");	
		WebDriverWait wait6 = new WebDriverWait(wd, 20);


		//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("verAuth_sendback"))).click();
		 System.out.println("sendback is clicked");	

		 wd.findElement(By.id("Send_back_dd-button")).click();;
		 System.out.println("dropdown is clicked");
		 wd.findElement(By.xpath("/html/body/div[9]/div[2]/div/ul[2]/li[2]/div/div/div/ul/li[4]")).click();
		 System.out.println("value is selected");
		 //save clicked
		 wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
		 System.out.println("Save is clicked");	

		 Alert save = wd.switchTo().alert();
			save.accept();
			wd.close();
			System.out.println("Send back performed");	
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
	
	public void ORrepair(WebDriver wd)
	//public void authCTBT(WebDriver wd)
	{
		try{
			Thread.sleep(5000);
			wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");

	        wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();
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
			//ar.sendKeys("111355");

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
		Thread.sleep(3000);
		//Authorise command:
		//wd.findElement(By.xpath("html/body/form/div/div[2]/div/div/table/tbody/tr/td/input")).click();

		WebDriverWait wait13 = new WebDriverWait(wd, 20);
	    wait13.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div[2]/div[5]/div[6]/table/tbody/tr/td/input"))).click();
	   // 	Thread.sleep(2000);
	    	System.out.println("Repair is clicked");
		Thread.sleep(5000);
		wd.switchTo().defaultContent();
		wd.switchTo().frame("panel4");
	//	WebDriverWait wait4 = new WebDriverWait(wd, 20);

		
		//System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(wd, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_12"))).click();
		System.out.println("Cancelled is performed");	
		//WebDriverWait wait6 = new WebDriverWait(wd, 20);

		 Alert save = wd.switchTo().alert();
		save.accept();
		wd.close();
		System.out.println("OR Cancelled");	
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public void authORauth(WebDriver wd)
	//public void authCTBT(WebDriver wd)
	{
		try{
			Thread.sleep(5000);
					wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        wd.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li/div/div/ul/li[2]/a")).click();
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
			ar.sendKeys("111355");

			//ar.sendKeys(RemId);
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
		Thread.sleep(3000);
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

		wait4.until(ExpectedConditions.elementToBeClickable(By.id("ct_ct_Payments_dup_wca_AMT"))).sendKeys("1800");
		//wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/ul[2]/li/ul/li/div/div/fieldset/ul/li[12]div/input"))).sendKeys("1900");
		System.out.println("value sent to text box");
		WebDriverWait wait5 = new WebDriverWait(wd, 20);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("butName_13"))).click();
		System.out.println("Authorise is performed");	
		WebDriverWait wait6 = new WebDriverWait(wd, 20);
		//wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/div[2]/table/tbody/tr[4]/td/table/tbody/tr/td/img"))).click();
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("Save_dialogButton"))).click();
		 System.out.println("Save is clicked");	

		 Alert save = wd.switchTo().alert();
			save.accept();
			wd.close();
			System.out.println("Authorized");	
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
	public static void main(String args[]) throws InterruptedException{
		Chromelogin BL = new Chromelogin();
		WebDriver WD1 = BL.login_screen("renukatm","verma5");
		Bt_sendback_Repair CBT =new Bt_sendback_Repair();
        String CR_id = CBT.createORsb(WD1, "314");
       
		 WebDriver WD2 = BL.login_screen("renukatc","verma5");
		 CBT.authORsb(WD2);

		 WebDriver WD3 = BL.login_screen("renukatm","verma5");
		 CBT.ORrepair(WD3);

		 WebDriver WD4 = BL.login_screen("renukatc","verma5");
		 CBT.authORauth(WD4);
	
	
	
}
}
