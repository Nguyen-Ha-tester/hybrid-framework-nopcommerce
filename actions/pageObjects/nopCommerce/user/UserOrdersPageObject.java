package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class UserOrdersPageObject extends BasePage {
	private WebDriver driver;

	public UserOrdersPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
