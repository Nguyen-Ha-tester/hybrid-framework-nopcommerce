package pageObjects.jQuery;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		List<WebElement> startButtons = getListWebElements(driver, HomePageUIUploadFile._DYNAMIC_START_BUTTON);
		for (WebElement startButton : startButtons) {
			startButton.click();
		}
	}

	public boolean isFileLinkUploaded(String oneFile) {
		waitForElementVisible(driver, HomePageUIUploadFile.DYNAMIC_FILE_LINK_UPLOADED, oneFile);
		return isElementDisplayed(driver, HomePageUIUploadFile.DYNAMIC_FILE_LINK_UPLOADED, oneFile);
	}

	public boolean isFileImageUploaded(String oneFile) {
		waitForElementVisible(driver, HomePageUIUploadFile.DYNAMIC_FILE_IMAGE_UPLOADED, oneFile);
		return isImageLoaded(driver, HomePageUIUploadFile.DYNAMIC_FILE_IMAGE_UPLOADED, oneFile);
	}

}
