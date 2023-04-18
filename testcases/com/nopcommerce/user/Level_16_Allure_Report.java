package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pageObjects.nopCommerce.user.PageGeneratorManagerNopCommerce;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_16_Allure_Report extends BaseTest {
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;

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

	@Description("Register to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void User_01_Register() {

		homePage = PageGeneratorManagerNopCommerce.getUserHomePage(driver);
		registerPage = homePage.openRegisterPage();
		registerPage.inputFirstName(firstName);
		registerPage.inputLastName(lastName);
		registerPage.inputEmail(emailAddress);
		registerPage.inputPassword(password);
		registerPage.inputConfirmPassword(password);
		registerPage.clickRegisterButton();
		Assert.assertEquals(registerPage.getSuccessMessage(), "Your registration completed...");
	}

	@Description("Login to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void User_02_Login() {
		loginPage = registerPage.clickLoginLink();
		loginPage.inputEmail(emailAddress);
		loginPage.inputPassword(password);
		homePage = loginPage.clickLoginButton();
		Assert.assertTrue(homePage.isLogOutLinkClickable());

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