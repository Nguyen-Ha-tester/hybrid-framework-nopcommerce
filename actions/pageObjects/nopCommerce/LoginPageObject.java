package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.LoginPageUI;

public class LoginPageObject extends BasePage {

	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String emailAddress) {
		waitForElementClickable(driver, LoginPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXT_FIELD, emailAddress);
	}

	public void inputPassword(String passWord) {
		waitForElementClickable(driver, LoginPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXT_FIELD, passWord);
	}

	public HomePageObject clickLoginButton() {
		waitForElementClickable(driver, LoginPageUI.PASSWORD_TEXT_FIELD);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
	}

	public String getErrorMessageAtEmailTextfield() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAboveEmailField() {
		waitForElementVisible(driver, LoginPageUI.ABOVE_EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.ABOVE_EMAIL_ERROR_MESSAGE);
	}

}
