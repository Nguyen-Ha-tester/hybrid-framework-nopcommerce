package pageUIs.saucelab;

public class BasePageUI {

	public static final String ADDRESSES_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Addresses']";
	public static final String ORDERS_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Orders']";
	public static final String REWARD_POINTS_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Reward points']";
	public static final String LOG_OUT_LINK = "class=ico-logout";

	// Dùng dynamic-dùng theo pattern object.
	public static final String DYNAMIC_PAGES_IN_MY_ACCOUNT_PAGE = "xpath=//div[@class='block block-account-navigation']//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_LOGIN_BUTTON_BY_TEXT = "xpath=//button[@name='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME = "";
	public static final String DYNAMIC_RADIO_BUTTON_BY_NAME = "xpath=//input[@name='%s']";
	public static final String DYNAMIC_CHECKBOX_BY_NAME = "xpath=//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA = "xpath=//textarea[@name='%s']";
	public static final String DYNAMIC_LINK = "xpath=//a[@name='%s']";
	public static final String DYNAMIC_ERROR_MESSAGE = "xpath=//td[text()='%s']/following-sibling::td/label";

}
