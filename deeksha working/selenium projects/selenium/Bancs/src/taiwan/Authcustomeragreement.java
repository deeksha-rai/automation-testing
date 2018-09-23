package taiwan;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Authcustomeragreement {
	public void Authcustagreement(WebDriver wd)
	 {
		 try{ wd.findElement(By.id("tabText_0")).click(); 
		  System.out.println("menu clicked");
		  wd.findElement(By.xpath("//span[@title='Customer Master']")).click();
		  System.out.println("Customer Master hover");
		   System.out.println("Navigating to Customer Master list");
		   Thread.sleep(2000); 
		   WebElement webobject1 = wd.findElement(By.xpath("//p[@title='Customer Agreement List']"));
		   ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
		   System.out.println("Navigating to Customer Agreement List"); 
		   Thread.sleep(2000); 
		   wd.switchTo().defaultContent();
		   wd.switchTo().frame("panel2");
		   wd.findElement(By.xpath("/html/body/form/div/table/tbody/tr[2]/td[2]/div/span/span/img")).click();
		   System.out.println("level type cleared");
		   wd.findElement(By.xpath("/html/body/form/div[4]/li")).click();
		   System.out.println("blank selected");
		   wd.findElement(By.xpath("/html/body/form/div/div[3]/div[2]/input")).click();
		   wd.findElement(By.id("Search")).click(); 
		   Thread.sleep(1000); System.out.println("search button clicked");
		   Thread.sleep(4000); 
		   //right click 
		   WebElement tabclicks = wd.findElement(By.xpath("/html/body/form/div/span/fieldset/div[2]/table/tbody/tr[2]/td[4]")); 
		   //commands for right click
		   Actions action = new Actions(wd).contextClick(tabclicks); 
		   action.build().perform(); 
		   System.out.println("right click"); 
		   Thread.sleep(2000);
		   WebDriverWait wait42 = new WebDriverWait(wd, 20); wait42.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div/div[5]/div/table/tbody/tr[5]/td/input"))).click();
		   System.out.println("Authorise option is clicked");
		   wd.switchTo().defaultContent(); 
		   wd.switchTo().frame("panel3");
		   Thread.sleep(1000); 
		   wd.findElement(By.id("Authorise18")).click();
		   Alert save7 = wd.switchTo().alert();
           save7.accept();
		 }
		   catch (InterruptedException e) 
			 { 
				 e.printStackTrace(); 
				 } 
			 catch(Exception e)
			 
			 { 
				 e.printStackTrace();
				 }
}}
	
