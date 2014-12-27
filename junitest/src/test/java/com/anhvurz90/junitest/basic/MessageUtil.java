package com.anhvurz90.junitest.basic;

/**
 * This class prints the given message on the console.
 * @author Anh Vu
 *
 */
public class MessageUtil {

  private String message;
  
  //Constructor
  public MessageUtil(String message) {
    this.message = message;
  }
  
  // prints the message
  public String printMessage() {
    System.out.println(message);
    return message;
  }
}
