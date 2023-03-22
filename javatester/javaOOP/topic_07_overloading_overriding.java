package javaOOP;

// Overloading
public class topic_07_overloading_overriding {

	private int firstNumber;
	private int secondNumber;

	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void sumNumber(int firstNumber, int secondNumber) {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void sumNumber(float firstNumber, float secondNumber) {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void sumNumber(float firstNumber, int secondNumber) {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	// Overriding
	public class Animal {
		public void makeSound() {
			System.out.println("Grr...");
		}
	}

	public class Cat extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Meow");
		}
	}

	public class Dog extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Bark");
		}
	}

}
