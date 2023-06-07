package pageObjects.SauceLab;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.saucelab.BasePageUI;

public class LoginPageObject extends BasePage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputEmail(String string) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_ID, null);
	}

	public void inputPassword(String string) {
		// TODO Auto-generated method stub

	}

	public ProducPageObject clickLoginButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
