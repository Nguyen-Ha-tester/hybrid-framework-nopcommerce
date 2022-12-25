package java_basic;

import org.testng.annotations.Test;

public class Topic_03_Exercise_Data_Type {
	public void Exercise_01() {
		int a = 6;
		int b = 2;
		System.out.println("Tong = " + (a + b));
		System.out.println("Hieu = " + (a - b));
		System.out.println("Tich = " + (a * b));
		System.out.println("Thuong = " + (a / b));
	}
	
	@Test
	public void Exercise_02() {
		float weight = 7.5f;
		float hight = 3.8f;
		System.out.println("Dien tich hinh chu nhat = " + (weight*hight));
		
	}
}
