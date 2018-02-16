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
		pete.withdraw(99.99);
		System.out.println(pete);

		DepositAccount marty=new DepositAccount("Marty Mcfly","XABX","Western",19.85,0.15);
		System.out.println(marty);
	}
}
