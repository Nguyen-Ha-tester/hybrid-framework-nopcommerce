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

public class Level_03_Page_Object_Login extends BasePage {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browser_drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");

		homePage = new HomePageObject(driver);
		registerPage = new RegisterPageObject(driver);

		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";

		System.out.println("Precondition - Step 01: Click to register Link");
		homePage.clickRegisterLink();
		System.out.println("Precondition - Step 02: Input all valid required fields");
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);
		System.out.println("Precondition - Step 03: Click register button");
		registerPage.clickRegisterButton();
		System.out.println("Precondition - Step 04: Verify success message");
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed");
	}

	@Test
	public void Login_01_Empty_Data() {
		System.out.println("Login 01 - Step 1: Click in Log in link");
		homePage.clickLoginLink();

		System.out.println("Login 01 - Step 2: Intitial LoginPage");
		loginPage = new LoginPageObject(driver);

		System.out.println("Login 01 - Step 3: click in log in button");
		loginPage.clickLoginButton();

		System.out.println("Login 01 - Step 4: verify empty error message");
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextfield(), "Please enter your email");

	}

	@Test
	public void Login_02_Invalid_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "000");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Wrong email");

	}

	@Test
	public void Login_03_Success_With_Wrong_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "abc@abc.com");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_04_Existing_Email_Blank_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_05_Existing_Email_Wrong_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "33333333333333");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_06_Existing_Email_Correct_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "012345678");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
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