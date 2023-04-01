package pageObjects.jQuery;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

}
