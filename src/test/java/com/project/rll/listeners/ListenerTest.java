package com.project.rll.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.project.rll.steps.BaseTest;

public class ListenerTest  implements ITestListener{
	
	BaseTest test = new BaseTest();
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//test.captureScreenshot(result.getTestName());
		System.out.println("Test failed");
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}

}
