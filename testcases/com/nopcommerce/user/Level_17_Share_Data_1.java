package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.common.Common_01_Register_End_User;

import commons.BaseTest;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_17_Share_Data_1 extends BaseTest {

	// login sử dụng register common class để tự login tiếp bằng cách điền email, password

	private WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private String emailAddress, password;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		registerPage = PageGeneratorManagerNopCommerce.getUserRegisterPage(driver);

		emailAddress = Common_01_Register_End_User.emailAddress;
		password = Common_01_Register_End_User.password;

		log.info("Login - Step 01: Navigate to login page ");
		loginPage = registerPage.clickLoginLink();
		log.info("Login - Step 02: enter to email textbox with value is" + emailAddress + "'");
		loginPage.inputEmail(emailAddress);
		log.info("Login - Step 03: enter to password textbox with value is" + password + "'");
		loginPage.inputPassword(password);
		log.info("Login - Step 04: Click to login button");
		homePage = loginPage.clickLoginButton();
		log.info("Login - Step 05: Verify logout button is displayed.");
		verifyTrue(homePage.isLogOutLinkClickable());
	}

	@Test
	public void Login_01() {

	}

	@Test
	public void Login_02() {

	}

	@Test
	public void Login_03() {

	}

	@Test
	public void Login_04() {

	}

	@Test
	public void Login_05() {

	}

	@Test
	public void Login_06() {

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