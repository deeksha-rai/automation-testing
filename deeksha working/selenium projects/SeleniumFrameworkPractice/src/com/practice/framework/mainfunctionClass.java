package com.practice.framework;

import org.testng.annotations.Test;

@Test
public class mainfunctionClass {


	public static void test() {
		// TODO Auto-generated method stub
		try {
		homePage.openBrowser();
		homePage.signIn();
		homePage.createAccount();
		ReadWriteData.setxcelPath();
		homePage.clickcreateAccount();
		createAccountClass.provideDetail();
		searchForTop.hoverOnWomen();
		checkOut.checkOutDetail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
