package javaOOP;

public abstract class topic_04_non_access_modifier {

	// 1 - Static: Variable/ Method

	// Variable:
	static String bienStatic = "ha";

	// Method
	public static void sendKeyToElement() {
		System.out.println(bienStatic);
	}

	// 2- Final: Variable/ Method/ Class
	// Variable:
	final String colorCar = "red";
	final static String COLOR_CAR = "red";

	// Method:
	public final void sendKeyToElementFinal() {

	}

	// Class
	public final class noClasscanExtendsMe {

	}

	// 3- Abstract: class/ method
	// Class
	public abstract class Animal {

	}

	// method
	public abstract void setAnimalName();

	// 4 - Synchronized

}
