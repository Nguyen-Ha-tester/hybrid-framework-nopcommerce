package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserData;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_22_Data_Driven_Testing extends BaseTest {
	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

	@Parameters({ "browser", "urlPage" })
	@BeforeClass
	public void beforeClass(String browserName, String urlPage) {
		driver = getBrowserDriver(browserName, urlPage);
		// chuyển việc khai báo data về class UserData
	}

	@Test
	public void User_01_Register() {
		homePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		registerPage = homePage.openRegisterPage();
		registerPage.inputToTextboxByID(driver, "FirstName", UserData.Register.FIRSTNAME);
		registerPage.inputToTextboxByID(driver, "LastName", UserData.Register.FIRSTNAME);
		registerPage.inputToTextboxByID(driver, "Email", UserData.Register.EMAIL);
		registerPage.inputToTextboxByID(driver, "Password", UserData.Register.PASSWORD);
		registerPage.inputToTextboxByID(driver, "ConfirmPassword", UserData.Register.PASSWORD);
		registerPage.clickRegisterButton();
		verifyEquals(registerPage.getSuccessMessage(), "Your registration completed");

	}

	@Test
	public void User_02_Login() {
		loginPage = registerPage.clickLoginLink();
		loginPage.inputToTextboxByID(driver, "Email", UserData.Register.EMAIL);
		loginPage.inputToTextboxByID(driver, "Password", UserData.Register.PASSWORD);
		homePage = loginPage.clickLoginButton();
		verifyTrue(homePage.isLogOutLinkVisible());

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserDriver();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);

	}

}