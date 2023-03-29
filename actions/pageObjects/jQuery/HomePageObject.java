package pageObjects.jQuery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jQuery.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void paginationByPageNumber(String pageNumber) {
		waitForElementVisible(driver, HomePageUI.DYNAMIC_PAGINATION_BY_NUMBER, pageNumber);
		clickToElement(driver, HomePageUI.DYNAMIC_PAGINATION_BY_NUMBER, pageNumber);
	}

	public boolean isPageNumberActived(String pageNumber) {
		waitForElementVisible(driver, HomePageUI.DYNAMIC_PAGINATION_PAGE_ACTIVED_BY_NUMBER, pageNumber);
		return isElementDisplayed(driver, HomePageUI.DYNAMIC_PAGINATION_PAGE_ACTIVED_BY_NUMBER, pageNumber);
	}

	public void searchByColumn(String columnName, String columnValue) {
		waitForElementClickable(driver, HomePageUI.DYNAMIC_COLUMN_NAME, columnName);
		sendkeyToElement(driver, HomePageUI.DYNAMIC_COLUMN_NAME, columnValue, columnName);
		pressKeyToElement(driver, HomePageUI.DYNAMIC_COLUMN_NAME, Keys.ENTER, columnName);
	}

	public void enterToTextboxOfColumnNameAtRowNumber(String string, String string2, String string3) {

	}

}
