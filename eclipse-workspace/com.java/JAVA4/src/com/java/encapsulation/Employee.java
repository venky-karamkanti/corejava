package com.java.encapsulation;

/*Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary 
variable that returns a formatted string*/
public class Employee {
	private int employee_id;
	private String employee_name;
	private String employee_salary;

	public Employee(int employee_id, String employee_name, String employee_salary) {

		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_salary() {
		return employee_salary;
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee(2185715,"Venkatesh","120000");
		emp.setEmployee_id(2185715);
		emp.setEmployee_name("Venkatesh");
    System.out.println(emp.getEmployee_id()+" "+emp.getEmployee_name()+" "+emp.getEmployee_salary());
    }

}
