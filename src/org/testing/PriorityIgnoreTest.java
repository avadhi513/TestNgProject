package org.testing;

import org.testng.annotations.Test;

public class PriorityIgnoreTest {
	
	@Test
	public void sample1() {
		System.out.println("Test1");
	}
	
	@Test(priority=0, invocationCount = 3) 
	// invocationCount= number of times the test case will be involved
	public void sample2() {
		System.out.println("Test2");
	}
	
	@Test(enabled = false)
	public void sample3() {
		System.out.println("Test3");
	}
	
	@Test(priority=-1)
	public void sample4() {
		System.out.println("Test4");
	}
	
	@Test(priority=1)
	public void sample5() {
		System.out.println("Test5");
	}

}
