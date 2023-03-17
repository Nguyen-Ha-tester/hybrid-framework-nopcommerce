package javaBasic;

import org.testng.annotations.Test;

public class topic_03_operator { // Phép toán học

	public static void main(String[] args) {

		int number = 16; // Phép gán

		number += 5; // nghĩa là number = number + 5
		number -= 5; // nghĩa là number = number -5
		number *= 5; // nghĩa là number = number * 5
		number /= 5; // chia lấy phần nguyên
		number %= 5; // chia lấy phần dư
		number++; // nghĩa là number + 1; Nhưng in number ra tước rồi cộng 1
		number--; // nghĩa là number - 1; Nhưng cộng trước rồi in number ra sau
		++number; // nghĩa là

		System.out.println(number);
		if (number == 5) { // Phép toán tử. Phép toán tử trong String có == và +
			System.out.println("true");
		} else {
			System.out.println("false");

		}
		if (number == 5 && number != 6) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
		boolean status = (number == 2 ? true : false); // Biểu thức condition (tam nguyên) có 3 dấu = ? : => tương tự
														 // biểu thức ifElse
		System.out.println(status);

		// Gọi chạy các hàm public khác
		topic_03_operator run = new topic_03_operator();
		run.Exercise_01();
		run.Exercise_02();
		run.Exercise_03();
	}

	@Test
	public void Exercise_01() {
		Object P1 = "Tuan";
		int P2 = 23;
		System.out.println("After 15 years, age of " + P1 + " will be " + (P2 + 15));
	}

	public void Exercise_02() {
		int a = 1;
		int b = 6;
		// Cách 1:
		if (a != b) {
			int a1 = b;
			int b1 = a;
			System.out.println("After swapping then a = " + a1 + "," + " b = " + b1);
		}
		// Cách 2:
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping then a = " + a + "," + " b = " + b);

	}

	public void Exercise_03() {
		int a = 5;
		int b = 1;

		if (a > b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
