package javaBasic;

public class human {
	public String Name;
	public int Age;

	// Ham khoi tao - constructor
	// Ham khoi tao khong co bien - constructor with no parameter
	public human() {
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
	}

	public human(String name, int age) {
		System.out.println("Ten truyen vao la:" + name);
		System.out.println("Tuoi la:" + age);
		this.Name = name;
		this.Age = age;
	}

}
