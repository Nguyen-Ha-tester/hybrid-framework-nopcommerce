package javaOOP;

public class exampleOOP {
	public exampleOOP(String manName, String manAge, String girlName, String girlAge) {
		super();
		this.manName = manName;
		this.manAge = manAge;
		this.girlName = girlName;
		this.girlAge = girlAge;
	}

	private String manName;
	private String manAge;
	private String girlName;
	private String girlAge;

	public String getManAge() {
		return manAge;
	}

	public void setManAge(String manAge) {
		this.manAge = manAge;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getGirlName() {
		return girlName;
	}

	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}

	public String getGirlAge() {
		return girlAge;
	}

	public void setGirlAge(String girlAge) {
		this.girlAge = girlAge;
	}

	protected void showInfo() {
		System.out.println("Man name is " + getManName());
		System.out.println("Man age is " + getManAge());
		System.out.println("Girl name is " + getGirlName());
		System.out.println("Girl name is " + getGirlAge());
	}

	public static void main(String[] args) {
		// show Info 1
		exampleOOP example = new exampleOOP("huy", "25", "ha", "20");
		example.showInfo();
		// show Info 2
		exampleOOP example2 = new exampleOOP("hung", "30", "hai", "49");
		example2.showInfo();
	}
}
