package com.Renovo.Stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.Renovo.Helper.SeleniumHelper;

import com.Renovo.PageObjects.StaffloginPage;
import com.Renovo.Utilities.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MasterHooks extends DriverFactory {
	
	@Before("@Renovo")
	public void set_upRenovo() {
		driver = getWebdriver();
		wait = waitDriver();
		renovoLoginPage = PageFactory.initElements(driver, StaffloginPage.class);
		//staffLoginPage = PageFactory.initElements(driver, AP_RegistrationPage.class);
		driver.get("https://catdev.crawco.com:9191/");
	}

	@After()
	public void tearDown(Scenario scenario) {
		try {
			if (driver != null) {
				if (scenario.isFailed()) {
				//	scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png","Failed Screenshot");
					SeleniumHelper.captureScreenshot(scenario);
				}

				driver.manage().deleteAllCookies();
				driver.quit();
			}
		} catch (Exception e) {
			System.out.println("Method failed: tearDown(), Exception " + e.getMessage());
		}
	}

}
