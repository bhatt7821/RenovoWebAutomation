package com.Renovo.Stepdefinition;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Renovo.Helper.SeleniumHelper;
import com.Renovo.PageObjects.StaffloginPage;
import com.Renovo.Utilities.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Staff_loginStepDefinition extends DriverFactory {
	Scenario sc;
	StaffloginPage staffloginpage = new StaffloginPage();
	@Before
	public void beforeStep(Scenario scenario) {
		this.sc = scenario;
	}
	
	@Given("^Open Browser and navigate to application URL$")
	public void open_browser_and_navigate_to_application_url() throws InterruptedException, IOException {
		sc.log("Adding scenario report steps...........");
		SeleniumHelper.captureScreenshot(sc);
		//driver.get("https://catdev.crawco.com:9191/");
    	//staffloginpage.verifyTitle("RENOVO");
		//staffloginpage.verifyURL("https://catdev.crawco.com:9191/");
		
	}

	@Given("^User is at login selection page$")
	public void user_is_at_login_selection_page() throws Throwable {
		//staffloginpage.verifyTitle("RENOVO");
		//staffloginpage.verifyURL("https://catdev.crawco.com:9191/");
	}

	@When("^User clicks the staff login$")
	public void user_clicks_the_staff_login() throws Throwable {
		renovoLoginPage.ClickStaffUser();
		//Thread.sleep(3000);
	}

	@Then("^User enters the valid Email as \"([^\"]*)\"$")
	public void user_enters_the_valid_Email_as(String arg1) throws Throwable {
	    System.out.println("Hello World");
	    renovoLoginPage.Email.sendKeys(arg1);
	   
	}

	@Then("^User navigate to Home page$")
	public void user_navigate_to_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(4000);
	}

	@Then("^User enter the valid password as \"([^\"]*)\"$")
	public void user_enter_the_valid_password_as(String arg1) throws Throwable {
		renovoLoginPage.Password.sendKeys(arg1);
	}

	@Then("^User enter the Invalid password as \"([^\"]*)\"$")
	public void user_enter_the_Invalid_password_as(String arg1) throws Throwable {
		renovoLoginPage.Wrong_Password.sendKeys(arg1);// Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User enters the Invalid Email as \"([^\"]*)\"$")
	public void user_enters_the_Invalid_Email_as(String arg1) throws Throwable {
		renovoLoginPage.Wrong_Email.sendKeys(arg1);
	    
	}

	@Then("^User clicks Signin button$")
	public void user_clicks_Signin_button() throws Throwable {
		renovoLoginPage.clickSignInButton();
		Thread.sleep(2000);
	    
	}

	@Then("^Verify validation message appears and user unables to signin$")
	public void verify_validation_message_appears_and_user_unables_to_signin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
