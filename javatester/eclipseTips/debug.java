package eclipseTips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class debug {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	String osName = System.getProperty("os.name");

	@Test
	public void tc_01() {
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String headerText = driver.findElement(By.xpath("//div[@id='content']//h2")).getText();
		// System.out.println(headerText); -> Trong nhiều dự án không cho in dòng này ra, mà chỉ cho debug thôi
		Assert.assertEquals(headerText, "Facebook helps you connect and share with the people in your life.");

		boolean loginStatus = driver.findElement(By.name("login")).isDisplayed();
		Assert.assertTrue(loginStatus);

		// Khi run thì không dùng Run As mà dùng Debug As
		// Sau khi debug1 chạy -> ấn Resume thì nó sẽ chạy đến điểm debug tiếp theo rồi dừng
		// Mục đích để dùng xem được từng bước nó chạy kĩ hơn, hiểu luồng dữ liệu chạy lần lượt ntn
		// Khi làm đủ nhiều thì k cần dùng debug nhiều, vì có thể tự đoán ra được lỗi và fix lỗi được mà k cần dùng debug
	}
}
