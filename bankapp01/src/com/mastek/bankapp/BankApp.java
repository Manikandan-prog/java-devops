package com.mastek.bankapp;

import com.mastek.bankapp.model.BankAccount;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BankAccount account= new BankAccount();
      account.accNo=101;
      account.accName="ABC";
      account.balance=30000;
      
      System.out.println("Account No: "+account.accNo);
      System.out.println("Account Holder Name: "+account.accName);
      System.out.println("Balance: "+account.balance);
      
      String msg= account.withdraw(5000);
      System.out.println(msg);
      
      msg= account.deposit(2000);
      System.out.println(msg);
      
	}

}
