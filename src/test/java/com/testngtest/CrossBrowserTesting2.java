package com.testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting2 {
	
	WebDriver driver;
	String url = "https://www.google.com/";

	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get(url);
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.get(url);
			break;
		case "safari":
			driver = new SafariDriver();
			driver.get(url);
		}

//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
	}

	@Test
	public void test1() {
		WebElement inputfield = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
		inputfield.click();
		inputfield.sendKeys("Test Automation");
	}

}
