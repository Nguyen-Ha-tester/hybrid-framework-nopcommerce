package javaBasic;

import java.util.Calendar;
import java.util.Random;

public class Topic_16_Random_Java {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(getRandomEmail());
		Thread.sleep(1000);

		System.out.println(getRandomEmail());
		Thread.sleep(1000);

		System.out.println(getRandomEmail());
		Thread.sleep(1000);

		System.out.println(getRandomEmail());

		System.out.println(getRandomNumber(100, 200));
		System.out.println(getRandomNumber(100, 200));
		System.out.println(getRandomNumber(100, 200));
	}

	// Get ra số ngẫu nhiên từ 0 -> 999
	public static int getRandomNumber1() {
		Random number = new Random();
		return number.nextInt(999);
	}

	// Get số ngẫu nhiên trong 1 dãy số
	public static int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}

	// Get số có 3 chữ số từ 100 -> 999
	public static int getRandomNumber() {
		int uLimit = 999;
		int lLimit = 100;
		Random rand = new Random();
		return lLimit + rand.nextInt(uLimit - lLimit);
	}

	// Get random number by date time minute second (no duplicate)
	public static long getRandomNumberByDateTime() {
		return Calendar.getInstance().getTimeInMillis() % 100000;
	}

	public static String getRandomEmail() {
		return "automation" + getRandomNumberByDateTime() + "@live.com";
	}

}
