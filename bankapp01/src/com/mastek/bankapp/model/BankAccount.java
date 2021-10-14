package com.mastek.bankapp.model;

public class BankAccount {
public int accNo;
public String accName;
public double balance;

public String withdraw(double  amount){
	
	return amount+" debited from Account No "+accNo;
} 
public String deposit(double  amount){
	
	return amount+" credit from Account No "+ accNo ;
} 



}
