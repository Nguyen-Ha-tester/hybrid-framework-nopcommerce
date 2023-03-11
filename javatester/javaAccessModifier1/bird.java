package javaAccessModifier1;

public class bird {
	animal animal = new animal(); // Khởi tạo biến instance (object)
	cat cat1 = new cat();

	// cat2 cat2 = new cat2(); class cat2 k public, mà lại ở package khác nên k access được
	public void showProperty() {
		System.out.println(animal.age);
	}
}
