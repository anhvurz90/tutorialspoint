package com.anhvurz90.junitest.api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestJunit2.class);
    for (Failure f : result.getFailures()) {
      System.out.println(f);
    }
    System.out.println(result.wasSuccessful());
  }
}
