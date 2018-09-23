



import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;








import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Auth_Rem {
	
	
	public WebDriver LogIn()
	
	{
		File file = new File("C:/Program Files/Internet Explorer/iexplore.exe");
		System.setProperty("weblogin1.ie.login1", file.getAbsolutePath());
		
		WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://172.21.163.65:25000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
		driver.manage().window().maximize();
		driver.findElement(By.name("userId")).sendKeys("bunny");
		driver.findElement(By.name("password")).sendKeys("tcs1234");
		driver.findElement(By.name("entity")).click();
		Select drpdwn = new Select(driver.findElement(By.name("entity")));
		drpdwn.selectByValue("GBTMUINDEL");
		driver.findElement(By.id("Login")).submit();
		driver.findElement(By.id("spanPayments")).click();
		driver.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		WebElement webobject1 = driver.findElement(By.xpath("//p[@title='Remittance List']"));
	       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webobject1);
		//driver.findElement(By.xpath("//p[@title='Remittance List']")).click();
		driver.switchTo().frame("panel2");	
		return driver;
			
		
	}
	
	
	public void AuthRem(WebDriver dr, String remId,int i)
	
	
	{
		
		try
		{	
		List<WebElement> Rem = dr.findElements(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNGVAL_From)"));
        Rem.get(1).sendKeys(remId);
        Thread.sleep(2000);
		//System.out.println("pos num entered");
        dr.findElement(By.xpath("//input[@title='Search']")).click();
		Thread.sleep(2000);
		dr.switchTo().defaultContent();
		WebElement wizard = dr.findElement(By.id("stppopup_text"));
		wizard.click();
		//System.out.println("Wizard button clicked");	
		Thread.sleep(1000);
		dr.findElement(By.xpath("//div[@title='Update']")).click(); //update button on wizard
		Thread.sleep(1000);
		dr.findElement(By.id("tdtext4")).click();     //"Clicked on WI button "        		
		dr.findElement(By.linkText(remId)).click();
		Thread.sleep(1000);
		dr.switchTo().defaultContent();		
		dr.switchTo().frame("panel"+(3+i));      //i is for panel switch 
		Thread.sleep(1000);
		dr.findElement(By.id("ctrlTblBtn")).click();
		WebElement WIb = dr.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]")); // rem list path in work item  		
		WIb.click();
		Thread.sleep(1000);
		dr.findElement(By.name("bt1")).click();     //auth button clicked		
		dr.switchTo().defaultContent();
		Thread.sleep(1000);			
		dr.switchTo().frame("panel"+(3+i+1));	  // switch to auth screen
		dr.findElement(By.id("ct_ct_Payments_dup_wca_CNTR_AMT")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("butName_12")).click(); //auth button 		
		Thread.sleep(1000);
		dr.findElement(By.id("image1")).click(); //save button
		//System.out.println("save button clicked");
		System.out.println("AUTH DONE***************************");
		Alert txnS = dr.switchTo().alert();
		txnS.accept();
		Thread.sleep(1000);	
		dr.switchTo().defaultContent();		
		dr.switchTo().frame("panel"+(3+i));		
		Thread.sleep(500);		
		dr.findElement(By.name("Close27")).click();
		Thread.sleep(500);
		dr.switchTo().defaultContent();
		dr.switchTo().frame("panel2");
		Thread.sleep(500);
		List<WebElement> Rem1 = dr.findElements(By.id("propertyMap(MCB_SearchWC_wca_TXN_POS_NUM_RNGVAL_From)"));
        Rem1.get(1).clear();		
		}
		catch(Exception e)
		{
			
		}
		return;
			
		}
	
	
	public WebDriver LogIn_ORder(){
		
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://172.21.163.65:25000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null&status=null");
		driver.manage().window().maximize();
		driver.findElement(By.name("userId")).sendKeys("bunny");
		driver.findElement(By.name("password")).sendKeys("tcs1234");
		driver.findElement(By.name("entity")).click();
		Select drpdwn = new Select(driver.findElement(By.name("entity")));
		drpdwn.selectByValue("GBTMUINDEL");
		driver.findElement(By.id("Login")).submit();
		driver.findElement(By.id("spanPayments")).click();
		driver.findElement(By.xpath("//span[@title='Credit Transfer']")).click();
		driver.findElement(By.xpath("//p[@title='Order Master']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("order master screen opened");
		driver.switchTo().frame("panel2");
				
		return driver;	
	}
	

	public void Auth_Order(WebDriver dr, String remId, int i)
		{
			try
			{

				List<WebElement> Rem = dr.findElements(By.id("propertyMap(MCB_SearchWC_wca_MBRSEQNO_RNGVAL_From)"));
		        Rem.get(1).sendKeys(remId); 
				//System.out.println("order id entered");
		        dr.findElement(By.id("Search")).click();
				Thread.sleep(3000);
				dr.switchTo().defaultContent();
				WebElement wizard = dr.findElement(By.id("stppopup_text"));
				wizard.click();
				//System.out.println("Wizard button clicked");
				Thread.sleep(2000);
				dr.findElement(By.xpath("//div[@title='Update']")).click(); //update button on wizard
				Thread.sleep(2000);
				dr.findElement(By.id("tdtext3")).click();          
		        //System.out.println("Clicked on WI button ");
				Thread.sleep(2000);
				dr.findElement(By.linkText(remId)).click();
				Thread.sleep(2000);
				dr.switchTo().frame("panel"+(3+i));
				Thread.sleep(2000);
				dr.findElement(By.id("ctrlTblBtn")).click();
				WebElement WIb = dr.findElement(By.xpath("html/body/form/div/div[2]/span[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[4]")); // rem list path in work item  		
				WIb.click();
				Thread.sleep(2000);
				dr.findElement(By.name("bt1")).click();
				dr.switchTo().defaultContent();
				Thread.sleep(3000);
				dr.switchTo().frame("panel"+(3+i+1));
				//System.out.println("Switched to auth screen");
				dr.findElement(By.id("ct_ct_Payments_dup_wca_RLTD_REF_NUM")).click();
				Thread.sleep(1000);
				dr.findElement(By.id("butName_12")).click(); //auth button 
				//System.out.println("auth button clicked");
				Thread.sleep(2000);
				dr.findElement(By.id("image1")).click(); //save button
				//System.out.println("save button clicked");
				System.out.println("AUTH DONE**************************");
				Alert txnS = dr.switchTo().alert();
				txnS.accept();
				Thread.sleep(1000);
				dr.switchTo().defaultContent();
				dr.switchTo().frame("panel"+(3+i));
				Thread.sleep(1000);
				dr.findElement(By.name("Close27")).click();				
				Thread.sleep(1000);				
				dr.switchTo().defaultContent();				
				dr.switchTo().frame("panel2");
				Thread.sleep(1000);			
				List<WebElement> Rem3 = dr.findElements(By.id("propertyMap(MCB_SearchWC_wca_MBRSEQNO_RNGVAL_From)"));
		        Rem3.get(1).clear();
	
			}
			
			catch(Exception e)
			{}
			return ;
		
		
		

	}
		
	}

	
	


