package commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	private WebDriver driver;
	private String osName = System.getProperty("os.name");
	private String projectPath = System.getProperty("user.dir");

	protected WebDriver getBrowserDriver(String browserName) {
		if (browserName.equals("firefox")) {
			if (osName.contains("Mac OS")) {
				System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
			} else {
				System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			}
			driver = new FirefoxDriver();
		} else if (browserName.equals("chrome")) {
			if (osName.contains("Mac OS")) {
				System.setProperty("webdriver.chrome.driver", projectPath + "/browserDrivers/chromedriver");

			} else {
				System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			}
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			if (osName.contains("Mac OS")) {
				System.setProperty("webdriver.edge.driver", projectPath + "/browserDrivers/msedgedriver");
			} else {
				System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			}
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Please input with correct browser name."); // RuntimeException có nghĩa là chạy lỗi phát là throw ngay
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
