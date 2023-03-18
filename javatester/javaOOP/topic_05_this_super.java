package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class topic_05_this_super extends super_example_class {
	// this tham chiếu đến global variable của class hiện tại
	private int a;
	private int b;

	public topic_05_this_super(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		topic_05_this_super topic05 = new topic_05_this_super(15, 7);
		topic05.showSumNumber();

	}

	public void showSumNumber() {
		System.out.println(a + b);
	}

	// super:
	private long shortTimeout = 13;
	private long longTimeout = 33;

	private WebDriver driver;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.MILLISECONDS); // hàm super sẽ gọi đến biến longTimeout của class cha
	}

	public void clickToElement() {
		setImplicitWait(); // Gọi đến hàm của class hiện tại
		super.setImplicitWait(); // Gọi đến hàm của class cha
	}

	// public topic_05_this_super() {
	// super("number", "number2"); // super chỉ định rõ constructor nào ở class cha sẽ được chọn.
	// System.out.println("This is child constructor");
	// }
}
