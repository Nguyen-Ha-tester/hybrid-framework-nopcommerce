package class_access_modifier;

public class computer {
	// Property
	private int ssdSize;
	String ramProductName;
	public int vgaSize;
	protected int cpuSize;

	// Method
	private void setSsdSize(int ssdSize) {
		this.ssdSize = ssdSize; // dùng this 2 biến global và local giống nhau -> để lấy biến global về biến local
	}

	private void setRamProductName(String ramProductName) {
		this.ramProductName = ramProductName;
	}

	public void setVgaSize(int vgaSize) {
		this.vgaSize = vgaSize;
	}

	public static void main(String[] arg) {
		// khởi tạo
		computer comp = new computer();

		// gọi thông qua property (thuộc tính - biến)
		comp.ssdSize = 500;
		System.out.println(comp.ssdSize);
		comp.ramProductName = "Kington";
		System.out.println(comp.ramProductName);
		comp.vgaSize = 6;
		System.out.println(comp.vgaSize);
		comp.cpuSize = 30;
		System.out.println(comp.cpuSize);

		// gọi thông qua method (hàm)
		comp.setSsdSize(500);
		System.out.println(comp.ssdSize);
		comp.setRamProductName("Kington");
		System.out.println(comp.ramProductName);
		comp.setVgaSize(4);
		System.out.println(comp.vgaSize);

	}

}
