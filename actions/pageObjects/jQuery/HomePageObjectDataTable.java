package pageObjects.jQuery;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUIs.jQuery.HomePageUIDataTable;

public class HomePageObjectDataTable extends BasePage {
	private WebDriver driver;

	public HomePageObjectDataTable(WebDriver driver) {
		this.driver = driver;
	}

	public void paginationByPageNumber(String pageNumber) {
		waitForElementVisible(driver, HomePageUIDataTable.DYNAMIC_PAGINATION_BY_NUMBER, pageNumber);
		clickToElement(driver, HomePageUIDataTable.DYNAMIC_PAGINATION_BY_NUMBER, pageNumber);
	}

	public boolean isPageNumberActived(String pageNumber) {
		waitForElementVisible(driver, HomePageUIDataTable.DYNAMIC_PAGINATION_PAGE_ACTIVED_BY_NUMBER, pageNumber);
		return isElementDisplayed(driver, HomePageUIDataTable.DYNAMIC_PAGINATION_PAGE_ACTIVED_BY_NUMBER, pageNumber);
	}

	public void searchByColumn(String columnName, String columnValue) {
		waitForElementClickable(driver, HomePageUIDataTable.DYNAMIC_COLUMN_NAME, columnName);
		sendkeyToElement(driver, HomePageUIDataTable.DYNAMIC_COLUMN_NAME, columnValue, columnName);
		pressKeyToElement(driver, HomePageUIDataTable.DYNAMIC_COLUMN_NAME, Keys.ENTER, columnName);
	}

	public List<String> getValueEachRowAtAllPage() {
		int numberOfAllPages = getElementSize(driver, HomePageUIDataTable.ALL_PAGE_LOCATOR);

		// Gọi biến sum
		List<String> valueInAllRowsAllPages = new ArrayList<String>();
		// Gọi biến sum của value không trùng nhau: list set thì dùng cho các value k trùng, nếu trùng sẽ tự loại bỏ ra khỏi list
		// Set<String> uniqueValueInAllRowsAllPages = new HashSet<String>();

		// Duyệt qua từng page
		for (int index = 1; index < numberOfAllPages; index++) {
			clickToElement(driver, HomePageUIDataTable.DYNAMIC_PAGINATION_INDEX, String.valueOf(index));

			List<WebElement> allRowElementEachPage = getListWebElements(driver, HomePageUIDataTable.EACH_ROW_EACH_PAGE);
			// tại từng page, gọi ra từng row
			for (WebElement eachRow : allRowElementEachPage) {
				// tại từng row, get text từng row và add vào biến sum
				valueInAllRowsAllPages.add(eachRow.getText());

			}

		}
		for (String valueEachRowEachPage : valueInAllRowsAllPages) {
			System.out.println("__________________________________");
			System.out.println(valueEachRowEachPage);
		}
		return valueInAllRowsAllPages;
	}

	public void enterToTextboxOfColumnNameAtRowNumber(String columnName, String rowNumber, String valueInTextField) {
		int columnIndex = getElementSize(driver, HomePageUIDataTable.DYNAMIC_COLUMN_INDEX_BY_NAME, columnName) + 1;
		waitForElementVisible(driver, HomePageUIDataTable.DYNAMIC_TEXT_FIELD, rowNumber, String.valueOf(columnIndex));
		sendkeyToElement(driver, HomePageUIDataTable.DYNAMIC_TEXT_FIELD, valueInTextField, rowNumber, String.valueOf(columnIndex));
	}

	public void selectDropdownOfColumnNameAtRowNumber(String columnName, String rowNumber, String valueInDropDown) {
		int columnIndex = getElementSize(driver, HomePageUIDataTable.DYNAMIC_COLUMN_INDEX_BY_NAME, columnName) + 1;
		waitForElementClickable(driver, HomePageUIDataTable.DYNAMIC_DROPDOWN, rowNumber, String.valueOf(columnIndex));
		selectItemInDefaultDropdown(driver, HomePageUIDataTable.DYNAMIC_DROPDOWN, valueInDropDown, rowNumber, String.valueOf(columnIndex));

	}

}
