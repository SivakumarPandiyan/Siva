package com.testngtest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	
	
	@BeforeGroups("regression")
	public void before_regression() {
		System.out.println("Applied for Regression only");
	}
	
	
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test 1 method");
	}
	
	@Test(groups= {"smoke","sanity","regression"})
	public void test2() {
		System.out.println("test 2 method");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("test 3 method");
	}
	
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test 4 method");
	}
	

}
