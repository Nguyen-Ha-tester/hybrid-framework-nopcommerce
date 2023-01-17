package java_basic;

public class topic_10_array {

	public static void main(String[] args) {

		// Khai báo array
		int number[] = { 1, 2, 3, 4, 5, 6 }; // Index từ 0 đến 5. Có 6 phần tử

		// Lấy ra phần tử thứ 2. Lưu ý, để trong dấu [] là index
		System.out.println(number[2]); // Lấy ra phần tử thứ 2

		/*
		 * System.out.println(number[6]); Nếu lấy ra phần tử ngoài index thì sẽ throw ra exception: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		 * Index 6 out of bounds for length 6
		 */

		// Gán đè phần tử
		number[0] = 2; // Gán phần tử ở index 0 của array number[] giá trị bằng 2, thay thế giá trị 1
		System.out.println(number[0]);

		// Duyệt qua tất cả phần tử của mảng: dùng vòng lặp for hoặc foreach
		// for
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		// foreach: nhưng foreach k kiểm tra điều kiện được
		for (int i : number) {
			System.out.println(i);
		}

	}
}
