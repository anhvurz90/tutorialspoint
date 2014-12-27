package com.anhvurz90.junitest.annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {

  @BeforeClass
  public static void beforeClass() {
    System.out.println("In before class");
  }
  
  @AfterClass
  public static void afterClassss() {
    System.out.println("In after class");
  }
  
  @Before
  public void before() {
    System.out.println("In before");
  }
  
  @After
  public void afterrr() {
    System.out.println("In after");
  }
  
  @Test
  public void tes() {
    System.out.println("In test");
  }
  
  @Ignore
  public void ignore() {
    System.out.println("In ignore");
  }
}
