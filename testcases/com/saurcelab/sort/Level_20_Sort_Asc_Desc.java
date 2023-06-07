package com.saurcelab.sort;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class Level_20_Sort_Asc_Desc extends BaseTest {
	private WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
	}

	@Test
	public void Sort_01_Name() {

	}

	@Test
	public void Sort_02_Price() {

	}

	@AfterClass
	public void afterClass() {
		closeBrowserDriver();
		;
	}

}