package javaException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {
	WebDriver driver;

	@Test
	public void example() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		// org.openqa.selenium.InvalidArgumentException
		driver.get("errorlink.com");
		driver.findElement(By.xpath("...")).click();
	}

}
