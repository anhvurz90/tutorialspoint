package com.anhvurz90.junitest.api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {

  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestJunit1.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure);
    }
    System.out.println(result.wasSuccessful());
  }
}
