package javaOOP.polymorphism;

public class Overloading {

	public void sum(int a, int b) {

	}

	public void sum(long a, long b) {

	}

	public void sum(float a, float b) {

	}

	public void sum(double a, double b) {

	}

	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.sum(4d, 5d);
		over.sum(43f, 3132f);
		over.sum(3, 1);
		over.sum(4134132313123l, 12312313l);
	}

}
