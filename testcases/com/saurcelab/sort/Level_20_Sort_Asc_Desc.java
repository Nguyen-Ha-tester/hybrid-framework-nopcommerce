package com.saurcelab.sort;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.SauceLab.LoginPageObject;
import pageObjects.SauceLab.PageGeneratorManager;
import pageObjects.SauceLab.ProducPageObject;

public class Level_20_Sort_Asc_Desc extends BaseTest {
	private WebDriver driver;
	private LoginPageObject loginPage;
	private ProducPageObject productPage;

	@Parameters({ "browser", "urlPage" })
	@BeforeClass
	public void beforeClass(String browserName, String urlPage) {
		driver = getBrowserDriver(browserName, urlPage);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputEmail("");
		loginPage.inputPassword("");
		productPage = loginPage.clickLoginButton();
	}

	@Test
	public void Sort_01_Name() {
		// Ascending
		productPage.sortProduct("Name (A to Z)");
		// Descending
		productPage.sortProduct("Name (Z to A)");
	}

	@Test
	public void Sort_02_Price() {
		// Ascending
				productPage.sortProduct("Price (low to high)");
				// Descending
				productPage.sortProduct("Price (high to low)");

	}

	@AfterClass
	public void afterClass() {
		closeBrowserDriver();
		;
	}

}