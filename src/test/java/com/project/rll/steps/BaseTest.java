package com.project.rll.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.rll.listeners.ListenerTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class BaseTest {
	public static WebDriver driver;
	ListenerTest listenerTest;
	
	@Before
	public  void setUp() {
		
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}
	
	
	@After
	public void tearDown(Scenario scenario)  {
		if(scenario.isFailed()) {
			// capture screen ,  The use of final means that the variable cannot be reassigned.
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			// Attach the screenshot to the report
           scenario.attach(screenshot, "image/png", scenario.getName()); 
		}
		
		
			driver.quit();
		
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	

	


}
