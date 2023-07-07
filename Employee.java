package com.bean;

public class Employee {
  private String employeeName;
  private double employeeSalary;
  private String department;
public Employee(String employeeName, double employeeSalary, String department) {
	super();
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.department = department;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

}
