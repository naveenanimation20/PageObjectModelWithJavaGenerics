package com.qa.hubspot.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.pages.Page;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().fullscreen();
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// create the object of page class: Instantiate Page Class
		page = new Page(driver, wait);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
