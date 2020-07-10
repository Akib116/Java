package com.aiub.lab;
import java.io.*;

public class checkingAccount {
	
	private double balance;
	private int number;
	public checkingAccount(int number) {
	this.number = number;
	}
	public void deposit(double amount) {
	balance += amount;
	}
	public void withdraw(double amount) throws InsufficientfundsException {
	if(amount <= balance) {
	balance -= amount;
	}else {
	double needs = amount - balance;
	throw new InsufficientfundsException(needs);
	}
	}
	public double getBalance() {
	return balance;
	}
	public int getNumber() {
	return number;
	}
	}


