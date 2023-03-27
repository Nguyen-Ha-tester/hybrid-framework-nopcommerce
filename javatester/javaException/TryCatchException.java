package javaException;

public class TryCatchException {

	public static void main(String[] args) {
		// try-catch:
		try {
			int array[] = new int[12];
			array[99] = 30 / 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		// try - catch (multiple exceptions) - finally
		int array[] = null;
		try {
			array = new int[12];
			array[99] = 30 / 2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			array[2] = 5;
			System.out.println("success");
		}

	}

}
