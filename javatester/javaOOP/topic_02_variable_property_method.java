package javaOOP;

public class topic_02_variable_property_method {

	// 1- Variable include:
	// Access modifier
	// Data Type
	// Variable name
	// Varibale value:
	public String studenNameInOtherClass = "Somebody"; // instance variable

	private String studentName = "Nguyen Van A"; // global variable

	// 2- Method
	private void method() {
		String grade = "A"; // local variable: pham vi trong method
	}

	// 3- Constructor
	public topic_02_variable_property_method(String studentName) {
		String grade = "A";// local variable: pham vi trong constructor
	}

	public static void main(String[] args) {
		String studentName = "Nguyen Van A";// local variable: pham vi trong method
		if (studentName.startsWith("A")) {
			int number = 100;// local variable: pham vi trong block code
		}
	}

	// Static variable
	public static String studentAddress = "Ha Noi";
	private static String studentPhone = "1234567";

	// Final variable
	final String country = "Vietnam";

	// Static final variable
	public static final String TECHCOMBANK_ADDRESS = "Hai Phong";

}
