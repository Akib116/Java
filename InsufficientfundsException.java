package com.aiub.lab;
import java.io.*;

public class InsufficientfundsException extends Exception {
	
	
	private double amount;
	public InsufficientfundsException(double amount) {
	this.amount = amount;
	}
	public double getAmount() {
	return amount;
	}
	}



