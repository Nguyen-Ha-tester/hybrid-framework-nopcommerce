package pageObjects.SauceLab;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.saucelab.BasePageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUserName(String textboxId, String userName) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, textboxId);
		sendkeyToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, userName, textboxId);
	}

	public void inputPassword(String textboxId, String password) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, textboxId);
		sendkeyToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, password, textboxId);
	}

	public ProducPageObject clickLoginButton(String buttonText) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, buttonText);
		clickToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, buttonText);
		return PageGeneratorManager.getProductPage(driver);
	}

}
