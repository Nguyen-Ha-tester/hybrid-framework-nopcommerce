package pageUIs.jQuery;

public class HomePageUI {

	public static final String DYNAMIC_PAGINATION_BY_NUMBER = "xpath=//li[@class='qgrd-pagination-page']/a[text()='%s']";
	public static final String DYNAMIC_PAGINATION_PAGE_ACTIVED_BY_NUMBER = "xpath=//li[@class='qgrd-pagination-page']/a[contains(@class,'active') and text()='%s']";
	public static final String DYNAMIC_COLUMN_NAME = "xpath=//div[text()='%s']/parent::div/following-sibling::input";

	// Lấy index của cột mình cần click vào
	public static final String COLUMN_INDEX_BY_NAME = "";
}
