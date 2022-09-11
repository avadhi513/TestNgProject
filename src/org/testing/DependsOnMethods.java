package org.testing;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods="sample3")
	public void sample1() {
		System.out.println("Test1 " + Thread.currentThread().getId());
	}
	
	@Test
	public void sample2() {
		System.out.println("Test2 "+ Thread.currentThread().getId());
	}
	
	@Test(dependsOnMethods="sample4")
	public void sample3() {
		System.out.println("Test3 "+ Thread.currentThread().getId());
	}
	
	@Test(dependsOnMethods="sample5")
	public void sample4() {
		System.out.println("Test4 "+ Thread.currentThread().getId());
	}
	
	@Test
	public void sample5() {
		System.out.println("Test5 "+ Thread.currentThread().getId());
	}

}
