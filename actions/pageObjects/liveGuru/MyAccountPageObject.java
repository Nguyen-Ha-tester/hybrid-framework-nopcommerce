package pageObjects.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.MyAccountPageUI;

public class MyAccountPageObject extends BasePage {

	private WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getSuccessMessage() {
		waitForElementVisible(driver, MyAccountPageUI.SUCCESS_MESSAGE);
		return getElementText(driver, MyAccountPageUI.SUCCESS_MESSAGE);
	}

	public void clickLogoutButton() {
		waitForElementVisible(driver, MyAccountPageUI.LOGOUT_BUTTON);
		clickToElement(driver, MyAccountPageUI.LOGOUT_BUTTON);

	}

	public String getHelloMessage() {
		waitForElementVisible(driver, MyAccountPageUI.HELLO_MESSAGE);
		return getElementText(driver, MyAccountPageUI.HELLO_MESSAGE);
	}

	public void clickAccountDropdown() {
		waitForElementVisible(driver, MyAccountPageUI.ACCOUNT_DROPDOWN);
		clickToElement(driver, MyAccountPageUI.ACCOUNT_DROPDOWN);
	}
}
