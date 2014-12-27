package com.anhvurz90.junitest.api;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {

  public static void main(String[] args) {
    // add the tests in the suite
    TestSuite suite = new TestSuite(TestJunit1.class, 
                                    TestJunit2.class,
                                    TestJunit3.class);
    TestResult ret = new TestResult();
    suite.run(ret);
    System.out.format("Number of test cases = %d\n", ret.runCount());
  }
}
