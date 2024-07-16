package com.java.encapsulation;

/*Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.*/

public class Rectangle {
	private int length;
	private int width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public static void main(String[] args) {
		Rectangle rectangle=new  Rectangle(20,30);
		rectangle.setLength(20);
		rectangle.setWidth(30);
		System.out.println("Length of the rectangle: "+rectangle.getLength()+'\n'+"Width of the Rectangle: "+rectangle.getWidth());


	}

}
