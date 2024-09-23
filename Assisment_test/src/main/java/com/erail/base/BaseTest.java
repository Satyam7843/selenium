package com.erail.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	BrowserFactory brwsFactory;
	FunctionalLibrary misc;

	public BaseTest(BrowserFactory brwsFactory) {
		this.brwsFactory = brwsFactory;
	}


	@BeforeMethod
    public void setUp() {
        // Setup WebDriver using WebDriverManager
		brwsFactory.setDriver();
		misc = new FunctionalLibrary(brwsFactory);
		Properties prop = misc.readData();
		String url = prop.getProperty("URL");
		brwsFactory.getDriver().get(url);
}
	
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
	
	}
