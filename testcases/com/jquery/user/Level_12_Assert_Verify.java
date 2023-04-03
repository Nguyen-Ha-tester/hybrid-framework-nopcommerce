package com.jquery.user;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.jQuery.HomePageObjectUploadFile;
import pageObjects.jQuery.PageGeneratorManager;

public class Level_12_Assert_Verify extends BaseTest {
	// Soft Assert
	SoftAssert soft;
	private WebDriver driver;
	private HomePageObjectUploadFile homePageUploadFile;
	String oneFile = "3.png";
	String secondFile = "1.jpg";
	String[] multipleFile = { oneFile, secondFile };

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		soft = new SoftAssert();
		driver = getBrowserDriver(browserName);
		openPageUrl(driver, GlobalConstants.USER_PAGE_JQUERY_UPLOAD_FILE_URL);
		homePageUploadFile = new PageGeneratorManager().getHomePageUploadFiles(driver);

	}

	public void UploadFile_01_One_File_Per_Time() {
		homePageUploadFile.uploadMultipleFiles(driver, oneFile);
		// Soft Assert
		soft.assertTrue(homePageUploadFile.isFileLoaded(oneFile));
		homePageUploadFile.clickStartUploadFile(oneFile);
		// Hard Assert
		assertTrue(homePageUploadFile.isFileLinkUploaded(oneFile));
		// Hard Assert
		Assert.assertTrue(homePageUploadFile.isFileImageUploaded(oneFile));

		// bắt buộc
		soft.assertAll();

	}

	// verify (custome hard assert)
	@Test
	public void UploadFile_02_Multiple_File_Per_Time() {
		homePageUploadFile.refreshPage(driver);
		homePageUploadFile.uploadMultipleFiles(driver, multipleFile);
		homePageUploadFile.clickStartUploadFile(oneFile);
		homePageUploadFile.clickStartUploadFile(secondFile);

		verifyTrue(homePageUploadFile.isFileLinkUploaded(oneFile));
		verifyTrue(homePageUploadFile.isFileImageUploaded(oneFile));
		verifyTrue(homePageUploadFile.isFileLinkUploaded(secondFile));
		verifyTrue(homePageUploadFile.isFileImageUploaded(secondFile));

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
