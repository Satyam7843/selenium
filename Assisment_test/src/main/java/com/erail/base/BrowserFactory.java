package com.erail.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver() {
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
