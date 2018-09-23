package testScenarios;

import Utilities.ConstantValues;
import pagesOfWebsite.SignInToGmail;
import pagesOfWebsite.ValidateCredentials;

public class TS005 {
	public static void ts005()throws Exception
	{
		SignInToGmail.openGmailSite(ConstantValues.GmaiUrl);
		SignInToGmail.enterEmail("EmailOrPhone", ConstantValues.EmailOrPhone);
		SignInToGmail.clickOnNextButton("NextButton");
		Thread.sleep(2000);
		SignInToGmail.enetrPassword("GmailPassword", ConstantValues.GmailPassword);
		SignInToGmail.clickOnSubmitButton("submitgmail");
	    Thread.sleep(4000);
		ValidateCredentials.clickOnUserIcon("UserIcon");
		String loggedInUser=ValidateCredentials.getCredentials("LoginName");
		System.out.println(loggedInUser+ "Sucessfully LoggedIn");
		
		ValidateCredentials.clickOnCompose("ComposeMail");
		Thread.sleep(2000);
		ValidateCredentials.enetrTo("To", ConstantValues.To);
		ValidateCredentials.enetrSubject("Subject", ConstantValues.Subject);
		ValidateCredentials.clickOnAttachment("Attachment");
		Thread.sleep(2000);
		ValidateCredentials.clicktoSendEmail("Send");
		Runtime.getRuntime().exec("C:\\Users\\SONY\\Documents\\deeksha working\\EdurekaProject\\AddPdf.exe");
		
	}
}
