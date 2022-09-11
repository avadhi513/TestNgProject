package org.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Test case for Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Test case for After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test case for Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test case for After Test");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Test case for Before Groups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("Test case for After Groups");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test case for Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test case for After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test case for Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Test case for After Class");
	}
	
	@Test
	public void simple() {
		System.out.println("Test");
	}

	@Test
	public void simple1() {
		System.out.println("Test 1");
	}
	
}
