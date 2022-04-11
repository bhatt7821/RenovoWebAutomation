package com.Renovo.PageObjects;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Renovo.Helper.SeleniumHelper;
public class StaffloginPage extends SeleniumHelper {
	
	private WebDriver driver;
	
	@FindBy(xpath="/html/body/app-root/app-auth-o/div/div[2]/div[2]/button[1]")
	public WebElement StaffloginButton;
	
	@FindBy(xpath="//input[@id='userNameInput']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='passwordInput']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id=\"submitButton\"]")
	WebElement SignInButton;
	
	@FindBy(xpath="//input[@id='userNameInput']")
	public WebElement Wrong_Email;
	
	@FindBy(xpath="//input[@id='passwordInput']")
	public WebElement Wrong_Password;
	
	@FindBy(xpath="//span[contains(text(),'Sign')]/parent::a")
	public WebElement logoutBtn;
	
	
//	@FindBy(xpath="//form[@id='activeCartViewForm']/div[@data-name='Active Items' or contains(@class,'sc-list-body')]//input[@value='Delete']")
//	public List<WebElement> itemList;
	
	
	public void verifyTitle(String string) {
		// TODO Auto-generated method stub
		String Actual = driver.getTitle();
        String Expected = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";

        if (Actual.equals(Expected)) {
                   System.out.println("Test Passed!");
        } else {
                   System.out.println("Test Failed");
        }
	}

	public boolean verifyURL(String URL)
	{
		boolean result=false;
		if(driver.getCurrentUrl().contains(URL))
		{
			result=true;
		}
		return result;
	}
		
	
	public void ClickStaffUser(){
		this.StaffloginButton.click();
	}
	
	public void EnterWrongEmail(String email) throws InterruptedException{
		this.Wrong_Email.sendKeys(email);
	}
	
	public void EnterWrongPassword(String password){
		this.Wrong_Password.sendKeys(password);
	}
	
	public void EnterEmail(String email) throws InterruptedException{
		this.Email.sendKeys(email);
	}
	
	public void EnterPassword(String password){
		this.Password.sendKeys(password);
	}
	
	public void clickSignInButton(){
		this.SignInButton.click();
	}	
//	public void validateHomePage() {
//		Assert.assertTrue(isElementPresent(firstNameTextBox));
		
}
