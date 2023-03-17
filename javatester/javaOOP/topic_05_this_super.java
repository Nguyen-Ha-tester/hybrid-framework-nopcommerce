package javaOOP;

public class topic_05_this_super {
	private int a;
	private int b;

	public topic_05_this_super(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		topic_05_this_super topic05 = new topic_05_this_super(15, 7);
		topic05.showSumNumber();
	}

	public void showSumNumber() {
		System.out.println(a + b);
	}

}
