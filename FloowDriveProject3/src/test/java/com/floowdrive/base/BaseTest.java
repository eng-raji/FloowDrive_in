package com.floowdrive.base;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.floowdrive.constants.Cons;
import com.floowdrive.pageclasses.LandingPage;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest  {
	
	 public  LandingPage land;

	public AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void setDevice() throws MalformedURLException {
	
	//Initializing DesiredCapabilities for set mobile capabilities
	DesiredCapabilities caps=new 	DesiredCapabilities();
	
	//Initializing AppiumServiceBuilder for invoke AppiumServer on Port
	AppiumServiceBuilder builder = new AppiumServiceBuilder();
		
	
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Cons.PLATFORM_NAME_SET);
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,Cons.PLATFORM_VERSION_SET);
	caps.setCapability(MobileCapabilityType.DEVICE_NAME,Cons.DEVICE_NAME_SET);
	caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"\\src\\test\\resources\\apps\\com.thefloow.thefloowltd.floowdrive.app-57.apk");
	//caps.setCapability(MobileCapabilityType.APP,APP_ROOT);
	builder.usingDriverExecutable(new File(Cons.NODE_PATH));
			
	builder.withAppiumJS(new File(Cons.MAIN_JS_PATH));
	builder.withIPAddress(Cons.IP_ADDRESS);
	builder.usingPort(Cons.PORT);
	

	//Initializing AppiumDriver and invoke with AppiumServer and Device set
	 driver =new AppiumDriver<WebElement>(builder,caps);
		
	
	
	
	}

	@AfterTest
	public void teardown() {
		
		//Quit Driver 
	//	driver.quit();
	}
	

}
