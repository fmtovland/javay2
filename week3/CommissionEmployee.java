/*
Class Description: a different type of employee
Author: Liam Mc Cormick
Date: 8-2-18
OS:arch
kernel: 4.14.15-1-ARCH
java version: 1.8.0_162
*/

package com.labs.week3;

public class CommissionEmployee extends Employee
{
	double commissionEarned;

	CommissionEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned)
	{
		super(firstName,surName,staffNumber,annualSalary);
		this.commissionEarned=commissionEarned;

	}
}
