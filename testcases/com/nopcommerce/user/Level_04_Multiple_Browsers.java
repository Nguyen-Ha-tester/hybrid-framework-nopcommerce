package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_04_Multiple_Browsers extends BaseTest {
	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = new UserHomePageObject(driver);
		homePage.loadLoginPage();
	}

	@Test
	public void Register_Empty_Data() {
		System.out.println("Register 01 - Step 01: Click to register Link");
		homePage.openRegisterPage();

		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register 02 - Step 01: Click to register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 03 - Step 01: Verify error message");
		Assert.assertEquals(registerPage.getFirstNameErrorMassege(), "First name is required.");
		Assert.assertEquals(registerPage.getLastNameErrorMassege(), "Last name is required.");
		Assert.assertEquals(registerPage.getEmailErrorMassege(), "Email is required.");
		Assert.assertEquals(registerPage.getPasswordErrorMassege(), "Password is required.");
		Assert.assertEquals(registerPage.getConfirmPasswordErrorMassege(), "Password is required.");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);

	}

}