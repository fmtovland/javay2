/*
Class Description: control class
Author: Liam Mc Cormick
Date: 8-2-18
OS:arch
kernel: 4.14.15-1-ARCH
java version: 1.8.0_162
*/

package com.labs.week3;

class Control
{
	public static void main(String[] args)
	{
		Employee martha=new Employee("Martha","Jones",8,999.99);
		System.out.println(martha);
		System.out.println(martha.calculatePay()+" is her monthly pay\n");

		HourlyEmployee john=new HourlyEmployee("John","Smith",4,40,3.99);
		System.out.println(john);
		System.out.println(john.calculatePay()+" is her monthly pay");
	}
}
