/*
Description: for testing classes
Author: Liam Mc Cormick
Date: 15-2-18
OS: Arch linux
Kernel: 4.15.3-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week4;

class Control
{
	public static void main(String[] args)
	{
		Account pete=new Account("Peter pan","NENL","Nowhere",999.99);
		pete.deposit(5.00);
		pete.withdraw(99.99);
		System.out.println(pete);
		pete.getDetails();
		pete.valuableAccount();

		DepositAccount marty=new DepositAccount("Marty Mcfly","XABX","Western",19.85,0.15);
		marty.withdraw(9.99);
		marty.deposit(50);
		System.out.println(marty);

		CurrentAccount tom=new CurrentAccount("Tom Seyer","BAAB","England",-200,0);
		tom.checkCredit();
		tom.checkCredit("warning:account overdrawn");
		System.out.println(tom);
	}
}
