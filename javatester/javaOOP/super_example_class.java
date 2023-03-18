package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class super_example_class {
	private WebDriver driver;

	public long shortTimeout = 13;
	protected long longTimeout = 33;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.MILLISECONDS); // hàm super sẽ gọi đến biến longTimeout của class cha
	}

	// public super_example_class(String number) {
	// System.out.println("This is farther constructor" + number);
	// }
	//
	// public super_example_class(String number2, String number) {
	// System.out.println("This is farther constructor" + number + number2);
	// }
}
