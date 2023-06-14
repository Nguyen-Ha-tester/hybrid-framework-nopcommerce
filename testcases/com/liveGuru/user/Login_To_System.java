package com.liveGuru.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.MyAccountPageObject;
import pageObjects.liveGuru.PageGeneratorManager;
import pageObjects.liveGuru.RegisterPageObject;

public class Login_To_System extends BaseTest {
	private WebDriver driver;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private RegisterPageObject registerPage;
	private MyAccountPageObject myAccountPage;
	private String firstName, lastName, emailAddress, password, confirmPassword;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationfc" + generateFakeNumber() + "@gmail.com";
		password = "123456";
		confirmPassword = "123456";
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickAccountMenuButton();
		homePage.clickRegisterButton();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmailAddress(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(confirmPassword);
		registerPage.clickRegisterButton();

		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);

		Assert.assertEquals(myAccountPage.getSuccessMessage(), "Thank you for registering with Main Website Store.");
		myAccountPage.clickAccountDropdown();
		myAccountPage.clickLogoutButton();
	}

	@Test
	public void User_01_Login_To_System() {
		homePage = PageGeneratorManager.getHomePage(driver);
		homePage.clickAccountLoginButton();
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputEmailAddress(emailAddress);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);
		Assert.assertEquals(myAccountPage.getHelloMessage(), "Hello, " + firstName + " " + lastName + "!");
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