package abc;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (abc.Listener.class)
public class Login {
    	@Test
	public void loginwithEmail()
	{
		System.out.println("Inside login with email");
	}
	@Test
	public void loginwithFB()
	{
		System.out.println("Inside login with FB");
	}
	@Test
	public void loginwithgoogle()
	{
		System.out.println("Inside login with google");
		Assert.assertEquals(11, 12);
	}
}