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

	HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary,double hoursWorked,double hourlyRate)
	{
		super(firstName,surName,staffNumber,annualSalary);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;

	}
}
