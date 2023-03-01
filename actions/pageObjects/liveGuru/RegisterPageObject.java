package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputFirstName(String firstName) {
		waitForElementClickable(driver, RegisterPageUI.FIRST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXT_FIELD, firstName);
	}

	public void inputLastName(String lastName) {
		waitForElementClickable(driver, RegisterPageUI.LAST_NAME_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.LAST_NAME_TEXT_FIELD, lastName);
	}

	public void inputEmailAddress(String emailAddress) {
		waitForElementClickable(driver, RegisterPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXT_FIELD, emailAddress);
	}

	public void inputPassword(String password) {
		waitForElementClickable(driver, RegisterPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXT_FIELD, password);

	}

	public void inputConfirmPassword(String confirmPassword) {
		waitForElementClickable(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXT_FIELD, confirmPassword);

	}

	public void clickRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

}
