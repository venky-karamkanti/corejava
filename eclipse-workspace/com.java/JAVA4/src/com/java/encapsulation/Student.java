package com.java.encapsulation;

/*Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. 
Provide public getter and setter methods to access and modify the student_id and student_name variables. However,
provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.*/
public class Student {
	private int student_id;
	private String student_name;
	private float grades;

	public Student(int student_id, String student_name, float grades) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.grades = grades;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
public  void addGrade(){
	
	
}
	public static void main(String[] args) {


	}

}
