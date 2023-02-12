package pageUIs;

public class RegisterPageUI {
	public static final String REGISTER_BUTTON = "//button[@id='register-button']";

	public static final String FIRST_NAME_TEXT_FIELD = "//input[@id='FirstName']";
	public static final String LAST_NAME_TEXT_FIELD = "//input[@id='LastName']";
	public static final String EMAIL_TEXT_FIELD = "//input[@id='Email']";
	public static final String PASSWORD_TEXT_FIELD = "//input[@id='Password']";
	public static final String CONFIRM_PASSWORD_TEXT_FIELD = "//input[@id='ConfirmPassword']";

	public static final String FIRST_NAME_ERROR_MESSAGE = "//span[@id='FirstName-error']";
	public static final String LAST_NAME_ERROR_MESSAGE = "//span[@id='LastName-error']";
	public static final String EMAIL_ERROR_MESSAGE = "//span[@id='Email-error']";
	public static final String PASSWORD_ERROR_MESSAGE = "//span[@id='Password-error']";
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = "//span[@id='ConfirmPassword-error']";
	public static final String EXISTING_EMAIL_ERROR_MESSAGE = "//div[contains(@class,'message-error')]";

	public static final String LOGIN_LINK = "//a[@class='ico-login']";
	public static final String REGISTER_SUCCESS_MESSAGE = "//div[@class='result']";

}
