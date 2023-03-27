package javaException;

import java.io.IOException;

public class JavaException {

	public static void main(String[] args) throws IOException {
		// I- java.lang.NullPointerException: có giá trị bằng null
		// String name = null;
		// System.out.println(name.length());
		// II- java.lang.NumberFormatException: auto không phải là int
		// int number = Integer.parseInt("auto");
		// III- java.lang.ArrayIndexOutOfBoundsException: cái cần tìm nằm ngoài index
		// int price[] = new int[4];
		// System.out.println(price[5]);
		// IV- java.io.FileNotFoundException: K tìm thấy file C:\\auto.jpg
		// File newfile = new File("C:\\auto.jpg");
		// FileReader fr = new FileReader(newfile);
		// fr.close();
	}

}
