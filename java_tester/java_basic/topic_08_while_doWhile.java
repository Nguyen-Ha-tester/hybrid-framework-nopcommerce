package java_basic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class topic_08_while_doWhile {
	Scanner scanner = new Scanner(System.in);

	public void case_while() {
		int i = 0;

		// Vòng lặp for: dùng nhiều nhất trong 3 cái for/while/do-while
		for (i = 0; i < 5; i++) {
			System.out.println("For:" + i);
		}

		// Vòng lặp while: gần tương tự vòng lặp for, tức là kiểm tra đth trước rồi mới chạy phần thân.
		while (i < 5) {
			System.out.println("While:" + i);
			i++;
		}

		// Vòng lặp do-while: cho chạy phần thân trước 1 lần rồi mới kiểm tra điều kiện
		do {
			System.out.println("Do-While:" + i);
		} while (i < 5);
	}

	public void exercise_01() {
		int number = scanner.nextInt();

		// cach 1:
		for (int i = number; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Cach 2:
		while (number < 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}

	}

	public void exercise_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		while (a < b) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		}
	}

	@Test
	public void exercise_03() {

	}
}