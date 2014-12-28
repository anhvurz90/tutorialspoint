package com.anhvurz90.junit.testSuite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit1 {
  private String message = "Robert";
  private MessageUtil messageUtil = new MessageUtil(message);
  
  @Test
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage()");
    assertEquals(message, messageUtil.printMessage());
  }
}
