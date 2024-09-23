package com.erail.pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erail.base.FunctionalLibrary;
import com.erail.base.BrowserFactory;

public class HomePage {
	public HomePage(BrowserFactory browserFctry) {
		PageFactory.initElements(browserFctry.getDriver(), this);
		misc = new FunctionalLibrary(browserFctry);
	}
	FunctionalLibrary misc;
	JSONObject data;
	
	@FindBy(xpath = "//input[@id='txtStationFrom']")
	WebElement from_input;
	
	@FindBy(xpath = "//div[@title='Delhi Cantt']//div[1]")
	WebElement select_element;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	WebElement date_field;
	
	public void click_city() {
		from_input.clear();;
	}
	
	public void enter_from() {
		misc.elementSendKeys(select_element, "DEl");
	}
	
	public void select_name() {
		misc.selectByValue(select_element, "Delhi Azadpur");
	
}
}