package com.facebook.register;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.facebook.LoginPageObject;
import pageObjects.facebook.PageGeneratorManager;

public class Level_13_Element_Undisplayed extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		openPageUrl(driver, GlobalConstants.FACEBOOK_URL);
		loginPage = new PageGeneratorManager().getLoginPage(driver);
	}

	@Test
	public void TC_01_Verify_Element_Displayed() {
		loginPage.clickCreateNewAccount();
		verifyTrue(loginPage.isEmailAddressTextboxDisplayed());
	}

	@Test
	public void TC_02_Verify_Element_Undisplayed_Presence() {
		// Có thể dùng 2 cách:
		// Cách 1: Dùng verifyTrue element undisplayed
		// Cách 2: Dùng verifyFalse element displayed

		verifyFalse(loginPage.isConfirmEmailAddressTextboxDisplayed());
	}

	@Test
	public void TC_03_Verify_Element_Undisplayed_Staleness() {
		loginPage.clickCloseIcon();
		loginPage.sleepInSecond(2);
		verifyTrue(loginPage.isConfirmEmailAddressTextboxUndisplayedInDom());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
