package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.CustomerInforPageUI;
import pageUIs.nopCommerce.HomePageUI;

public class CustomerInforPageObject extends BasePage {
	private WebDriver driver;

	public CustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNewsletterCheckbox() {
		waitForElementClickable(driver, HomePageUI.NEWSLETTER_CHECKBOX);
		clickToElement(driver, HomePageUI.NEWSLETTER_CHECKBOX);
	}

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(driver, CustomerInforPageUI.CUSTOMER_HEADER);
		return isElementDisplayed(driver, CustomerInforPageUI.CUSTOMER_HEADER);
	}

}
