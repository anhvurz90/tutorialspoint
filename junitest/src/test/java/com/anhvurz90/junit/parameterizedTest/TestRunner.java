package com.anhvurz90.junit.parameterizedTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main(String[] args) {
    Result ret = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
    for (Failure f : ret.getFailures()) {
      System.out.println(f);
    }
    System.out.println(ret.wasSuccessful());
  }
}
