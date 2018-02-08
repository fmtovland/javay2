/*
Class Description: Describe an employee
Author: Liam Mc Cormick
Date: 8-2-18
OS:arch
kernel: 4.14.15-1-ARCH
java version: 1.8.0_162
*/

package com.labs.week3;

class Employee
{
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;

	Employee(String firstName, String surName, int staffNumber, double annualSalary)
	{
		this.firstName=firstName;
		this.surName=surName;
		this.staffNumber=staffNumber;
		this.annualSalary=annualSalary;
	}

	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}

	public String getfirstName()
	{
		return this.firstName;
	}

	public void setsurName(String surName)
	{
		this.surName=surName;
	}

	public String getsurName()
	{
		return this.surName;
	}

	public void setstaffNumber(int staffNumber)
	{
		this.staffNumber=staffNumber;
	}

	public int getstaffNumber()
	{
		return this.staffNumber;
	}

	public void setannualSalary(double annualSalary)
	{
		this.annualSalary=annualSalary;
	}

	public double getannualSalary()
	{
		return this.annualSalary;
	}

	public double calculatePay()
	{
		return this.annualSalary/12;
	}

	public String toString()
	{
		String returnable="";
		returnable=returnable+"This Employee is called "+firstName+" "+surName+"\n";
		returnable=returnable+"Their staff number is "+staffNumber+"\n";
		returnable=returnable+"Their salary is "+annualSalary;
		return returnable;
	}
}
