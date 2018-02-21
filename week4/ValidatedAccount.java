/*
Description: An interface to be implemented by the other classes
Author: Liam McCormick
Date: 16-2-18
OS: Arch linux
Kernel 4.15.3
Java Version: 1.8.0_162
*/

package com.labs.week4;

public interface ValidatedAccount
{
	void getDetails();	//should System.out.print the account type (deposit, current or
				//account) - and the account balance and account name as a readable string

	void valuableAccount();	//which should System.out.println the account balance as a
				//readable string
}

