package java_basic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class topic_05_condition_statement {
	Scanner scanner = new Scanner(System.in);
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
		
	public void exercise_01() {

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " là số chẵn");
		} else {
			System.out.println(number + " là số lẻ");
		}

	}

	public void exercise_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a > b) {
			System.out.println(a + " lớn hơn " + b);
		} else if (a == b) {
			System.out.println(a + " bằng " + b);
		} else {
			System.out.println(a + " nhỏ hơn " + b);
		}
	}

	public void exercise_03() {
		String nguoiA = scanner.nextLine();
		String nguoiB = scanner.nextLine();
		if (nguoiA.equals(nguoiB)) {
			System.out.println("2 người là cùng tên");
		} else {
			System.out.println("2 người là khác tên");
		}
	}

	public void exercies_04() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " là số lớn nhất");
		} else if (b > c) {
			System.out.println(b + " là số lớn nhất");
		} else {
			System.out.println(c + " là số lớn nhất");
		}
	}

	public void exercies_05() {
		int a = scanner.nextInt();

		if (a >= 10 && a <= 100) {
			System.out.println(a + " nằm trong [10,100]");
		} else {
			System.out.println(a + " không nằm trong [10,100]");
		}
	}

	public void exercies_06() {
		int diemXepLoaiSinhVien = scanner.nextInt();

		if (diemXepLoaiSinhVien >= 0 && diemXepLoaiSinhVien < 5) {
			System.out.println("Điểm D");
		} else if (diemXepLoaiSinhVien >= 5 && diemXepLoaiSinhVien < 7.5) {
			System.out.println("Điểm C");
		} else if (diemXepLoaiSinhVien >= 7.5 && diemXepLoaiSinhVien < 8.5) {
			System.out.println("Điểm B");
		} else {
			System.out.println("Điểm A");
		}
	}

	@Test
	public void exercies_07() {
	int thang = scanner.nextInt();
	if(thang == 1 || thang == 3 || thang == 5 ||thang == 7 || thang == 8 || thang == 10 || thang == 12) {
		System.out.println("Thang nay cos 31 ngay");
	}else if (thang == 4 ||thang == 6 ||thang == 9 || thang == 11) {
		System.out.println("thang nay co 30 ngay");
	}else {
		System.out.println("thang nay co 28 hoac 29 ngay");
	}
}
}