package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BasePage {
	private WebDriver driver;

	protected WebDriver getBrowserDriver(String browserName) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());

		// Firefox
		if (browserList == BrowserList.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			if (GlobalConstants.OS_NAME.contains("Mac")) {
			} else {
				WebDriverManager.firefoxdriver().setup();
			}
			driver = new FirefoxDriver();
		} else if (browserList == BrowserList.H_FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size: 1920x1080");
			driver = new FirefoxDriver();

			// Chrome
		} else if (browserList == BrowserList.CHROME) {
			if (GlobalConstants.OS_NAME.contains("Mac")) {
				WebDriverManager.chromedriver().setup();
			} else {
				WebDriverManager.chromedriver().setup();
			}
			driver = new ChromeDriver();
		} else if (browserList == BrowserList.H_CHROME) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size: 1920x1080");
			driver = new ChromeDriver();

			// Edge
		} else if (browserList == BrowserList.EDGE) {
			if (GlobalConstants.OS_NAME.contains("Mac")) {
				WebDriverManager.edgedriver().setup();
			} else {
				WebDriverManager.edgedriver().setup();
			}
			driver = new EdgeDriver();

			// Opera
		} else if (browserList == BrowserList.OPERA) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();

			// Coc Coc: use chromedriver version older 5 or 6 than cococ version
		} else if (browserList == BrowserList.COCCOC) {
			WebDriverManager.chromedriver().driverVersion("107.0.5304.62").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C://.....");
			driver = new ChromeDriver(options);

			// Brave: use chromedriver version same with brave browser version
		} else if (browserList == BrowserList.BRAVE) {
			WebDriverManager.chromedriver().driverVersion(".....").setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C://.....");
			driver = new ChromeDriver(options);
		} else {
			throw new RuntimeException("Please input with correct browser name."); // RuntimeException có nghĩa là chạy lỗi phát là throw ngay
		}
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIME_OUT, TimeUnit.SECONDS);
		return driver;
	}

	// protected String getEnvironmentValue(String serverName) {
	// String envURL = null;
	// EnvironmentList environment = EnvironmentList.valueOf(serverName.toUpperCase());
	// if (environment == EnvironmentList.DEV) {
	//
	// }
	// return envURL;
	//
	// }
	private boolean verifyTrue(boolean condition) {
		boolean pass = true;
		try {
			if (condition == true) {
				System.out.println(" -------------------------- PASSED -------------------------- ");
			} else {
				System.out.println(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	private boolean verifyFalse(boolean condition) {
		boolean pass = true;
		try {
			if (condition == false) {
				System.out.println(" -------------------------- PASSED -------------------------- ");
			} else {
				System.out.println(" -------------------------- FAILED -------------------------- ");
			}
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	private boolean verifyEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			System.out.println(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			System.out.println(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}
}
