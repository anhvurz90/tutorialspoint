package com.anhvurz90.junitest.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase {
  
  protected double fValue1;
  protected double fValue2;
  
  @Before
  public void setUp() {
    fValue1 = 2.0;
    fValue2 = 3.0;
  }
  
  @Test
  public void testAdd() {
    
    //Count the number of test cases;
    System.out.format("No of test case = %s\n", this.countTestCases());
    
    //test getName;
    System.out.format("Test Case Name = %s\n", this.getName());
    
    //test setName
    this.setName("testNewAdd");
    String newName = this.getName();
    System.out.format("Updated Test Case name = %s\n", newName);
  }
  
  @Test
  public void testTest() {
    
    //Count the number of test cases;
    System.out.format("No of test case = %s\n", this.countTestCases());
    
    //test getName;
    System.out.format("Test Case Name = %s\n", this.getName());
    
  }
  

  //tearDown used to close the connection or clean up activities
  public void tearDown() {
  }

}
