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

public class Level_03_Page_Object_Register extends BasePage {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");

		homePage = new HomePageObject(driver);
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";
	}

	@Test
	public void Register_01_Empty_Data() {
		System.out.println("Register 01 - Step 01: Click to register Link");
		homePage.clickRegisterLink();

		registerPage = new RegisterPageObject(driver);

		System.out.println("Register 02 - Step 01: Click to register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 03 - Step 01: Verify error message");
		Assert.assertEquals(registerPage.getFirstNameErrorMassege(), "First name is required.");
		Assert.assertEquals(registerPage.getLastNameErrorMassege(), "Last name is required.");
		Assert.assertEquals(registerPage.getEmailErrorMassege(), "Email is required.");
		Assert.assertEquals(registerPage.getPasswordErrorMassege(), "Password is required.");
		Assert.assertEquals(registerPage.getConfirmPasswordErrorMassege(), "Password is required.");

	}

	@Test
	public void Register_02_Invalid_Email() {
		System.out.println("Register 02 - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		System.out.println("Register 02 - Step 02: Input invalid email");
		registerPage.inputEmail("000");

		System.out.println("Register 02 - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 02 - Step 04: Verify invalid wrong error message");
		Assert.assertEquals(registerPage.getEmailErrorMassege(), "Wrong email");

	}

	@Test
	public void Register_03_Success() {
		System.out.println("Register 03 - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		System.out.println("Register 03 - Step 02: Input all valid required fields");
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);

		System.out.println("Register 03 - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 03 - Step 04: Verify success message");
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed");

		loginPage = new LoginPageObject(driver);
		System.out.println("Register 03 - Step 05: Relogin");
		registerPage.clickLoginLink();

		System.out.println("Register 03 - Step 06: Input all required fields");
		loginPage.inputEmail(emailAddress);
		loginPage.inputPassword(password);

		System.out.println("Register 03 - Step 07: Click login button");
		loginPage.clickLoginButton();

		System.out.println("Register 03 - Step 08: click logout button");
		homePage.clickLogoutLink();

		homePage = new HomePageObject(driver);

	}

	@Test
	public void Register_04_Existing_Email() {
		System.out.println("Register 04 - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		System.out.println("Register 04 - Step 02: Input existing email field");
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);

		System.out.println("Register 04 - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 04 - Step 04: Verify existing email error message");
		Assert.assertEquals(registerPage.getExistingEmailErrorMassege(), "The specified email already exists");
	}

	@Test
	public void Register_05_Password_Less_Than_6_Chars() {
		System.out.println("Register 05 - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		System.out.println("Register 05 - Step 02: Input password field under 6 chars");
		registerPage.inputPassword("010");

		System.out.println("Register 05 - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 05 - Step 04: Verify error password message");
		Assert.assertEquals(registerPage.getPasswordErrorMassege(), "Password must meet the following rules:\nmust have at least 6 characters");
	}

	@Test
	public void Register_06_Invalid_Confirm_Password() {
		System.out.println("Register 06 - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		System.out.println("Register 06 - Step 02: Input invalid confirm password field");
		registerPage.inputPassword("0123456");
		registerPage.inputConfirmPassword("010");

		System.out.println("Register 06 - Step 03: Click register button");
		registerPage.clickRegisterButton();

		System.out.println("Register 06 - Step 04: Verify error confirm password message");
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