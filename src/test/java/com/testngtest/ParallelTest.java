package com.testngtest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1() {
		WebElement inputfield= driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
		inputfield.click();
		inputfield.sendKeys("Test Automation");
	}
	
	

}
