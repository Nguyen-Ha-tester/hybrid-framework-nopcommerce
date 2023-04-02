package com.jquery.user;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.jQuery.HomePageObjectDataTable;
import pageObjects.jQuery.PageGeneratorManager;

public class Level_10_DataGrid_DataTable extends BaseTest {
	private WebDriver driver;
	List<String> actualValueAllRowsAllPages;
	List<String> expectedValueAllRowsAllPages;
	private HomePageObjectDataTable homePage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		openPageUrl(driver, GlobalConstants.USER_PAGE_JQUERY_URL);
		homePage = new PageGeneratorManager().getHomePageDataTable(driver);

	}

	public void Table_01_Open_Page() {
		homePage.paginationByPageNumber("3");
		Assert.assertTrue(homePage.isPageNumberActived("3"));
		homePage.paginationByPageNumber("7");
		Assert.assertTrue(homePage.isPageNumberActived("7"));
		homePage.paginationByPageNumber("22");
		Assert.assertTrue(homePage.isPageNumberActived("22"));
	}

	public void Table_02_Search__By_Column() {
		homePage.searchByColumn("Females", "384187");
		homePage.searchByColumn("Country", "Afghanistan");
		homePage.searchByColumn("Males", "407124");
		homePage.searchByColumn("Total", "791312");

	}

	public void Table_03_Get_Value_Each_Row_At_All_Page() {
		// Hàm đọc dữ liệu của file dataGridDemo
		// rồi lưu vào 1 list<String> = expectedValueAllRowsAllPages để so sánh với kết quả run test thực tế actual
		actualValueAllRowsAllPages = homePage.getValueEachRowAtAllPage();
		Assert.assertEquals(actualValueAllRowsAllPages, expectedValueAllRowsAllPages);
	}

	@Test
	public void Table_04_Enter_Textbox() {
		openPageUrl(driver, GlobalConstants.USER_PAGE_JQUERY_UR_2);
		homePage = new PageGeneratorManager().getHomePageDataTable(driver);
		homePage.enterToTextboxOfColumnNameAtRowNumber("Company", "1", "Michael 97");
		homePage.sleepInSecond(3);
	}

	@Test
	public void Table_05_Select_Dropdown() {
		homePage.selectDropdownOfColumnNameAtRowNumber("Country", "2", "Germany");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
