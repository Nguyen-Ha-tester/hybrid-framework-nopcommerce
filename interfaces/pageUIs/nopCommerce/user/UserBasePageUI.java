package pageUIs.nopCommerce.user;

public class UserBasePageUI {

	public static final String ADDRESSES_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Addresses']";
	public static final String ORDERS_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Orders']";
	public static final String REWARD_POINTS_LINK = "xpath=//div[@class='block block-account-navigation']//a[text()='Reward points']";
	public static final String LOG_OUT_LINK = "class=ico-logout";

	// Dùng dynamic-dùng theo pattern object.
	public static final String DYNAMIC_PAGES_IN_MY_ACCOUNT_PAGE = "xpath=//div[@class='block block-account-navigation']//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_LOGIN_BUTTON_BY_TEXT = null;

}
