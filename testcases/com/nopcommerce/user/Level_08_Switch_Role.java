package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.nopCommerce.admin.AdminDashboardPageObject;
import pageObjects.nopCommerce.admin.AdminLoginPageObject;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_08_Switch_Role extends BaseTest {
	private WebDriver driver;
	private String userEmailAddress, userFirstName, userLastName, userPassword, adminEmailAddress, adminPassword;
	private UserHomePageObject userHomePage;
	private UserRegisterPageObject userRegisterPage;
	private UserLoginPageObject userLoginPage;
	private AdminLoginPageObject adminLoginPage;
	private AdminDashboardPageObject adminDashboardPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		userFirstName = "Automation";
		userLastName = "FC";
		userEmailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		userPassword = "123456x";
		adminEmailAddress = "admin@yourstore.com";
		adminPassword = "admin";

		userHomePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		userRegisterPage = userHomePage.openRegisterPage();
		userRegisterPage.inputFirstName(userFirstName);
		userRegisterPage.inputLastName(userLastName);
		userRegisterPage.inputEmail(userEmailAddress);
		userRegisterPage.inputPassword(userPassword);
		userRegisterPage.inputConfirmPassword(userPassword);
		userRegisterPage.clickRegisterButton();
		Assert.assertEquals(userRegisterPage.getSuccessMessage(), "Your registration completed");
		openPageUrl(driver, GlobalConstants.USER_PAGE_NOP_COMMERCE_URL);
	}

	@Test
	public void Role_01_User_To_Admin() {
		// Login as User role

		userLoginPage = userRegisterPage.clickLoginLink();
		userHomePage = userLoginPage.loginAsUser(userEmailAddress, userPassword);
		Assert.assertTrue(userHomePage.isLogOutLinkVisible());

		// Logout user
		// userHomePage = userHomePage.clickLogoutLinkAtUserPage(driver);
		// Login as Admin role
		userHomePage.openPageUrl(driver, GlobalConstants.ADMIN_PAGE_URL);
		adminLoginPage = PageGeneratorManagerNopCommerce.getAdminLoginPage(driver);
		adminLoginPage.loginAsAdmin(adminEmailAddress, adminPassword);
		adminDashboardPage = PageGeneratorManagerNopCommerce.getAdminDashboardPage(driver);
		Assert.assertTrue(adminDashboardPage.isDashboardHeaderDisplayed());
		// Logout admin
		adminLoginPage = adminDashboardPage.clickLogoutLinkAtAdminPage(driver);
	}

	@Test
	public void Role_02_Admin_Login() {
		// Login Page (admin) -> Login Page (User)
		adminLoginPage.openPageUrl(driver, GlobalConstants.USER_PAGE_NOP_COMMERCE_URL);
		userHomePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		userLoginPage = userHomePage.clickLoginLink();

	}

	@Test
	public void Role_03_Switch_Role() {

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