package java_basic;

import org.testng.annotations.Test;

public class topic_11_string {

	public void introduce_string() {
		String string1 = "cat";
		String string2 = "dog";
		String string3 = new String("cat");

		System.out.println(string1 == string2); // False: vì khi == là kiểm tra bộ nhớ có ở cùng nhau k, mỗi string sẽ ở 1 chỗ nhớ khác nhau => == dùng khi so sánh data kiểu nguyên thuỷ
		System.out.println(string1.equals(string3)); // True: vì phương thức equal chỉ so sánh GIÁ TRỊ/ CHUỖI KÍ TỰ thui, k so sánh bộ nhớ => dùng equal khi so sánh data kiểu tham chiếu

		string2 = "pig";
		System.out.println(string2);
	}

	@Test
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
	}
}
