package com.anhvurz90.junit.timeTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  public static void main(String[] args) {
    Result ret = JUnitCore.runClasses(TestJunit.class);
    System.out.println("---------------------");
    for (Failure f : ret.getFailures()) {
      System.out.println(f);
    }
    System.out.println(ret.wasSuccessful());
  }
}
