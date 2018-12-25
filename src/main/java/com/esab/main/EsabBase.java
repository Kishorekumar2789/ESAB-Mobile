package com.esab.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class EsabBase {
	
	@Test
	public static void esablaunch() throws MalformedURLException{
		
		
		AndroidDriver<MobileElement> driver;
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus 6");
		cap.setCapability(CapabilityType.BROWSER_VERSION, "");
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(CapabilityType.VERSION, "9");
		cap.setCapability("appPackage", "com.esab.weldclouldscanner");
		cap.setCapability("appActivity","com.esab.weldclouldscanner.Activities.SplashScreen");
		
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	

}
