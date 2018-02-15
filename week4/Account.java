/*
Description: Rules for every other file in todays lab.
Author: Liam McCormick
Date: 15-2-18
OS: Arch linux
Kernel 4.15.3
Java Version: 1.8.0_162
*/

package com.labs.week4;

public interface Account
{
	String getAccountName();
	void setAccountName(String newName);

	int getAccountNumber();
	void setAccountNumber(int newNumber);

	String getSortCode();
	void setSortCode(String newCode);

	String getBranchName();
	void setBranchName(String newName);

	boolean getInCredit();
	void toggleInCredit();

	double getAcctBalance();
	void setAcctBalance(double balance);
}
