package com.floowdrive.base;


import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class BasePage extends CustomDriver {

	
	public AppiumDriver<WebElement> driver;

	    public BasePage(AppiumDriver<WebElement> driver) {
	        super(driver);
	        this.driver = driver;
	    }

	    public boolean verifyTitle(String expectedTitle) {
	        return getTitle().equalsIgnoreCase(expectedTitle);
	    }
}
