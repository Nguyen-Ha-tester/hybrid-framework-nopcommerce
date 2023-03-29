package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.UserRegisterPageUI;

public class UserRegisterPageObject extends BasePage {
	private WebDriver driver;

	public UserRegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRegisterButton() {
		waitForElementClickable(driver, UserRegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
	}

	public String getFirstNameErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getLastNameErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getEmailErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getPasswordErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getConfirmPasswordErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, UserRegisterPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, UserRegisterPageUI.EMAIL_TEXT_FIELD, emailAddress);

	}

	public void inputFirstName(String firstName) {
		waitForElementClickable(driver, UserRegisterPageUI.FIRST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, UserRegisterPageUI.FIRST_NAME_TEXT_FIELD, firstName);
	}

	public void inputLastName(String lastName) {
		waitForElementClickable(driver, UserRegisterPageUI.LAST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, UserRegisterPageUI.LAST_NAME_TEXT_FIELD, lastName);
	}

	public void inputPassword(String password) {
		waitForElementClickable(driver, UserRegisterPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, UserRegisterPageUI.PASSWORD_TEXT_FIELD, password);
	}

	public void inputConfirmPassword(String password) {
		waitForElementClickable(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD, password);
	}

	public String getSuccessMessage() {
		waitForElementVisible(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public UserLoginPageObject clickLoginLink() {
		waitForElementClickable(driver, UserRegisterPageUI.LOGIN_LINK);
		clickToElement(driver, UserRegisterPageUI.LOGIN_LINK);
		return PageGeneratorManagerNopCommerce.getUserLoginPage(driver);
	}

	public String getExistingEmailErrorMassege() {
		waitForElementVisible(driver, UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
