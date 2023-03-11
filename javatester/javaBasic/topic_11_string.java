package javaBasic;

import java.util.Scanner;

public class topic_11_string {

	public void introduce_string() {
		// System.setProperty ("webdriver.gecko.driver", "./browser_drivers/geckodriver")
		// WebDriver driver = new FirefoxDriver();
		String string1 = "cat";
		String string2 = "dog";
		String string3 = new String("cat");

		System.out.println(string1 == string2); // False: vì khi == là kiểm tra bộ nhớ có ở cùng nhau k, mỗi string sẽ ở 1 chỗ nhớ khác nhau => == dùng khi so sánh data kiểu nguyên thuỷ
		System.out.println(string1.equals(string3)); // True: vì phương thức equal chỉ so sánh GIÁ TRỊ/ CHUỖI KÍ TỰ thui, k so sánh bộ nhớ => dùng equal khi so sánh data kiểu tham chiếu

		string2 = "pig";
		System.out.println(string2);
	}

	public void string_method() {

		String schoolName = "Automation Testing Advanced";
		String schoolNameButInCase = "automation testing advaNceD";
		String address = " in Ha Noi";

		// Độ dài chuỗi: đếm kí tự index, bắt đầu từ 0 -> n -1
		System.out.println("Độ dài của chuỗi là: " + schoolName.length()); // khác với hàm length của mảng

		// Lấy ra 1 kí tự từ 1 vị trí cụ thể nào đó
		System.out.println("Lấy ra 1 kí tự là: " + schoolName.charAt(3));

		// Nối chuỗi -> trả về kiểu string
		System.out.println("Nối 2 chuỗi thành: " + schoolName.concat(address)); // thực tế dùng dấu + cho nhanh =__=

		// So sánh 2 chuỗi có bằng nhau hay không -> -> trả về kiểu boolean
		System.out.println("2 chuỗi có bằng nhau TUYỆT ĐỐI không: " + schoolName.equals(schoolNameButInCase));
		System.out.println("2 chuỗi có bằng nhau TƯƠNG ĐỐI không: " + schoolName.equalsIgnoreCase(schoolNameButInCase)); // k phân biệt hoa thường

		// startWith/ endsWith/ contains (giống xpath): kiểm tra -> trả về kiểu boolean
		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự không: " + schoolName.startsWith("Au"));
		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự không: " + schoolName.endsWith("d"));
		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự không: " + schoolName.contains(" T"));

		// Lấy ra vị trí của 1 kí tự/chuỗi kí tự trong chuỗi -> trả về index -> ít dùng
		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự là: " + schoolName.indexOf("u"));

		// Lấy ra 1 kí tự/ 1 chuỗi kí tự từ index thứ mấy đến thứ mấy -> trả về kiểu string -> hay dùng
		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự là: " + schoolName.substring(0, 10));

		// Tách string
		String split[] = schoolName.split(" ");
		System.out.println(split[2]); // lấy ra mảng được tách đứng ở index thứ 2

		// Thay thế 1 kí tự này thành kí tự khách
		schoolName = schoolName.replace("Automation", "Manual");
		System.out.println(schoolName);

		// Conver từ string qua float
		float schoolNameF = Float.parseFloat("13130912");
		System.out.println(schoolNameF);

		// Conver từ float sang string
		String schoolNameS = String.valueOf(schoolNameF);
		System.out.println(schoolNameS);

		// // toLowerCase/ toUpperCase
		// String osName = System.getProperty("os.name");
		// System.out.println(osName); // => In ra tên hệ điều hành
		// if (osName.toLowerCase().contains("mac os")) { // toLowerCase sẽ chuyển string từ viết hoa -> thường và ngược lại với toUpperCase
		// Keys key = Keys.COMMAND;
		// } else {
		// Keys key = Keys.CONTROL;
		// }
		// //
		// String driverInstanceName = driver.toString();
		// System.out.println(driverInstanceName); //= > In ra tên của driver

		// Khoảng trắng, xuống dòng, tab
		String helloWorld = "       \n    \t     hello   \n   world";
		System.out.println("Chưa dùng trim(): " + helloWorld);
		String trim = helloWorld.trim();
		System.out.println("Đã dùng trim(): " + trim);

		// Blank khác với Empty:
		String abc = "     ";
		System.out.println("Empty: " + abc.isEmpty()); // Vì trong string này vẫn có khoảng trắng nên sẽ tính là 1 kí tự => length() >0 => không empty
		System.out.println("Blank: " + abc.isBlank()); // Vì trong string này vẫn có khoảng trắng nên sẽ gọi là blank

		// Dynamic Locator: đại diện cho 1 chuỗi %s %b %t %d....Không cần phải viết nhiều xpath tương tự nhau, lặp đi lặp lại
		String dynamicXpath = "//button[@id='%s']";
		System.out.println("Click to Login button: " + dynamicXpath.format(dynamicXpath, "login"));
		System.out.println("Click to Search button: " + dynamicXpath.format(dynamicXpath, "search"));
		System.out.println("Click to Register button: " + dynamicXpath.format(dynamicXpath, "register"));
	}

	public void exercise_01() {
		Scanner scanner = new Scanner(System.in);
		String exercise01 = scanner.nextLine();
		int countUpperCase = 0;
		char exerciseArray[] = exercise01.toCharArray();
		for (char character : exerciseArray) {
			if (character <= 'Z' && character >= 'A') {
				countUpperCase++;
			}
		}
		System.out.println("The number of UpperCase is: " + countUpperCase);
	}

	public void exercise_02() {
		String string = "Automation Testing 345 Tutorials Online 789";

		// 1
		char stringArray1[] = string.toCharArray();
		char x;
		int count1 = 0;
		for (int i = 0; i < stringArray1.length; i++) {
			x = stringArray1[i];
			if (x == 'a' || x == 'A') {
				count1++;
			}
		}
		System.out.println(count1);

		// 2
		// String stringArray2[] = string.split(" ");
		// for (String string2 : stringArray2) {
		// if (string2.equals("Testing")) {
		// System.out.println(string2.equals("Testing"));
		// }
		//
		// }
		System.out.println(string.contains("Testing"));

		// 3
		System.out.println(string.startsWith("Automation"));

		// 4
		System.out.println(string.endsWith("Online"));

		// 5
		System.out.println(string.indexOf("Tutorials"));

		// 6
		System.out.println(string.replace("Online", "Offline"));

		// 7
		int count7 = 0;
		for (int i = 0; i < stringArray1.length; i++) {
			x = stringArray1[i];
			if (x >= '0' && x <= '9') { // Phải để chữ số trong dấu '' để đưa về cùng 1 kiểu dữ liệu là char để so sánh vì hiện tại y đang ở kiểu char
				count7++;
			}
		}
		System.out.println(count7);

	}

	public void exercise_03() {
		Scanner scanner = new Scanner(System.in);
		String exercise03 = scanner.nextLine();

		char ch;
		String newString = "";
		for (int i = 0; i < exercise03.length(); i++) {
			ch = exercise03.charAt(i); // Returns the char value at the specified index
			newString = ch + newString; // Thêm từng ký tự vào đằng trước string mới
		}

		System.out.println(newString);
	}
}
