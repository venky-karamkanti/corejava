package com.java.encapsulation;

/*Write a Java program to create a class called BankAccount with private instance variables
accountNumber and balance. Provide public getter and setter methods to access and modify these variables.*/

public class BankAccount {
	private String accNumber;
	private float accBalance;
	public BankAccount(String accNumber,float accBalance) {
		this.accNumber=accNumber;
		this.accBalance=accBalance;
		
	}
	
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	public static void main(String[] args) {
		BankAccount bankaccount=new BankAccount("SB-2185715",90000);
		bankaccount.setAccNumber("SB-2185715");
		bankaccount.setAccBalance(90000);
		System.out.println("Account number: "+bankaccount.getAccNumber()+'\n'+" Balance: "+bankaccount.getAccBalance());
	

	}

}
