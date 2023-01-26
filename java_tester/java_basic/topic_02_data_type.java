package java_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class topic_02_data_type {
	// Primitive type (nguyên thuỷ): có 8 loại
	byte bNumber = 127;

	short sNumber = 3333;

	int iNumber = 33333; // phổ biến

	long lNumber = 333333;

	float fNumber = 3f; // phổ biến

	double dNumber = 3d; // phổ biến

	char cCharactor = '3';

	boolean bStatus = false; // phổ biến

	// Reference type (tham chiếu): có 4 loại

	// String: chữ cái

	String address = "Hà Nội";

	// Array (mảng): là 1 kiểu dữ liệu được defined trước là có bao nhiêu số liệu. Chứa tập hợp kiểu dữ liệu cùng loại hoặc khác loại đều đc

	String[] studentAddress = { "44 Da Nang", address }; // mảng string
	Integer[] studentNumber = { 33, 33 }; // mảng int

	// Class
	topic_02_data_type topic;

	// Interface

	WebDriver driver;

	// Object

	Object haxinhgai; // cũng là 1 class và convert qua kiểu dữ liệu khác đều được

	// Collection: Set, Queue, List
	List<WebElement> checkboxes = driver.findElements(By.cssSelector("haxinhgai"));

	// Sự khác biệt giữa kiểu tham chiếu và nguyên thuỷ:
	// nguyên thuỷ k thay đổi giá trị, còn tham chiếu thì thay đổi
	// nguyên thuỷ k có bất kì function nào còn tham chiếu thì có
	// nguyên thuỷ có giá trị của riêng nó trong bộ nhớ khi chạy, còn tham chiếu thì sẽ tham chiếu từ bộ nhớ stack sang lấy giá trị từ bộ nhớ heap (that's why gọi
	// là tham chiếu)
	// Có 2 biến x=y khởi tạo bằng nhau. Nếu x,y là kiểu nguyên thuỷ -> x thay đổi k làm y thay đổi, mỗi thằng có 1 vùng nhớ riêng. Nếu x,y là kiểu tham chiếu -> x
	// thay đổi y cũng thay đổi theo vì cùng tham chiếu 1 vùng nhớ
	// nguyên thuỷ thì dùng toán tử =+-*/ so sánh bình thường. Tham chiếu thì dùng method (phương thức) như equal

	@Test
	public void Exercise_01() {
		int a = 6;
		int b = 2;
		System.out.println("Tong = " + (a + b));
		System.out.println("Hieu = " + (a - b));
		System.out.println("Tich = " + (a * b));
		System.out.println("Thuong = " + (a / b));
		System.out.println("Thuong lay du = " + (a % b));
	}

	@Test
	public void Exercise_02() {
		float weight = 7.5f;
		float hight = 3.8f;
		System.out.println("Dien tich hinh chu nhat = " + (weight * hight));
	}

	@Test
	public void Exercise_03() {
		String name = "Automation Testing";
		System.out.println("Hello " + name);
	}
}