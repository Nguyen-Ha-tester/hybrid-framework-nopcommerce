package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.UserHomePageUI;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;

	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserRegisterPageObject openRegisterPage() {
		waitForElementClickable(driver, UserHomePageUI.REGISTER_LINK);
		clickToElement(driver, UserHomePageUI.REGISTER_LINK);
		// cach 2:
		// return new RegisterPageObject(driver);
		// cach 3:
		return PageGeneratorManagerNopCommerce.getUserRegisterPage(driver);

	}

	public void clickLogoutLink() {
		waitForElementClickable(driver, UserHomePageUI.LOG_OUT_LINK);
		clickToElement(driver, UserHomePageUI.LOG_OUT_LINK);

	}

	public boolean isLogOutLinkClickable() {
		return getWebElement(driver, UserHomePageUI.LOG_OUT_LINK).isDisplayed();
	}

	public void loadLoginPage() {
		openPageUrl(driver, UserHomePageUI.LOGIN_LINK);
	}

	public UserLoginPageObject clickLoginLink() {
		waitForElementClickable(driver, UserHomePageUI.LOGIN_LINK);
		clickToElement(driver, UserHomePageUI.LOGIN_LINK);
		return PageGeneratorManagerNopCommerce.getUserLoginPage(driver);
	}

	public UserCustomerInforPageObject openCustomerInforPage() {
		waitForElementClickable(driver, UserHomePageUI.MY_ACCOUNT_BUTTON);
		clickToElement(driver, UserHomePageUI.MY_ACCOUNT_BUTTON);
		return PageGeneratorManagerNopCommerce.getUserCustomerInforPage(driver);
	}

}
