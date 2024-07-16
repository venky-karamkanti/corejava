package com.java.encapsulation;

/*Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. 
  Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
  However, only provide a getter method for the mileage variable*/

public class Car {
	private String company_name;
	private int model_year;
	private String model_name;
	private int mileage;
	public Car(String company_name, int model_year, String model_name, int mileage) {
		super();
		this.company_name = company_name;
		this.model_year = model_year;
		this.model_name = model_name;
		this.mileage = mileage;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getMileage() {
		return mileage;
	}

	public static void main(String[] args) {
	Car car=new Car("Range Rover",2022,"India",20);
	car.setCompany_name("Range Rover");
	car.setModel_year(2022);
	car.setModel_year(2022);
	System.out.println(car.getCompany_name()+" "+car.getModel_year()+" "+car.getModel_name()+" "+car.getMileage());
	
	}

}
