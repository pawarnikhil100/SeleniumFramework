package com.TestNG;

import org.testng.annotations.*;

public class TestNGExample1 {
	@Test
	public void t1() {
		System.out.println("Test case1");
	}

	@Test
	public void t2() {
		System.out.println("Test case2");

	}

	@BeforeClass
	public void c1() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void c2() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void m1() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void m2() {
		System.out.println("after method");
	}
}
