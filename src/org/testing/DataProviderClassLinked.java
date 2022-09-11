package org.testing;

import org.testng.annotations.Test;

public class DataProviderClassLinked {
	
	@Test(dataProvider="dataSets", dataProviderClass= DataProviderAnnotation.class)
	public void sample(String h1, String h2) {
		System.out.println(h1);
		System.out.println(h2);
	}

}
