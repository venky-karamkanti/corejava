package com.java.encapsulation;

/* Write a Java program to create a class called Person with private instance variables name, age. and country
. Provide public getter and setter methods to access and modify these variables.*/
public class Person {
	private String name;
	private int age;
	private String country;
	public Person(String name,int age,String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public static void main(String[] args) {
		Person person=new Person("Venky",23,"India");
		person.setName("Venky");
		person.setAge(23);
		person.setCountry("India");
		System.out.println("Name: "+person.getName()+'\n'+"Age: "+person.getAge()+'\n'+"Country: "+person.getCountry());
		Person p1=new Person("Babu",23,"America");
		p1.setName("Babu");
		p1.setAge(23);
		p1.setCountry("America");
		System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getCountry());
		Person p2=new Person("Ajay",23,"Pakistan");
		p2.setName("Ajay");
		p2.setAge(23);
		p2.setCountry("Pakistan");
		System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getCountry());
	}
}
