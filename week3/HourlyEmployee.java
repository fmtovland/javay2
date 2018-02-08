/*
Class Description: a different type of employee
Author: Liam Mc Cormick
Date: 8-2-18
OS:arch
kernel: 4.14.15-1-ARCH
java version: 1.8.0_162
*/

package com.labs.week3;

public class HourlyEmployee extends Employee
{
	double hoursWorked;
	double hourlyRate;

	public void sethoursWorked(double hoursWorked)
	{
		this.hoursWorked=hoursWorked;
	}

	public double gethoursWorked()
	{
		return this.hoursWorked;
	}

	public void sethourlyRate(double hourlyRate)
	{
		this.hourlyRate=hourlyRate;
	}

	public double gethourlyRate()
	{
		return this.hourlyRate;
	}


	HourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked,double hourlyRate)
	{
		super(firstName,surName,staffNumber,0);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;

	}

	public double calculatePay()
	{
		return hourlyRate*hoursWorked;
	}

	public String toString()
	{
		String returnable="";
		returnable=returnable+"This Employee is called "+super.getfirstName()+" "+super.getsurName()+"\n";
		returnable=returnable+"Their staff number is "+super.getstaffNumber()+"\n";
		returnable=returnable+"Their hourly pay is "+hourlyRate+"\n";
		returnable=returnable+"They have worked "+hoursWorked+"\n";
		return returnable;
	}

}
