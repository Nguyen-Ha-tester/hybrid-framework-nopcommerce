package pageObjects.SauceLab;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static ProducPageObject getProductPage(WebDriver driver) {
		return new ProducPageObject(driver);
	}

}
