package javaOOP;

public class topic_06_getter_setter {
	private String boyName;
	private int boyAge;
	private boolean isBoyHandsome;

	// boyName
	public String getBoyName() {
		return boyName;
	}

	public void setBoyName(String boyName) {

		if (boyName == null || boyName.isBlank() || boyName.isEmpty()) {
			System.out.println("Please input valid name");
		} else {
			this.boyName = boyName;
		}
	}

	// boyAge
	public int getBoyAge() {
		return boyAge;
	}

	public void setBoyAge(int boyAge) {
		this.boyAge = boyAge;
		if (boyAge > 18) {
			this.boyAge = boyAge;
		} else {
			System.out.println("Please input valid age");
		}
	}

	// isBoyHandsome
	public boolean isBoyHandsome() {
		return isBoyHandsome;
	}

	public void setBoyHandsome(boolean isBoyHandsome) {
		this.isBoyHandsome = isBoyHandsome;
	}

	public void getBoyInfo(String boyName, int boyAge, boolean isBoyHandsome) {
		this.boyAge = boyAge;
		this.boyName = boyName;
		this.isBoyHandsome = isBoyHandsome;
		System.out.println(boyName + " " + boyAge + " " + isBoyHandsome);
	}

	public static void main(String[] args) {
		topic_06_getter_setter topic6 = new topic_06_getter_setter();
		topic6.getBoyInfo("Huy", 4, true);
	}

}
