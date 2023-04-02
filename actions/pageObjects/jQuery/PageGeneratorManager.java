package pageObjects.jQuery;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public HomePageObjectDataTable getHomePageDataTable(WebDriver driver) {
		return new HomePageObjectDataTable(driver);
	}

	public HomePageObjectUploadFile getHomePageUploadFiles(WebDriver driver) {
		return new HomePageObjectUploadFile(driver);
	}

}
