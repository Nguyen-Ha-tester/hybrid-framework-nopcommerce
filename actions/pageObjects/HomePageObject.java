package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
	}

	public void clickLogoutLink() {
		waitForElementClickable(driver, HomePageUI.LOG_OUT_LINK);
		clickToElement(driver, HomePageUI.LOG_OUT_LINK);

	}

	public boolean isLogOutLinkClickable() {
		return getWebElement(driver, HomePageUI.LOG_OUT_LINK).isDisplayed();
	}

	public void loadLoginPage() {
		openPageUrl(driver, HomePageUI.LOGIN_LINK);
	}

}
