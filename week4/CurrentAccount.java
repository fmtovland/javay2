/*
Description: a specific type of account
Author: Liam Mc Cormick
Date: 15-2-18
OS: Arch linux
Kernel: 4.15.3-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week4;

class CurrentAccount extends Account implements ValidatedAccount
{
	private double penaltyAmount;

	//constructor
	public CurrentAccount(String accountName,String sortCode, String branchName,double acctBalance,double penaltyAmount)
	{
		super(accountName,sortCode,branchName,acctBalance);
		this.penaltyAmount=penaltyAmount;
	}


	//methods
	public void checkCredit()
	{
		if(super.getinCredit())
			System.out.println("Account is in credit");
		else
			System.out.println("Account is not in credit");

	}

	public void checkCredit(String message)
	{
		if(!super.getinCredit())
			System.out.println(message);
	}

	//setters getters
	public void setpenaltyAmount(double penaltyAmount)
	{
		this.penaltyAmount=penaltyAmount;
	}

	public double getpenaltyAmount()
	{
		return this.penaltyAmount;
	}


}
