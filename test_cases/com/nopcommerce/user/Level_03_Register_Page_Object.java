package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Level_03_Register_Page_Object extends BasePage {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browser_drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		homePage = new HomePageObject(driver);
		registerPage = new RegisterPageObject(driver);
		loginPage = new LoginPageObject(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456";
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 01: Click to register button");
		registerPage.clickRegisterButton();

		Assert.assertEquals(registerPage.getFirstNameErrorMassege(), "First name is required.");
		Assert.assertEquals(registerPage.getLastNameErrorMassege(), "Last name is required.");
		Assert.assertEquals(registerPage.getEmailErrorMassege(), "Email is required.");
		Assert.assertEquals(registerPage.getPasswordErrorMassege(), "Password is required.");
		Assert.assertEquals(registerPage.getConfirmPasswordErrorMassege(), "Password is required.");

	}

	@Test
	public void TC_02_Register_Invalid_Email() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 02: Input invalid email");
		registerPage.inputEmail("000");

		System.out.println("Register Page - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register Page - Step 03: Verify invalid wrong error message");
		Assert.assertEquals(registerPage.getEmailErrorMassege(), "Wrong email");

	}

	@Test
	public void TC_03_Register_Success() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 02: Input all valid required fields");
		registerPage.inputEmail(emailAddress);
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);

		System.out.println("Register Page - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register Page - Step 04: Verify success message");
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed");

		System.out.println("Register Page - Step 05: Relogin");
		registerPage.clickLoginLink();

		System.out.println("Login Page - Step 06: Input all required fields");
		loginPage.inputEmail(emailAddress);
		loginPage.inputPassword(password);

		System.out.println("Login Page - Step 07: Click login button");
		loginPage.clickLoginButton();

		System.out.println("Home Page - Step 08: click logout button");
		homePage.clickLogoutLink();
	}

	@Test
	public void TC_04_Register_Existing_Email() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 02: Input existing email field");
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);

		System.out.println("Register Page - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register Page - Step 04: Verify existing email error message");
		Assert.assertEquals(registerPage.getExistingEmailErrorMassege(), "The specified email already exists");
	}

	@Test
	public void TC_05_Register_Password_Less_Than_6_Chars() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 02: Input password field under 6 chars");
		registerPage.inputPassword("010");

		System.out.println("Register Page - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register Page - Step 04: Verify error password message");
		Assert.assertEquals(registerPage.getPasswordErrorMassege(), "Password must meet the following rules:\nmust have at least 6 characters");
	}

	@Test
	public void TC_06_Register_Invalid_Confirm_Password() {
		System.out.println("Home Page - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		System.out.println("Register Page - Step 02: Input invalid confirm password field");
		registerPage.inputPassword("0123456");
		registerPage.inputConfirmPassword("010");

		System.out.println("Register Page - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register Page - Step 04: Verify error confirm password message");
		Assert.assertEquals(registerPage.getConfirmPasswordErrorMassege(), "The password and confirmation password do not match.");
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