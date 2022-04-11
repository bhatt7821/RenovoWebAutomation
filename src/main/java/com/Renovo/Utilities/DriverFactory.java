package com.Renovo.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Renovo.Constants.BrowserConstants;
import com.Renovo.PageObjects.StaffloginPage;

//import PageObjects.NewToursPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	public static WebDriverWait wait;	
	public static StaffloginPage renovoLoginPage;
	
	public WebDriver getWebdriver() {
		try {
		ReadConfigFile file = new ReadConfigFile();
		
		String browserName = file.getBrowser();
		System.out.println("-=-=-=-=-=-==--=-=-: "+browserName);		
		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			//System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, BrowserConstants.Chrome_Driver_Path);
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", BrowserConstants.FireFox_Driver_Path);
			driver = new FirefoxDriver();
			break;

		}
		}catch (Exception e) {
			System.out.println("Unable to lauch browser due to: "+e.toString());
		}
		System.out.println("driver-=-=-=-=-=-==--=-=-: "+driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public WebDriverWait waitDriver() {
		return new WebDriverWait(driver, 30);
	}

}