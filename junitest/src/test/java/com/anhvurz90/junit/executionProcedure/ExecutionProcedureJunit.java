package com.anhvurz90.junit.executionProcedure;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedureJunit {

  //execute only once, in the starting
  @BeforeClass
  public static void beforeClass() {
    System.out.format("In BeforeClass of %s\n", ExecutionProcedureJunit.class.getName());
  }
  
  //execute only once, in the end
  @AfterClass
  public static void afterClass() {
    System.out.format("In AfterClass of %s\n", ExecutionProcedureJunit.class.getName());
  }
  
  //execute for each test, before executing test
  @Before
  public void before() {
    System.out.format("In Before of %s\n", ExecutionProcedureJunit.class.getName());
  }
  
  //execute for each test, after executing test
  @After
  public void after() {
    System.out.format("In After of %s\n", ExecutionProcedureJunit.class.getName());
  }
  
  //test case 1
  @Test
  public void test1() {
    System.out.println("In Test1");
  }
  
  //test case 2
  @Test
  public void test2() {
    System.out.println("In Test2");
  }
}
