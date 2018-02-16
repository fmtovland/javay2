/*
Description: The superclass for which all other classes will be based on
Author: Liam Mc Cormick
Date: 15-2-18
OS: Arch linux
Kernel: 4.15.3-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week4;

public class Account
{
	private String accountName;
	private static int lastAccount=1;	//the last account number given out
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;

	//constructor
	Account(String accountName,String sortCode, String branchName,double acctBalance)
	{
		this.accountName=accountName;
		this.accountNumber=lastAccount;
		lastAccount++;
		this.sortCode=sortCode;
		this.branchName=branchName;
		this.acctBalance=acctBalance;
		if(acctBalance<0)
			this.inCredit=false;
		else
			this.inCredit=true;
	}

	//methods
	public void deposit(double depAmount)
	{
		acctBalance=acctBalance+depAmount;
		if(acctBalance>=0)
			inCredit=true;
	}

	public void withdraw(double takeAmount)
	{
		acctBalance=acctBalance-takeAmount;
		if(acctBalance<0)
			inCredit=false;
	}

	//setters and getters
	public void setaccountName(String accountName)
	{
		this.accountName=accountName;
	}

	public String getaccountName()
	{
		return this.accountName;
	}

	public int getaccountNumber()
	{
		return this.accountNumber;
	}

	public void setsortCode(String sortCode)
	{
		this.sortCode=sortCode;
	}

	public String getsortCode()
	{
		return this.sortCode;
	}

	public void setbranchName(String branchName)
	{
		this.branchName=branchName;
	}

	public String getbranchName()
	{
		return this.branchName;
	}

	public void setinCredit(boolean inCredit)
	{
		this.inCredit=inCredit;
	}

	public boolean getinCredit()
	{
		return this.inCredit;
	}

	public void setacctBalance(double acctBalance)
	{
		this.acctBalance=acctBalance;
	}

	public double getacctBalance()
	{
		return this.acctBalance;
	}

	public String toString()
	{
		return(accountName+","+accountNumber+","+sortCode+","+branchName+","+acctBalance);
	}

}
