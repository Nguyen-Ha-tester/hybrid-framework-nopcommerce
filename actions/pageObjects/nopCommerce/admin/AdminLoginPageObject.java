package pageObjects.nopCommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManagerNopCommerce;
import pageUIs.nopCommerce.admin.AdminLoginPageUI;

public class AdminLoginPageObject extends BasePage {

	private WebDriver driver;

	public AdminLoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String adminEmailAddress) {
		waitForElementClickable(driver, AdminLoginPageUI.EMAIL_TEXT_FIELD);
		sendkeyToElement(driver, AdminLoginPageUI.EMAIL_TEXT_FIELD, adminEmailAddress);
	}

	public void inputPassword(String adminPassword) {
		waitForElementClickable(driver, AdminLoginPageUI.PASSWORD_TEXT_FIELD);
		sendkeyToElement(driver, AdminLoginPageUI.PASSWORD_TEXT_FIELD, adminPassword);
	}

	public AdminDashboardPageObject clickLoginButton() {
		waitForElementClickable(driver, AdminLoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, AdminLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManagerNopCommerce.getAdminDashboardPage(driver);
	}

	public AdminDashboardPageObject loginAsAdmin(String adminEmailAddress, String adminPassword) {
		inputEmail(adminEmailAddress);
		inputPassword(adminPassword);
		return clickLoginButton();
	}

}
