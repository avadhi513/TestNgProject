package org.testing;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class AssertsClass {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void sample1() {
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}

	@Test
	public void sample2() {
		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("Java");
		Assert.assertEquals("Java", txtMail.getAttribute("value"));
	}

	@AfterMethod
	public void after() {
	}

	@AfterClass
	public void afterClass() {
		Date d = new Date();
		System.out.println(d);
	}

}
