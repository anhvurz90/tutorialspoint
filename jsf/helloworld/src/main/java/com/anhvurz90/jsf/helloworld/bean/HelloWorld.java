package com.anhvurz90.jsf.helloworld.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
  public HelloWorld() {
    System.out.println("HelloWorld started!");
  }
  
  public String getMessage() {
    return "Hello World!";
  }
}
