package com.anhvurz90.jsf.managedbean.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {

  private String message = "Hello World!";
  
  public Message() {
    System.out.println("Message started!");
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  
}
