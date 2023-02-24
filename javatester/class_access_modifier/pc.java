package class_access_modifier;

public class pc extends computer {

	public void showComputer() {

		// Truy cập được vào biến default cùng package
		ramProductName = "Kington2";
		System.out.println(ramProductName);

		// truy cập vào biến public vô tư
		vgaSize = 16;
		System.out.println(vgaSize);
		setVgaSize(24);
		System.out.println(vgaSize);

	}

}
