package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public String getFirstNameErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getLastNameErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getEmailErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getPasswordErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getConfirmPasswordErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, RegisterPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXT_FIELD, emailAddress);

	}

	public void inputFirstName(String firstName) {
		waitForElementClickable(driver, RegisterPageUI.FIRST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXT_FIELD, firstName);
	}

	public void inputLastName(String lastName) {
		waitForElementClickable(driver, RegisterPageUI.LAST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXT_FIELD, lastName);
	}

	public void inputPassword(String password) {
		waitForElementClickable(driver, RegisterPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXT_FIELD, password);
	}

	public void inputConfirmPassword(String password) {
		waitForElementClickable(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD, password);
	}

	public String getSuccessMessage() {
		waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public LoginPageObject clickLoginLink() {
		waitForElementClickable(driver, RegisterPageUI.LOGIN_LINK);
		clickToElement(driver, RegisterPageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}

	public String getExistingEmailErrorMassege() {
		waitForElementVisible(driver, RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
