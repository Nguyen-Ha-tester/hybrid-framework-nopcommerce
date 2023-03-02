package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.LoginPageObject;
import pageObjects.nopCommerce.MyAccountPageObject;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.RegisterPageObject;

public class Level_07_Switch_Page extends BaseTest {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private MyAccountPageObject myAccountPage;

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
	public void User_01_Register_Page() {
		homePage = PageGeneratorManager.getHomePage(driver);
		registerPage = homePage.clickRegisterLink();
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);
		registerPage.clickRegisterButton();
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed");

	}

	@Test
	public void User_02_Login_Page() {
		loginPage = registerPage.clickLoginLink();
		loginPage.inputEmail(emailAddress);
		loginPage.inputPassword(password);
		homePage = loginPage.clickLoginButton();
		Assert.assertTrue(homePage.isLogOutLinkClickable());
	}

	@Test
	public void User_03_My_Account() {
		myAccountPage = homePage.clickMyAccountLink();
		myAccountPage.clickNewsletterCheckbox();
	}

	@Test
	public void User_04_Switch_Page() {

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