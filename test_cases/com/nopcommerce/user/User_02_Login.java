package com.nopcommerce.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;

public class User_02_Login extends BasePage {
	WebDriver driver;
	Level_03_Apply_Base_Page level03 = new Level_03_Apply_Base_Page();

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browser_drivers/geckodriver");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}

	@Test
	public void TC_01_Login_Empty_Data() {
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Please enter your email");

	}

	@Test
	public void TC_02_Login_Invalid_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "000");
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Wrong email");

	}

	@Test
	public void TC_03_Login_Success_With_Wrong_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "abc@abc.com");
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_04_Login_Existing_Email_Blank_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", level03.emailAddress);
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_05_Login_Existing_Email_Wrong_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", level03.emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "33333333333333");
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_06_Login_Existing_Email_Correct_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", level03.emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "012345678");
		clickToElement(driver, "//button[@class='button-1 login-button']");
		Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}