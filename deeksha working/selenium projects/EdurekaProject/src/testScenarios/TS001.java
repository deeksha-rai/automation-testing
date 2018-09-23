package testScenarios;

import Utilities.ConstantValues;
import commonMethods.Commonmeths;
import pagesOfWebsite.RegisterPage;
import pagesOfWebsite.SignUpPage;

public class TS001 {

	public static void ts1()
	{
	
		Commonmeths.openBrowser();
		//System.out.println(3333 + ConstantValues.websiteURL);
		Commonmeths.openWebsite(ConstantValues.websiteURL);
		try {
			RegisterPage.clickonRegister("register");
			RegisterPage.enterFirstName("FirstName", ConstantValues.FirstName);
			RegisterPage.enterLastName("LastName", ConstantValues.LastName);
			RegisterPage.enterPhone("Phone", ConstantValues.Phone);
			RegisterPage.enterEmail("Email", ConstantValues.Email);
			RegisterPage.enterAddress("Address", ConstantValues.Address);
			RegisterPage.enterCity("City", ConstantValues.City);
			RegisterPage.enterState("State", ConstantValues.State);
			RegisterPage.enterzipCode("zipCode", ConstantValues.zipCode);
			RegisterPage.enterCountry("Country", ConstantValues.Country);
			RegisterPage.enterUserName("UserName", ConstantValues.UserName);
			RegisterPage.enterPassword("RegisterPassword", ConstantValues.RegisterPassword);
			RegisterPage.enterConfirmPassword("ConfirmPassword", ConstantValues.ConfirmPassword);
			RegisterPage.RegisterUser("RegisterLink");
			SignUpPage.clickToSignIn("Signin");
			SignUpPage.enterUsername("SignUsername", ConstantValues.SignUsername);
			SignUpPage.enterPassword("Password", ConstantValues.Password);
			SignUpPage.clickSignUpLink("signInLink");
			
			
			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
