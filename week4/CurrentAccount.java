/*
Description: a specific type of account
Author: Liam Mc Cormick
Date: 15-2-18
OS: Arch linux
Kernel: 4.15.3-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week4;

class CurrentAccount extends Account
{
	private double penaltyAmount;

	//constructor
	public CurrentAccount(String accountName,int accountNumber,String sortCode, String branchName,double acctBalance,double penaltyAmount)
	{
		super(accountName,accountNumber,sortCode,branchName,acctBalance);
		this.penaltyAmount=penaltyAmount;
	}


	//methods
	public String checkCredit()
	{
		if(super.getinCredit())
			return "Account is in credit";
		else
			return "Account is not in credit";

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
