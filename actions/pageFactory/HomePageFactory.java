package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePageFactory;

public class HomePageFactory extends BasePageFactory {
	private WebDriver driver;

	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement registerLink;
	@FindBy(xpath = "//a[@class='ico-logout']")
	private WebElement logoutLink;

	public void clickRegisterLink() {
		waitForElementClickable(driver, registerLink);
		registerLink.click();
	}

	public void clickLogoutLink() {
		waitForElementClickable(driver, logoutLink);
		logoutLink.click();
	}

	public boolean isLogOutLinkClickable() {
		return logoutLink.isDisplayed();
	}

}
