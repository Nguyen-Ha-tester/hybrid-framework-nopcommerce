package pageObjects.jQuery;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.jQuery.HomePageUIUploadFile;

public class HomePageObjectUploadFile extends BasePage {
	private WebDriver driver;

	public HomePageObjectUploadFile(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isFileLoaded(String oneFile) {
		waitForElementVisible(driver, HomePageUIUploadFile.DYNAMIC_FILE_NAME_LOADED, oneFile);
		return isElementDisplayed(driver, HomePageUIUploadFile.DYNAMIC_FILE_NAME_LOADED, oneFile);
	}

	public void clickStartUploadFile(String oneFile) {
		waitForElementVisible(driver, HomePageUIUploadFile._DYNAMIC_START_BUTTON, oneFile);
		clickToElement(driver, HomePageUIUploadFile._DYNAMIC_START_BUTTON, oneFile);
	}

}
