package javaOOP;

public class topic_01_Class_Object {
	private int maSinhVien;
	private String hoVaTenSinhVien;
	private float diemLyThuyet;
	private float diemThucHanh;

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTenSinhVien() {
		return hoVaTenSinhVien;
	}

	public void setHoVaTenSinhVien(String hoVaTenSinhVien) {
		this.hoVaTenSinhVien = hoVaTenSinhVien;
	}

	public float getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(float diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public float getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(float diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}

	public topic_01_Class_Object(int maSinhVien, String hoVaTenSinhVien, float diemLyThuyetf, float diemThucHanhf) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTenSinhVien = hoVaTenSinhVien;
		this.diemLyThuyet = diemLyThuyetf;
		this.diemThucHanh = diemThucHanhf;
	}

	public void diemTrungBinh() {
		float sum = diemLyThuyet + diemThucHanh * 2;

		System.out.println("Ma sinh vien " + maSinhVien + " co ho va ten la " + hoVaTenSinhVien + " co diem trung binh la = " + (sum / 3));
	}

	public static void main(String[] args) {
		topic_01_Class_Object showSv1 = new topic_01_Class_Object(101, "sv1", 9.7f, 8.5f);
		showSv1.diemTrungBinh();
		topic_01_Class_Object showSv2 = new topic_01_Class_Object(202, "sv2", 9.2f, 8.1f);
		showSv2.diemTrungBinh();
		topic_01_Class_Object showSv3 = new topic_01_Class_Object(303, "sv3", 9.4f, 5.5f);
		showSv3.diemTrungBinh();
	}
}
