package com.testngtest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelClass {
	
	@Test
	public void EdgeTest() {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement inputfield= driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
		inputfield.click();
		inputfield.sendKeys("Test Automation");
		System.out.println("Thread Id: " + Thread.currentThread().getId());
	}

}
