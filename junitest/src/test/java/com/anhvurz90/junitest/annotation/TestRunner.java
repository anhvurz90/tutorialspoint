package com.anhvurz90.junitest.annotation;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main(String[] args) {
    Result res = JUnitCore.runClasses(JunitAnnotation.class);
    for (Failure f : res.getFailures())
      System.out.println(f);
    System.out.println(res.wasSuccessful());
  }
}
