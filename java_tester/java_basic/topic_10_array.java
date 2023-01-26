package java_basic;

import org.testng.annotations.Test;

public class topic_10_array {

	public void array() {

		// Khai báo array
		int number[] = { 1, 2, 3, 4, 5, 6 }; // Index từ 0 đến 5. Có 6 phần tử

		// Lấy ra phần tử thứ 2. Lưu ý, để trong dấu [] là index
		System.out.println(number[2]); // Lấy ra phần tử thứ 2

		/*
		 * System.out.println(number[6]); Nếu lấy ra phần tử ngoài index thì sẽ throw ra exception: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		 * Index 6 out of bounds for length 6
		 */

		// Gán đè phần tử
		number[0] = 2; // Gán phần tử ở index 0 của array number[] giá trị bằng 2, thay thế giá trị 1
		System.out.println(number[0]);

		// Duyệt qua tất cả phần tử của mảng: dùng vòng lặp for hoặc foreach
		// for
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		// foreach: nhưng foreach k kiểm tra điều kiện được
		for (int i : number) {
			System.out.println(i);
		}

	}

	public void exercise_01() {
		int number[] = { 1, 2, 3, 4, 9, 6, 7 };
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Highest Number is : " + x);
	}

	public void exercise_02() {
		int number[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Sum = " + (number[0] + number[number.length - 1]));
	}

	public void exercise_03() {
		int number[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			x = number[i];
			if (x % 2 == 0 && x > 0) {
				System.out.println(x);
			}
		}

	}

	public void exercise_04() {
		int number[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			x = number[i];
			if (x % 2 != 0 && x > 0) {
				sum += x;
			}
		}
		System.out.println(sum);
	}

	public void exercise_05() {
		int number[] = { 1, 2, 3, 4, 5, 6, 7 };
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			x = number[i];
			if (x <= 10 && x >= 0) {
				System.out.println(x);
			}
		}

	}

	@Test
	public void exercise_06() {
		int number[] = { 1, 2, -3, 4, 5, 6, 7 };
		int x = 0;
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			x = number[i];
			sum += x;
		}
		System.out.println("tong = " + sum);
		System.out.println("trung binh cong = " + sum / number.length);
	}
}
