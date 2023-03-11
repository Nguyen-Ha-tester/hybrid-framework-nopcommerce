package javaBasic;

public class topic_12_substring {
	public static void main(String[] args) {
		String firstText = "id=Email";
		String secondText = "css=input[id='Password']";
		String thirdText = "xpath=//button[@text()='Log in']";

		System.out.println(firstText.substring(3));
		System.out.println(secondText.substring(4));
		System.out.println(thirdText.substring(6));

	}
}
