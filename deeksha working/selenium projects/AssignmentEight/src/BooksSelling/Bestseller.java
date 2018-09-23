package BooksSelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Bestseller {

	public static void Biography()
	{
		WebElement books=Script.driver.findElement(By.xpath("//*[@id=\"topNav1\"]/a"));
		Actions act=new Actions(Script.driver);
		act.moveToElement(books).build().perform();
		
		WebElement Biograph=Script.driver.findElement(By.xpath("//*[@id=\"topNav1\"]/div/div[1]/div[3]/div/a[1]"));
		act.moveToElement(Biograph).click().build().perform();
	}
	
}
