package com.testngtest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest1 {
	
	@BeforeGroups("regression")
	public void before_regression() {
		System.out.println("Applied for Regression 1 only");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test1() {
		System.out.println("test 1 method group 1");
	}
	
	@Test(groups= {"smoke","sanity","regression"})
	public void test2() {
		System.out.println("test 2 method group 1");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("test 3 method group 1");
	}
	
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("test 4 method group 1");
	}

}
