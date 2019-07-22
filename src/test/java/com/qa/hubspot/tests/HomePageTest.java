package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	public void homePageTitleTest(){
		page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "Reports dashboard");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest(){
		page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("home page header is: "+ header);
		Assert.assertEquals(header, "Sales Dashboard");
	}
	
}
