package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject openRegisterPage() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		// cach 2:
		// return new RegisterPageObject(driver);
		// cach 3:
		return PageGeneratorManagerNopCommerce.getRegisterPage(driver);

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

	public CustomerInforPageObject openCustomerInforPage() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_BUTTON);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_BUTTON);
		return PageGeneratorManagerNopCommerce.getCustomerInforPage(driver);
	}

}
