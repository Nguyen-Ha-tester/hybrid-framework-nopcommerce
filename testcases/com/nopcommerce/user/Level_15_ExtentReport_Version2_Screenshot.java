package com.nopcommerce.user;

import java.lang.reflect.Method;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import reportConfig.ExtentManagerV2;

public class Level_15_ExtentReport_Version2_Screenshot extends BaseTest {
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
	public void User_01_Register(Method method) {

		ExtentManagerV2.startTest(method.getName(), "User_01_Register");

		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 01: Navigate to Register page");
		homePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		registerPage = homePage.openRegisterPage();
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 02: Enter to firstname textbox with value is" + firstName + "'");
		registerPage.inputFirstName(firstName);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 03: Enter to lastname textbox with value is" + lastName + "'");
		registerPage.inputLastName(lastName);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 04: Enter to emailAddress textbox with value is" + emailAddress + "'");
		registerPage.inputEmail(emailAddress);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 05: Enter to password textbox with value is" + password + "'");
		registerPage.inputPassword(password);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 06: Enter to confirm password textbox with value is" + password + "'");
		registerPage.inputConfirmPassword(password);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 07: Click to register button");
		registerPage.clickRegisterButton();
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Register - Step 08: Verify register success message display ");
		verifyEquals(registerPage.getSuccessMessage(), "Your registration completed...");

		ExtentManagerV2.endTest();
	}

	@Test
	public void User_02_Login(Method method) {
		ExtentManagerV2.startTest(method.getName(), "User_02_Login");

		ExtentManagerV2.getTest().log(LogStatus.INFO, "Login - Step 01: Navigate to login page ");
		loginPage = registerPage.clickLoginLink();
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Login - Step 02: enter to email textbox with value is" + emailAddress + "'");
		loginPage.inputEmail(emailAddress);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Login - Step 03: enter to password textbox with value is" + password + "'");
		loginPage.inputPassword(password);
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Login - Step 04: Click to login button");
		homePage = loginPage.clickLoginButton();
		ExtentManagerV2.getTest().log(LogStatus.INFO, "Login - Step 05: Verify logout button is displayed.");
		verifyTrue(homePage.isLogOutLinkVisible());

		ExtentManagerV2.endTest();

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