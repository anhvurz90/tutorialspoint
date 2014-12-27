package com.anhvurz90.junitest.writingTests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {

  private EmployeeBusinessLogic eBL = new EmployeeBusinessLogic();
  private EmployeeDetails employee = new EmployeeDetails();
  
  //test to check appraisal
  @Test
  public void testCalculateAppraisal() {
    employee.setName("Rajeev");
    employee.setAge(25);
    employee.setMonthlySalary(8000);
    double appraisal = eBL.calculateAppraisal(employee);
    assertEquals(500, appraisal, 0.0);
  }
  
  //test to check annual salary
  @Test
  public void testCalculateAnnualSalary() {
    employee.setName("Rajeev");
    employee.setAge(25);
    employee.setMonthlySalary(8000);
    double salary = eBL.calculateAnnualSalary(employee);
    assertEquals(96000, salary, 0.0);
  }
}
