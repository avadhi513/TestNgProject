package org.testing;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleParameters {
	
	@Test
	@Parameters({"UserName", "Password"})
	public void param1(String name, String credentials) {
		System.out.println("Para1 " + Thread.currentThread().getId());
		System.out.println("UserName is: "+name);
		System.out.println("Password is: "+credentials);
		
	}

	@Test
	@Parameters({"User", "Password"})
	public void param2(@Optional("Java")String name, String credentials) {
		System.out.println("Para2 " + Thread.currentThread().getId());
		System.out.println("UserName is: "+name);
		System.out.println("Password is: "+credentials);
		
	}
	
}
