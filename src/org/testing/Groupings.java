package org.testing;

import org.testng.annotations.Test;

public class Groupings {
	
	@Test(groups="Regression")
	public void sample1() {
		System.out.println("Test1 " + Thread.currentThread().getId());
	}
	
	@Test(groups="Sanity")
	public void sample2() {
		System.out.println("Test2 "+ Thread.currentThread().getId());
	}
	
	@Test(groups={"Regression", "Sanity"})
	public void sample3() {
		System.out.println("Test3 "+ Thread.currentThread().getId());
	}
	
	@Test(groups="Sanity")
	public void sample4() {
		System.out.println("Test4 "+ Thread.currentThread().getId());
	}
	
	@Test(groups="Regression")
	public void sample5() {
		System.out.println("Test5 "+ Thread.currentThread().getId());
	}

}
