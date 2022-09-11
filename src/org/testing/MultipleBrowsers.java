package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsers {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	
	public void test(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Aastha\\eclipse-workspace\\TestNgProject\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}		
		
	}

}
