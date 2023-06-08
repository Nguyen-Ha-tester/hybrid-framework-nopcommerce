package com.saurcelab.sort;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

	String userName, password;

	@Parameters({ "browser", "urlPage" })
	@BeforeClass
	public void beforeClass(String browserName, String urlPage) {
		driver = getBrowserDriver(browserName, urlPage);
		userName = "standard_user";
		password = "secret_sauce";
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.inputUserName("user-name", userName);
		loginPage.inputPassword("password", password);
		productPage = loginPage.clickLoginButton("login-button");
	}

	public void Sort_01_Name() {
		// Ascending
		productPage.sortProduct("Name (A to Z)");
		Assert.assertTrue(productPage.isProductNameSortedByAscending());
		// Descending
		productPage.sortProduct("Name (Z to A)");
		Assert.assertTrue(productPage.isProductNameSortedByDescending());
	}

	@Test
	public void Sort_02_Price() {
		// Ascending
		productPage.sortProduct("Price (low to high)");
		Assert.assertTrue(productPage.isProductPriceSortedByAscending());
		// Descending
		productPage.sortProduct("Price (high to low)");
		Assert.assertTrue(productPage.isProductPriceSortedByDescending());

	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserDriver();
		;
	}

}