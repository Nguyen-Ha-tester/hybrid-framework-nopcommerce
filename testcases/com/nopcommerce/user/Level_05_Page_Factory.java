package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageFactory.nopCommerce.HomePageFactory;
import pageFactory.nopCommerce.LoginPageFactory;
import pageFactory.nopCommerce.RegisterPageFactory;

public class Level_05_Page_Factory extends BaseTest {
	private WebDriver driver;
	private String existingEmailAddress, unregistedEmailAddress, invalidEmailAddress, firstName, lastName, password, wrongPassword;
	private HomePageFactory homePage;
	private RegisterPageFactory registerPage;
	private LoginPageFactory loginPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		firstName = "Automation";
		lastName = "FC";
		existingEmailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		invalidEmailAddress = "abd";
		unregistedEmailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";
		wrongPassword = "abc";
		homePage = new HomePageFactory(driver);
		homePage.clickRegisterLink();
		registerPage = new RegisterPageFactory(driver);
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
		loginPage = new LoginPageFactory(driver);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextfield(), "Please enter your email");
	}

	@Test
	public void Login_02_Invalid_Email() {
		loginPage = new LoginPageFactory(driver);
		loginPage.inputEmail(invalidEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextfield(), "Wrong email");
	}

	@Test
	public void Login_03_Unregisted_Email() {
		loginPage = new LoginPageFactory(driver);
		loginPage.inputEmail(unregistedEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_04_Existing_Email_Blank_Password() {
		loginPage = new LoginPageFactory(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_05_Existing_Email_Wrong_Password() {
		loginPage = new LoginPageFactory(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.inputPassword(wrongPassword);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorMessageAboveEmailField(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_06_Existing_Email_Correct_Password() {
		loginPage = new LoginPageFactory(driver);
		loginPage.inputEmail(existingEmailAddress);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		homePage = new HomePageFactory(driver);
		Assert.assertTrue(homePage.isLogOutLinkClickable());
	}

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);

	}

}