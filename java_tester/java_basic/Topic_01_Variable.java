package java_basic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_01_Variable {
	String bienToanCuc = "ha"; // Biến toàn cục: sử dụng trong phạm vi class (bao gồm cả method, trừ static method) và sử dụng bên ngoài class được (tuỳ theo access modifier)

	static final String BROWSER_NAME = "HA"; //Biến final (const)
	static int studentNumber; // thằng int giá trị mặc định = 0
	static boolean result; // thằng int giá trị mặc định = false
							// Tại sao cần có "static" trước kiểu dữ liệu? Vì để dùng biến trong hàm public static ở dưới "Cannot make a static reference to the non-static field name"
	
	public static void main(String[] args) {	
		System.out.println(studentNumber);
		System.out.println(result);
		//System.out.println(bienToanCuc); //biến toàn cục (global variable) mà k có static ở trước là k đc dùng trong hàm static
		String bienCucbo = ""; // Biến cục bộ (local variable): chỉ sử dụng trong phạm vi của 1 method (testcase) thôi hoặc 1 khối lệnh, k sử dụng bên ngoài được
		System.out.println(bienCucbo);
		Topic_01_Variable huy = new Topic_01_Variable(); // this dòng. không có cái này làm sao nó chạy vào hàm khởi tạo này
		huy.KhongGoiChacChanTaoDeoChay();
		huy.KhongGoiChacChanTaoDeoChay();
		
		//Block code
		if (3<5) {
			String bienCucBo1 = "";
			System.out.println(bienCucBo1); //biến cục bộ này chỉ hiệu nghiệm trong block if này thôi
		}
	}
	
	public Topic_01_Variable() {
	 // đây gọi là HẢM KHỞI TẠO. Hàm khởi tạo có cùng tên hàm với tên class
				
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		System.out.println(name);
//		System.out.println(name);
//		System.out.print(name);
//		System.out.print(name);
	}
	
		public void KhongGoiChacChanTaoDeoChay() {
			System.out.println("Chi Ha goi em a");
		}
	}
	

// aluaa, phone het pin :( 
// kaka do ngoc
// ý hà hỏi là nó k chạy hàm khởi tạo hả?
// dung roi tai vi em ko co dong nay
// ồ, cũng có lí
// xem xét
// xem gì nữa
// e tưởng khi run thì run hết các hàm luôn chứ còn gì nứa
// thế có mà chết à.
// thế tại sao lại k run hàm khởi tạo cho hà
// hà có thể viết 9999 hàm. nhưng không gọi thì không chạy
// ồ có lí nhỉ
//ok, hà hiểu rồi, tạm chấp nhận. ví dụ nhé????ok
// Ủa, mà nếu phải gọi thì mới chạy, thế có bao nhiêu cách gọi tất cả?
// 1 and only. Đây là khi không gọi nè. Đây là cách gọi nè