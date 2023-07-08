package com.nopcommerce.user;

import java.util.Random;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserDataMapper;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.Environment;

public class Level_24_Multiple_Environment_Java_Owner_Library extends BaseTest {
	private UserDataMapper userData;
	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	String email;
	Environment environment;

	@Parameters({ "browser", "environment" })
	@BeforeClass
	public void beforeClass(String browserName, String environmentName) {
		environment = ConfigFactory.create(Environment.class); // Tạo ra 1 instance của class Environment, sử dụng
		driver = getBrowserDriver(browserName, environment.appURL());
		// Gọi về class environment -> class environment gọi về file properties để lấy dữ liệu
		System.out.println(environment.getAppPassword());
		System.out.println(environment.getAppUserName());
		System.out.println(environment.getDbHost());
		System.out.println(environment.getDbUser());
		System.out.println(environment.getDbPassword());

		userData = UserDataMapper.getUserData();
		email = userData.getEmail() + generateFakeNumber() + "@gmail.com";

	}

	@Test
	public void User_01_Register() {
		homePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		registerPage = homePage.openRegisterPage();
		registerPage.inputToTextboxByID(driver, "FirstName", userData.getFirstname());
		registerPage.inputToTextboxByID(driver, "LastName", userData.getLastname());
		registerPage.inputToTextboxByID(driver, "Email", email);
		registerPage.inputToTextboxByID(driver, "Password", userData.getPassword());
		registerPage.inputToTextboxByID(driver, "ConfirmPassword", userData.getPassword());
		registerPage.clickRegisterButton();
		verifyEquals(registerPage.getSuccessMessage(), "Your registration completed");

	}

	@Test
	public void User_02_Login() {
		loginPage = registerPage.clickLoginLink();
		loginPage.inputToTextboxByID(driver, "Email", email);
		loginPage.inputToTextboxByID(driver, "Password", userData.getPasswordLogin());
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