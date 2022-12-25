package java_basic;

import java.util.Iterator;

import org.testng.annotations.Test;

public class topic_07_for_each {

	@Test
	public void tc_01_for() {

		// khi không dùng for
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

		// khi dùng for

		for (int i = 0; i <= 10; i++) { // i++ là vào thân vòng for trước rồi mới cộng 1
			System.out.println(i);
		}

		// Lần 1:
		// i = 0
		// 0 < 10: đúng
		// System.out.println(0);
		// i++ = 0 + 1 = 1

		// Lần 1:
		// i = 1
		// 1 < 10: đúng
		// System.out.println(1);
		// i++ = 1 + 1 = 2
		
		// .......
		
		// Lần 12:
		// i = 11
		// 11 <= 10: sai 
		// dừng lại vòng lặp for

	}
}
