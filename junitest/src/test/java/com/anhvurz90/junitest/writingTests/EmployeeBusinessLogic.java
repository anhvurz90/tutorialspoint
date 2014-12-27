package com.anhvurz90.junitest.writingTests;

public class EmployeeBusinessLogic {

  public double calculateAnnualSalary(EmployeeDetails eDetails) {
    return eDetails.getMonthlySalary() * 12;
  }
  
  public double calculateAppraisal(EmployeeDetails eDetails) {
    return (eDetails.getMonthlySalary() < 10000) ? 500 : 1000;
  }
}
