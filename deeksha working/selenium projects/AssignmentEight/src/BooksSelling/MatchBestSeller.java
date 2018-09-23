package BooksSelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MatchBestSeller {
	public static void  checkBestsellerAndBiograph()
	{
		try
		{
		WebElement biogrphy=Script.driver.findElement(By.xpath("//*[@id=\"main-content\"]/header/h1/span[2]/span[2]"));
		String Bio=biogrphy.getText();
		System.out.println(Bio);
		WebElement BestSeller=Script.driver.findElement(By.xpath("//*[@id=\"hotBooksWithDesc_Bestsellers\"]/header/h2"));
		String bstSell=BestSeller.getText();
		System.out.println(bstSell);
	}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Could not find both Biograph and BestSeller");
		}

}
}
