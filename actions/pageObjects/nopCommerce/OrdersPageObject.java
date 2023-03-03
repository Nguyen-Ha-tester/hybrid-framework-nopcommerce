package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class OrdersPageObject extends BasePage {
	private WebDriver driver;

	public OrdersPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
