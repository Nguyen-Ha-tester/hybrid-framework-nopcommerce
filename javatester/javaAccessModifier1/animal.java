package javaAccessModifier1;

public class animal // extends dog => k được vì class dog là final nên k cho class khác kế thừa
{
	// Method/ property modifier
	private String name; // chỉ truy cập bên trong class
	String age; // default: access trong class và trong package
	protected int eyes; // access bên trong class, trong package và ngoài package bởi class con
	public float weight; // access everywhere gọi lên

	cat cat1 = new cat();
	dog dog1 = new dog(); // class dog là final nhưng vẫn cho khởi tạo được
}
