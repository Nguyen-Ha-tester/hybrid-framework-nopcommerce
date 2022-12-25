package java_basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class topic_07_for_foreach {
	Scanner scanner = new Scanner(System.in);


	public void vd_01_for() {

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

		// Lần 2:
		// i = 1
		// 1 < 10: đúng
		// System.out.println(1);
		// i++ = 1 + 1 = 2
		
		// .......
		
		// Lần 12:
		// i = 11
		// 11 <= 10: sai 
		// dừng lại vòng lặp for
		
		// vòng lặp for chạy ngược mảng được (vòng lặp for each thì không)
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

	}
	
	public void vd_02_for() {
		String[] cityName = {"Ha Noi", "Da Nang","Hai Duong"}; // 1 array/ list/ set/ queue đều bắt đầu đếm từ 0 -> 1 -> 2
		
// I - Vòng lặp for/ foreach: dùng để chạy in ra hết tất cả các giá trị
		//I.1: for
		for (int i = 0; i < cityName.length; i++) {
			System.out.println(i);
			System.out.println(cityName[i]);
		}
		// Lần 1:
		// i = 0
		// 0 < 3: đúng
		// System.out.println(0);: 0
		//System.out.println(cityName[0]);: Ha Noi
		// i++ = 0 + 1 = 1
		// cityName[0+1] = cityName[1] = Da Nang
		//  ....
		
		//I.2: for each: thường dùng cho array, set,...dùng để thao tác với toàn bộ dữ liệu
		for (String city : cityName) {
			System.out.println(city);
		}
//II - Vòng lặp for + if + break: dùng để thỏa mãn điều kiện mới action
		// II.1 - For có break: dừng lại ngay khi điều kiện được thỏa mãn
		// Nên dùng phổ biến
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("Da Nang")) {
				System.out.println("Stop!");
				break;
			}
		}
		// II.2 - For KHÔNG có break: chạy cho tới khi hết các giá trị (các element) dù điều kiện đã thỏa mãn rồi 
			// Mất thời gian không cần thiết
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("Da Nang")) {
				System.out.println("Stop!");
			}
		}
	}
		
	public void vd_03_for_each() {
			List<String> cityAddress = new ArrayList<String>(); //Java collection se hoc cai nay
		
			System.out.println(cityAddress.size()); // 0
			cityAddress.add("city1");
			cityAddress.add("city2");
			cityAddress.add("city3");
		
			System.out.println(cityAddress.size()); // 3
		
			String[] cityName = {"Ha Noi", "Da Nang","Hai Duong"};
			
			for (String city : cityName) { // kiểu dữ liệu String match với kiểu dữ liệu String ở String[] cityName = {"Ha Noi", "Da Nang","Hai Duong"};
				cityAddress.add(city);
			}
			System.out.println(cityAddress.size()); // 6
			
			for (String city : cityName) {
				cityAddress.add(city);
			}
			System.out.println(cityAddress.size()); // 9
		}
	
	public void exercise_01() {
		int a = scanner.nextInt();
		for (int i = 1; i <= a; i++) {
				System.out.print(i + " ");
		}
	}
	
	public void exercise_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			if (a < b) 
			{
				System.out.print( i + " ");
//			} else {
//				System.out.println("Vui long nhap gia tri a < b"); ????????????????????????? how to do this?
			}
		}
	}
	
	public void exercise_03() {
		
	}





}

