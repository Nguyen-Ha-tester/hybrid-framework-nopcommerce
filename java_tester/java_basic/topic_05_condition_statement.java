package java_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class topic_05_condition_statement {
	WebDriver driver = new FirefoxDriver();


	public void tc_01_if() {
		boolean status = 10 < 0;
		
//I - Mệnh đề if:
		if (status) { // kiểm tra 1 điều kiện
			System.out.println("Đi vào phần thân của mệnh đề if");
		} 
		// Hàm if sẽ nhận vào 1 hoặc nhiều điều kiện (condition)
		// Kiểm tra condition
			// Nếu điều kiện này đúng thì đi vào phần thân
			// Nếu điều kiện này sai thì bỏ qua
	
		//điều kiện cho element hiển thị hay không
		WebElement element = driver.findElement(By.className(""));
		if (element.isDisplayed() && element.isSelected()) { // kiểm tra nhiều điều kiện
			System.out.println("Element có hiển thị và được chọn");
		}
		}
		// các toán tử tham gia vào mệnh đề if
		// >
		// <
		// >=
		// <= 
		// && và
		// || hoặc
		// == so sánh bằng
		// ! phủ định
		
		@Test
		public void tc_02_if_else() {		

// II - Mệnh đề if else: trong trường hợp có 2 điều kiện
//		if (status) {
//			
//		} else {
//
		}
		
		//Có tới 2 điều kiện nhận vào
		//Kiểm tra condition
			//nếu nhu đúng thì vào if
			// Nếu như sai thì vào else
		
		@Test
		public void tc_03_if_else_if_else(String browserName) {		
			
// II - Mệnh đề if else if else: trong trường hợp dùng nhiều hơn 2 điều kiện
	//		if (browserName.equals("firefox")) {
//				if (osName.contains("Mac OS")) {
//					System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
//					
//				} else {
//					System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
//				}
//				driver = new FirefoxDriver();
//			} else  if (browserName.equals("chrome")) {
//				if (osName.contains("Mac OS")) {
//					System.setProperty("webdriver.chrome.driver", projectPath + "/browserDrivers/chromedriver");
//					
//				} else {
//					System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//				}
//				driver = new ChromeDriver();
//				
//			} else if (browserName.equals("edge")) {
//				if (osName.contains("Mac OS")) {
//					System.setProperty("webdriver.msedge.driver", projectPath + "/browserDrivers/msedgedriver");
//					
//				} else {
//					System.setProperty("webdriver.msedge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
//				}
//				driver = new EdgeDriver();
	//
//			} else {
//				throw new RuntimeException ("Please input with correct browser name."); //RuntimeException có nghĩa là chạy lỗi phát là throw ngay
//			}
			
		}		
		

	}

