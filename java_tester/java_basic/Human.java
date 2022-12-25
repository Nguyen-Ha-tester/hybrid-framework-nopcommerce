package java_basic;

public class Human {
	public String Name;
	public int Age;
	
	//Ham khoi tao - constructor
	// Ham khoi tao khong co bien - constructor with no parameter
	public Human() {
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
		System.out.println("Em o day chi Ha oi");
	}
	
	public Human(String name, int age) {
		System.out.println("Ten truyen vao la:" + name);
		System.out.println("Tuoi la:" + age);
		this.Name = name;
		this.Age = age;
	}
}
