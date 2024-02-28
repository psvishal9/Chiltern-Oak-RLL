package com.project.rll.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features/Filter.feature", 
	glue = {"com/project/rll/steps"},
			
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"pretty",}
	)
public class TestRunner {

}
