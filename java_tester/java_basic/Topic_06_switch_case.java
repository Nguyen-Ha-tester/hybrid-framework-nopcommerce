package java_basic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_switch_case {
	Scanner scanner = new Scanner(System.in);
		
	public void if_else() {		
		
			float diemXepLoaiSinhVien = scanner.nextFloat(); 
//			switch (diemXepLoaiSinhVien) {  // Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
//			case value:
//				
//				break;
//
//			default:
//				break;
//			}
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
	public void switch_case() {
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("month nay co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("month nay co 30 ngay");
			break;
		default:
			System.out.println("month nay co 28 hoac 29 ngay");
			break;
		}
	// Nhìn rõ ràng và k phải lặp lại condition nhiều lần
	// switchcase k cho phép Duplicate case
	}
	@Test
	public void exercise_01() {
		int numberInEnglish = scanner.nextInt();

		switch (numberInEnglish) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		}
	}

	public void exercise_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operator = scanner.next();


		switch (operator) {
		case "+":
			System.out.println("a + b = " + (a + b));
			break;
		case "-":
			System.out.println("a - b = " + (a - b));
			break;
		case "*":
			System.out.println("a * b = " + a * b);
			break;
		case "/":
			System.out.println("a / b = " + a / b);
			break;
		case "%":
			System.out.println("a % b = " + a % b);
			break;
		default:
			System.out.println("vui long nhap phep toan hop le");
			break;
		}
		
	}

}
