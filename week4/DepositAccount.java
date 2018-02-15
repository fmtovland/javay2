/*
Description: a specific type of account
Author: Liam Mc Cormick
Date: 15-2-18
OS: Arch linux
Kernel: 4.15.3-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week4;

public class DepositAccount extends Account
{
	private double intrestRate;

	//constructor
	DepositAccount(String accountName,int accountNumber,String sortCode, String branchName,double acctBalance,double intrestRate)
	{
		super(accountName,accountNumber,sortCode,branchName,acctBalance);
		this.intrestRate=intrestRate;
	}

	//setters/getters
	public void setintrestRate(double intrestRate)
	{
		this.intrestRate=intrestRate;
	}

	public double getintrestRate()
	{
		return this.intrestRate;
	}

	public void deposit(double depAmount)
	{
		System.out.println("You cannot withdraw from a deposit account");
	}

	public String toString()
	{
		return(super.toString()+","+intrestRate);
	}

}
