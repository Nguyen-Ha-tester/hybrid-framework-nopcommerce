package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.UserLoginPageUI;

public class UserLoginPageObject extends BasePage {

	private WebDriver driver;

	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, UserLoginPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, UserLoginPageUI.EMAIL_TEXT_FIELD, emailAddress);
	}

	public void inputPassword(String passWord) {
		waitForElementClickable(driver, UserLoginPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, UserLoginPageUI.PASSWORD_TEXT_FIELD, passWord);
	}

	public UserHomePageObject clickLoginButton() {
		waitForElementClickable(driver, UserLoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, UserLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManagerNopCommerce.getUserHomePage(driver);
	}

	public String getErrorMessageAtEmailTextfield() {
		waitForElementVisible(driver, UserLoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserLoginPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAboveEmailField() {
		waitForElementVisible(driver, UserLoginPageUI.ABOVE_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, UserLoginPageUI.ABOVE_EMAIL_ERROR_MESSAGE);
	}

	public UserHomePageObject loginAsUser(String emailAddress, String password) {
		inputEmail(emailAddress);
		inputPassword(password);
		return clickLoginButton();
	}

}
