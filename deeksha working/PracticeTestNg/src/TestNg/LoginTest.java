package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginwithEmail()
	{
		System.out.println("Inside test login with email");
	}
	
	
	@Test
	public void loginwithFB()
	{
		System.out.println("Inside test login with fb");
		Assert.assertEquals(11, 12);
	}
	
}
