package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_19_Pattern_Object extends BaseTest {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";
	}

	@Test
	public void User_01_Register() {
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

	@Test
	public void User_02_Login() {
		log.info("Login - Step 01: Navigate to login page ");
		loginPage = registerPage.clickLoginLink();
		log.info("Login - Step 02: enter to email textbox with value is" + emailAddress + "'");
		loginPage.inputEmail(emailAddress);
		log.info("Login - Step 03: enter to password textbox with value is" + password + "'");
		loginPage.inputPassword(password);
		log.info("Login - Step 04: Click to login button");
		homePage = loginPage.clickLoginButton();
		log.info("Login - Step 05: Verify logout button is displayed.");
		verifyTrue(homePage.isLogOutLinkClickable());

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