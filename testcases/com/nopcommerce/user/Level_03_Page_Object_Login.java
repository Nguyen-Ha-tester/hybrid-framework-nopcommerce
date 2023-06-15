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
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_03_Page_Object_Login extends BasePage {
	private WebDriver driver;
	private String existingEmailAddress, unregistedEmailAddress, invalidEmailAddress, firstName, lastName, password, wrongPassword;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		firstName = "Automation";
		lastName = "FC";
		existingEmailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		invalidEmailAddress = "abd";
		unregistedEmailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";
		wrongPassword = "abc";
		homePage = new UserHomePageObject(driver);
		registerPage = new UserRegisterPageObject(driver);
		homePage.openRegisterPage();
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(existingEmailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);
		registerPage.clickRegisterButton();
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed");
		registerPage.clickLoginLink();
	}

	@Test
	public void Login_01_Empty_Data() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextfield(), "Please enter your email");
	}

	@Test
	public void Login_02_Invalid_Email() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.inputEmail(invalidEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextfield(), "Wrong email");
	}

	@Test
	public void Login_03_Unregisted_Email() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.inputEmail(unregistedEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_04_Existing_Email_Blank_Password() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_05_Existing_Email_Wrong_Password() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.inputPassword(wrongPassword);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_06_Existing_Email_Correct_Password() {
		loginPage = new UserLoginPageObject(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		homePage = new UserHomePageObject(driver);
		Assert.assertTrue(homePage.isLogOutLinkVisible());
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