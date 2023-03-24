package javaOOP.polymorphism;

public class cat {

	public static void main(String[] args) {
		pig pig = new pig();
		pig.eat();
		// Mặc dù khi click vào hàm eat() thì nó chỉ về class Overriding,
		// nhưng khi run test thì run hàm eat() ở class pig.
		// Do đó chỉ khi run test mới biết là nó chỉ về đâu nếu dùng overriding vào hàm eat()

	}
}
