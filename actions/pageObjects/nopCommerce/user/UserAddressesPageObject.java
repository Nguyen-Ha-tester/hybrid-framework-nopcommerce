package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class UserAddressesPageObject extends BasePage {
	private WebDriver driver;

	public UserAddressesPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
