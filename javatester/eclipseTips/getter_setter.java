package eclipseTips;

public class getter_setter {

// Cách truyền thống là tự gõ hàm getter, setter
	private String carNameG; // biến global

	// Lập trình hướng đối tượng là chỉ cho phép truy cập thông qua các hàm
	// (getter_setter), chứ không cho phép truy cập trực tiếp vào thuộc tính

	// hàm setter: để gán dữ liệu (ví dụ trong selenium có các hàm setter như click, sendKey,...)
	public void setCarName(String carNameL) {
		this.carNameG = carNameL; // sử dụng this để lấy biến carNameG global này gán vào biến local carNameL
	}

	// Getter: để lấy dữ liệu ra (ví dụ trong selenium có các hàm getText, getURL,..)
	public String getCarName() {
		return carNameG;
	}
	
	
	
//Eclipse tự generate hộ lè
	private String bien1;
	private String bien2;
	private String bien3;
	private String bien4;

	public String getCarNameG() {
		return carNameG;
	}

	public void setCarNameG(String carNameG) {
		this.carNameG = carNameG;
	}

	public String getBien1() {
		return bien1;
	}

	public void setBien1(String bien1) {
		this.bien1 = bien1;
	}

	public String getBien2() {
		return bien2;
	}

	public void setBien2(String bien2) {
		this.bien2 = bien2;
	}

	public String getBien3() {
		return bien3;
	}

	public void setBien3(String bien3) {
		this.bien3 = bien3;
	}

	public String getBien4() {
		return bien4;
	}

	public void setBien4(String bien4) {
		this.bien4 = bien4;
	}
	
}