package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demoOne {
	
	@Test(priority=1,description="Verifies login functionality")
	public void loginApp()
	{
		System.out.println("Application logged In");
	}

	@Test(priority=2,description="Add items to basket")
	public void selectItems()
	{
		System.out.println("selectItems");
	Assert.assertEquals(12, 13);
	}
	@Test(priority=-3,description="executes checkout")
	public void checkOutItems()
	{
		System.out.println("checkOutItems");
	}
}
