package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;

public class Level_02_Login_Apply_BasePage extends BasePage {
	WebDriver driver;
	public String emailAddress;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "./browserDrivers/geckodriver");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		emailAddress = "automationfc" + generateFakeNumber() + "@gmail.com";
	}

	@Test
	public void TC_00_Register_Success() {
		driver.get("https://demo.nopcommerce.com/");
		waitForElementClickable(driver, "//a[@class='ico-register']");
		clickToElement(driver, "//a[@class='ico-register']");

		sendkeyToElement(driver, "//input[@id='FirstName']", "Automation");
		sendkeyToElement(driver, "//input[@id='LastName']", "Testing");
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "012345678");
		sendkeyToElement(driver, "//input[@id='ConfirmPassword']", "012345678");

		clickToElement(driver, "//button[@id='register-button']");

		Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
	}

	@Test
	public void TC_01_Login_Empty_Data() {
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Please enter your email");

	}

	@Test
	public void TC_02_Login_Invalid_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "000");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Wrong email");

	}

	@Test
	public void TC_03_Login_Success_With_Wrong_Email() {
		sendkeyToElement(driver, "//input[@id='Email']", "abc@abc.com");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_04_Login_Existing_Email_Blank_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_05_Login_Existing_Email_Wrong_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "33333333333333");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void TC_06_Login_Existing_Email_Correct_Password() {
		sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
		sendkeyToElement(driver, "//input[@id='Password']", "012345678");
		clickToElement(driver, "//button[contains(@class,'login-button')]");
		Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
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