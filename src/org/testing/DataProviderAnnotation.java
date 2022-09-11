package org.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	@Test(dataProvider="dataSets")
	public void testOne(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}

	@DataProvider(name="dataSets")
	public static Object[][] data() {
		
		return new Object[][]{
			
			{"101", "Java"},
			{"102", "Selenium"},
			{"103", "API"}
			
		};
		
	}
	
}
