package java_basic;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		System.out.println("Huy cum inside Ha. Do ha biet ten tuoi cua Huy?????");
//		Human Huy = new Human();
		
		
//		Human Huy = new Human("Huy", 40);
//		Human Ha = new Human("Ha", 3);
//		System.out.println("Ha name:" + Ha.Name);
//		System.out.println("Ha age:" + Ha.Age);
		
		System.out.println("Hay nhap ten cua ban:");
		Scanner scanner1 = new Scanner(System.in);
		String name = scanner1.nextLine();
		
		
		System.out.println("Hay nhap tuoi cua ban:");
		Scanner scanner2 = new Scanner(System.in);
		String ageString = scanner2.nextLine();
		int age = Integer.parseInt(ageString);
		
		Human newHuman = new Human(name, age);
		System.out.println("Ha name:" + newHuman.Name);
		System.out.println("Ha age:" + newHuman.Age);
	}
}
