package com.testngfeatures;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void f() {
		System.out.println("Orange hrm login");
	}

	@Test(priority = -1)
	public void f1() {
		System.out.println("Create employee");
	}

	@Test(priority = 0)
	public void f2() {
		System.out.println("create admin");
	}

	@Test(priority = 2)
	public void f3() {
		System.out.println("apply leave");
	}
}
