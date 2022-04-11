package com.Renovo.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/featureFiles/" },
glue = {"com.Renovo.Stepdefinition" },
monochrome = true, 
		 tags = "@Renovo", 
plugin = { "pretty",
		"html:test-output/TestNG-Cucumber/cucumber.html",
		"json:test-output/TestNG-Cucumber/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class MainTestRunner extends AbstractTestNGCucumberTests {
	
}
