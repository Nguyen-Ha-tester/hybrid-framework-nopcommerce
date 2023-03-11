package classAccessModifier;

public class laptop {
	public static void main(String[] arg) {
		computer comp = new computer();

		// Không truy cập vào được biến ssdSize vì đó là biến private
		// comp.ssdSize = 500;
		// System.out.println(comp.ssdSize);

		// comp.setSsdSize(500);
		// System.out.println(comp.ssdSize);

		// Truy cập được vào biến default cùng package
		comp.ramProductName = "Kington2";
		System.out.println(comp.ramProductName);

	}
}
