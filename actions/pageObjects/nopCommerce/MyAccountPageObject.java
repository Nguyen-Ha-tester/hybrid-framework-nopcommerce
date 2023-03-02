package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.HomePageUI;

public class MyAccountPageObject extends BasePage {
	private WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNewsletterCheckbox() {
		waitForElementClickable(driver, HomePageUI.NEWSLETTER_CHECKBOX);
		clickToElement(driver, HomePageUI.NEWSLETTER_CHECKBOX);
	}

}
