package com.erail.test;

import org.testng.annotations.Test;

import com.erail.pages.HomePage;

public class HomeTest  {
	
public static HomePage homePage;
	
	public HomeTest(HomePage homePage) {
        this.homePage = homePage;
    }
@Test
public static void test_case_1() {
	
		homePage.click_city();
		homePage.enter_from();
		homePage.select_name();
	
	
}

	
}
