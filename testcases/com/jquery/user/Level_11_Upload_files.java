package com.jquery.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.jQuery.HomePageObjectUploadFile;
import pageObjects.jQuery.PageGeneratorManager;

public class Level_11_Upload_files extends BaseTest {
	private WebDriver driver;
	private HomePageObjectUploadFile homePageUploadFile;
	String oneFile = "2.png";
	String secondFile = "1.jpg";
	String[] multiplefile = { oneFile, secondFile };

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		openPageUrl(driver, GlobalConstants.USER_PAGE_JQUERY_UPLOAD_FILE_URL);
		homePageUploadFile = new PageGeneratorManager().getHomePageUploadFiles(driver);

	}

	@Test
	public void UploadFile_01_One_File_Per_Time() {
		homePageUploadFile.uploadMultipleFiles(driver, oneFile);
		Assert.assertTrue(homePageUploadFile.isFileLoaded(oneFile));
		homePageUploadFile.clickStartUploadFile(oneFile);

	}

	@Test
	public void UploadFile_02_Multiple_File_Per_Time() {
		homePageUploadFile.uploadMultipleFiles(driver, multiplefile);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
