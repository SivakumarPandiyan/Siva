package com.runnerclass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.testmavenclass.JunitTest;
import com.testmavenclass.MavenTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({JunitTest.class,MavenTest.class})
public class Runner {

}
