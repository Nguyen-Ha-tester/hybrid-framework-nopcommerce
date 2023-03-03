package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.AddressesPageObject;
import pageObjects.nopCommerce.CustomerInforPageObject;
import pageObjects.nopCommerce.HomePageObject;
import pageObjects.nopCommerce.LoginPageObject;
import pageObjects.nopCommerce.OrdersPageObject;
import pageObjects.nopCommerce.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.RegisterPageObject;
import pageObjects.nopCommerce.RewardPointsPageObject;

public class Level_07_Switch_Page extends BaseTest {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private CustomerInforPageObject customerInforPage;
	private AddressesPageObject addressesPage;
	private OrdersPageObject ordersPage;
	private RewardPointsPageObject rewardPointsPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.get("https://demo.nopcommerce.com/");
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "automationtesting" + generateFakeNumber() + "@gmail.comm";
		password = "123456x";
	}

	@Test
	public void User_01_Register_Page() {
		homePage = PageGeneratorManagerNopCommerce.getHomePage(driver);
		registerPage = homePage.openRegisterPage();
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
	public void User_03_Customer_Infor() {
		customerInforPage = homePage.openCustomerInforPage();
		customerInforPage.clickNewsletterCheckbox();
		Assert.assertTrue(customerInforPage.isCustomerInforPageDisplayed());
	}

	@Test
	public void User_04_Switch_Page() {

		// customer info -> addresses
		addressesPage = customerInforPage.openAddressesPage(driver);
		// addresses --> orders
		ordersPage = addressesPage.openOrdersPage(driver);
		// orders --> reward points
		rewardPointsPage = ordersPage.openRewardPointsPage(driver);
	}

	@Test
	public void User_05_Switch_Role() {

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