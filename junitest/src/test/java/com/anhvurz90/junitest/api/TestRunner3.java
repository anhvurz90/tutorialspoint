package com.anhvurz90.junitest.api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner3 {

  public static void main(String[] args) {
    Result ret = JUnitCore.runClasses(TestJunit3.class);
    for (Failure f : ret.getFailures()) {
      System.out.println(f);
    }
    System.out.println(ret.wasSuccessful());
  }
}
