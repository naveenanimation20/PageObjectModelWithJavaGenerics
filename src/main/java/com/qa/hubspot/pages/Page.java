package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	public WebDriver driver;
	public WebDriverWait wait;

	// page class constructor:
	public Page(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// create a method with Java Generics and return a new page
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
