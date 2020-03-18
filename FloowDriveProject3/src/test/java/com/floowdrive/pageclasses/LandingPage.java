package com.floowdrive.pageclasses;


import org.openqa.selenium.WebElement;

import com.floowdrive.base.BasePage;

import io.appium.java_client.AppiumDriver;


public class LandingPage  extends BasePage{
	
	/** constructor **/
	public LandingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		
	}

	/***
     * Variables
     * Locators
     * URL
     */
	
	
    private String EMAIL_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_email_address";
    private String PASSWORD_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_password";
    private String REPEAT_PASSWORD_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_confirm_password";
	

	public void do_registration (String email,String password,String retype_password) throws InterruptedException {
		//given some waiting time for seeing action 
		Thread.sleep(10000);
		
		driver.findElementById(EMAIL_FIELD ).sendKeys(email);
		
		//given some waiting time for seeing action
		Thread.sleep(10000);
		driver.findElementById(PASSWORD_FIELD).sendKeys(password);
		
		//given some waiting time for seeing action
		Thread.sleep(10000);
		driver.findElementById(REPEAT_PASSWORD_FIELD).sendKeys(retype_password);
	}
	
	
	public void already_regitered_goto_loginPage()  {
		
		
		// need to add 
				
	}
	
	

}
