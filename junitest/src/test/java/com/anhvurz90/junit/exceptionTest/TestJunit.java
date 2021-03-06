package com.anhvurz90.junit.exceptionTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

  private String message = "Robert";
  private MessageUtil messageUtil = new MessageUtil(message);
  
  @Test(expected = ArithmeticException.class)
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage");
    //messageUtil.printMessage();
  }
  
  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!Robert";
    assertEquals(message, messageUtil.salutationMessage());
  }
}
