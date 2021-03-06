package com.anhvurz90.junit.testSuite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit2 {

  private String message = "Robert";
  private MessageUtil messageUtil = new MessageUtil(message);
  
  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "Hi!Robert";
    assertEquals(message, messageUtil.salutationMessage());
  }
}
