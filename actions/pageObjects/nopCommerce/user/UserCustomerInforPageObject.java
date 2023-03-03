package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.UserCustomerInforPageUI;
import pageUIs.nopCommerce.user.UserHomePageUI;

public class UserCustomerInforPageObject extends BasePage {
	private WebDriver driver;

	public UserCustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNewsletterCheckbox() {
		waitForElementClickable(driver, UserHomePageUI.NEWSLETTER_CHECKBOX);
		clickToElement(driver, UserHomePageUI.NEWSLETTER_CHECKBOX);
	}

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(driver, UserCustomerInforPageUI.CUSTOMER_HEADER);
		return isElementDisplayed(driver, UserCustomerInforPageUI.CUSTOMER_HEADER);
	}

}
