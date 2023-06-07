package javaTestNG;

import org.testng.annotations.Test;

public class TestNFParallelTestingDemo {

	@Test
	public void Test_01() throws Exception {
		System.out.println(" Test 01 " + Thread.currentThread().getName());
	}

	@Test
	public void Test_02() {
		System.out.println(" Test 02 " + Thread.currentThread().getName());

	}
}
