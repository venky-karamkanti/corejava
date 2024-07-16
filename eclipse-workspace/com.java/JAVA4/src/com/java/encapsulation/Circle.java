package com.java.encapsulation;

/*Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods
to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return
the calculated area and perimeter based on the current radius value.*/

public class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float calculateArea() {
		
     return (float) (2*Math.PI*radius);
}
public float calculatePerimeter() {
return (float) (Math.PI*radius*radius);
}
	public static void main(String[] args) {
		Circle circle=new Circle(6);
		System.out.println("Area of the Circle:  "+ circle.calculateArea());
	System.out.println("Perimeter of the circle  "+circle.calculatePerimeter());

	}}
