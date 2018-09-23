package TicketBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {
	public static void bookflight() throws Exception
	{
		WebElement Flight=InvokingSite.driver.findElement(By.linkText("Flights"));
		Flight.click();
		WebElement OneWay=InvokingSite.driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		OneWay.click();
		WebElement Passenger=InvokingSite.driver.findElement(By.name("passCount"));
		Select sc=new Select(Passenger);
		sc.selectByVisibleText("1");
		
		WebElement DepartingFrom=InvokingSite.driver.findElement(By.name("fromPort"));
		Select df=new Select(DepartingFrom);
		df.selectByVisibleText("Paris");
		
		
		WebElement month=InvokingSite.driver.findElement(By.name("fromMonth"));
		Select m=new Select(month);
		m.selectByVisibleText("February");
		
		
		WebElement date=InvokingSite.driver.findElement(By.name("fromDay"));
		Select d=new Select(date);
		d.selectByVisibleText("8");
		
		
		WebElement arrivingIn=InvokingSite.driver.findElement(By.name("toPort"));
		Select ai=new Select(arrivingIn);
		ai.selectByVisibleText("London");
		
		WebElement retrnmonth=InvokingSite.driver.findElement(By.name("toMonth"));
		Select rm=new Select(retrnmonth);
		rm.selectByVisibleText("February");
		
		
		WebElement retrndate=InvokingSite.driver.findElement(By.name("toDay"));
		Select rd=new Select(retrndate);
		rd.selectByVisibleText("16");
		
		WebElement serviceclass=InvokingSite.driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
		serviceclass.click();
		
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		
		WebElement continuebooking=InvokingSite.driver.findElement(By.name("findFlights"));
		continuebooking.click();
		
	}
	public static void selectflight() throws Exception
	{
		WebElement chooseflight=InvokingSite.driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input"));
		chooseflight.click();
		Evidences.getScreenshot((TakesScreenshot)InvokingSite.driver, "image_ss");
		WebElement reserveflight=InvokingSite.driver.findElement(By.name("reserveFlights"));
		reserveflight.click();
	}
      
}
