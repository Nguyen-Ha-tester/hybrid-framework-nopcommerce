package java_basic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_01_Data_Type {
	String bienToanCuc = "ha"; // Biến toàn cục: sử dụng trong phạm vi class (bao gồm cả method, trừ static method) và sử dụng bên ngoài class được (tuỳ theo access modifier)

	static final String BROWSER_NAME = "HA"; //Biến final (const)
	static int studentNumber; // thằng int giá trị mặc định = 0
	static boolean result; // thằng int giá trị mặc định = false
							// Tại sao cần có "static" trước kiểu dữ liệu? Vì để dùng biến trong hàm public static ở dưới "Cannot make a static reference to the non-static field name"
	
	public static void main(String[] args) {
		System.out.println(studentNumber);
		System.out.println(result);
		//System.out.println(bienToanCuc); //biến toàn cục mà k có static ở trước là k đc dùng trong hàm static
		String bienCucbo = ""; // Biến cục bộ: chỉ sử dụng trong phạm vi của 1 method (testcase) thôi hoặc 1 khối lệnh, k sử dụng bên ngoài được
		System.out.println(bienCucbo);
		
		//Block code
		if (3<5) {
			String bienCucBo1 = "";
			System.out.println(bienCucBo1); //biến cục bộ này chỉ hiệu nghiệm trong block if này thôi
		}
	}
	
	public Topic_01_Data_Type() {
	 // đây gọi là hàm khởi tạo. Hàm khởi tạo có cùng tên hàm với tên class
				
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.println(name);
		System.out.print(name);
		System.out.print(name);
	}
	}
	

