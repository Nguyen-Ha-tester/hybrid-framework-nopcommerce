package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.LoginPageUI;

public class LoginPageObject extends BasePage {

	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmailAddress(String emailAddress) {
		waitForElementClickable(driver, LoginPageUI.EMAIL_ADDRESS);
		sendkeyToElement(driver, LoginPageUI.EMAIL_ADDRESS, emailAddress);

	}

	public void inputPassword(String password) {
		waitForElementClickable(driver, LoginPageUI.PASSWORD);
		sendkeyToElement(driver, LoginPageUI.PASSWORD, password);
	}

	public void clickLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}
}
