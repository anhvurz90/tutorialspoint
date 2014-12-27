package com.anhvurz90.junitest.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestJunit {

  private String message = "Hello World";
  private MessageUtil messageUtil = new MessageUtil(message);
  
  @Test
  public void testPrintMessage() {
    assertEquals(message, messageUtil.printMessage());
    assertNotEquals("New world", messageUtil.printMessage());
  }
}
