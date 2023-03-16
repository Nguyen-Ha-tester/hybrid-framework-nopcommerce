package javaOOP;

public abstract class topic_03_method {

	// Non-Static method
	void showCarName() {

	}

	// Static method
	static void showCarColor() {

	}

	// Normal method
	public static void main(String[] arg) {
		// showCarName(); ==> false

		showCarColor(); // only static method can be in static method
	}

	// Abstract method
	public abstract void showCarType();

}
