package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAccountMenuButton() {
		waitForElementClickable(driver, HomePageUI.ACCOUNT_BUTTON);
		clickToElement(driver, HomePageUI.ACCOUNT_BUTTON);
	}

	public void clickRegisterButton() {
		waitForElementClickable(driver, HomePageUI.REGISTER_BUTTON);
		clickToElement(driver, HomePageUI.REGISTER_BUTTON);
	}

	public void clickAccountLoginButton() {
		waitForElementClickable(driver, HomePageUI.LOGIN_BUTTON);
		clickToElement(driver, HomePageUI.LOGIN_BUTTON);

	}
}
