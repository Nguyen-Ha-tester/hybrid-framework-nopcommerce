package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.nopCommerce.user.UserLoginPageUI;

public class UserLoginPageObject extends BasePage {

	private WebDriver driver;

	public UserLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to emailAddress field with value is {0}")
	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, UserLoginPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, UserLoginPageUI.EMAIL_TEXT_FIELD, emailAddress);
	}

	@Step("Input to password field with value is {0}")
	public void inputPassword(String passWord) {
		waitForElementClickable(driver, UserLoginPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, UserLoginPageUI.PASSWORD_TEXT_FIELD, passWord);
	}

	@Step("Click to login button to go to Home Page")
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
