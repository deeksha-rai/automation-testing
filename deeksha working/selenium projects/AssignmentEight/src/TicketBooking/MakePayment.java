package TicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MakePayment {

	public static void providePassangerInfo()
	{
		WebElement Firstname=InvokingSite.driver.findElement(By.name("passFirst0"));
		Firstname.sendKeys("Rani");
		WebElement Lastname=InvokingSite.driver.findElement(By.name("passLast0"));
		Lastname.sendKeys("Gupta");
		WebElement Meal=InvokingSite.driver.findElement(By.name("pass.0.meal"));
		Select sc=new Select(Meal);
		sc.selectByVisibleText("Vegetarian");
		
	}
	public static void provideCardInfo()
	{
		WebElement CardType=InvokingSite.driver.findElement(By.name("creditCard"));
		Select s=new Select(CardType);
		s.selectByVisibleText("MasterCard");
		
		
		WebElement Number=InvokingSite.driver.findElement(By.name("creditnumber"));
		Number.sendKeys("789456123145");
		
		
		WebElement ExpiryMonth=InvokingSite.driver.findElement(By.name("cc_exp_dt_mn"));
		Select se=new Select(ExpiryMonth);
		se.selectByVisibleText("07");
		
		WebElement ExpiryDate=InvokingSite.driver.findElement(By.name("cc_exp_dt_yr"));
		Select ed=new Select(ExpiryDate);
		ed.selectByVisibleText("2010");
	}
	
	public static void provideBillingInfo()
	{
		
		WebElement FirstnameReciever=InvokingSite.driver.findElement(By.name("cc_frst_name"));
		FirstnameReciever.sendKeys("Rani");
		WebElement LastnameReciever=InvokingSite.driver.findElement(By.name("cc_last_name"));
		LastnameReciever.sendKeys("Gupta");
		
		
		WebElement Ticketless=InvokingSite.driver.findElement(By.name("ticketLess"));
		Ticketless.click();
		WebElement BillingAddress=InvokingSite.driver.findElement(By.name("billAddress1"));
		BillingAddress.sendKeys("Cross Road colony");
	
		WebElement City=InvokingSite.driver.findElement(By.name("billCity"));
		City.sendKeys("Rampur");
		WebElement State=InvokingSite.driver.findElement(By.name("billState"));
		State.sendKeys("Delhi");
		WebElement PostalCode=InvokingSite.driver.findElement(By.name("billZip"));
		PostalCode.sendKeys("234568");
		WebElement Country=InvokingSite.driver.findElement(By.name("billCountry"));
		Select cntry=new Select(Country);
		cntry.selectByVisibleText("INDIA");
		
	}
	public static void provideDeliveryInfo() throws Exception
	{
		WebElement BillingAddress=InvokingSite.driver.findElement(By.name("delAddress1"));
		BillingAddress.sendKeys("Cross Road colony");
	
		WebElement City=InvokingSite.driver.findElement(By.name("delCity"));
		City.sendKeys("Rampur");
		WebElement State=InvokingSite.driver.findElement(By.name("delState"));
		State.sendKeys("Delhi");
		WebElement PostalCode=InvokingSite.driver.findElement(By.name("delZip"));
		PostalCode.sendKeys("234568");
		WebElement Country=InvokingSite.driver.findElement(By.name("delCountry"));
		Select cntry=new Select(Country);
		cntry.selectByVisibleText("UNITED STATES");
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		WebElement SecurePurchase=InvokingSite.driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input"));
		SecurePurchase.click();
	}
	
	
}
