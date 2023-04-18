package com.nopcommerce.common;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Common_01_Register_New_Account extends BaseTest {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;

	@Parameters("browser")
	@BeforeTest(description = "Create New Common User for all class test")
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";

		log.info("Register - Step 01: Navigate to Register page");
		homePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		registerPage = homePage.openRegisterPage();

		log.info("Register - Step 02: Enter to firstname textbox with value is" + firstName + "'");
		registerPage.inputFirstName(firstName);

		log.info("Register - Step 03: Enter to lastname textbox with value is" + lastName + "'");
		registerPage.inputLastName(lastName);

		log.info("Register - Step 04: Enter to emailAddress textbox with value is" + emailAddress + "'");
		registerPage.inputEmail(emailAddress);

		log.info("Register - Step 05: Enter to password textbox with value is" + password + "'");
		registerPage.inputPassword(password);

		log.info("Register - Step 06: Enter to confirm password textbox with value is" + password + "'");
		registerPage.inputConfirmPassword(password);

		log.info("Register - Step 07: Click to register button");
		registerPage.clickRegisterButton();

		log.info("Register - Step 08: Verify register success message display ");
		verifyEquals(registerPage.getSuccessMessage(), "Your registration completed...");

	}

	@AfterTest
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);

	}

}