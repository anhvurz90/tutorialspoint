package com.anhvurz90.junitest.assertion;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

  public static void main(String[] args) {
    Result ret = JUnitCore.runClasses(TestAssertion.class);
    for (Failure f : ret.getFailures()) {
      System.out.println(f);
    }
    System.out.println(ret.wasSuccessful());
  }
}
