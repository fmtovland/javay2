/*
Class Description: A class to represent a vehicle
Author: Liam McCormick
Date: 25-01-18
OS: Arch Linux
Kernel: 4.14.14-1-ARCH
Java Version: 1.8.0_162
*/

package org.lab1.test;	//put this class in the same package as hello world

public class Vehicle
{
	String ownerName;
	String regNumber;
	String maxSpeed;
	String colour;
	bool automatic;
	int numberOfWheels;

	//constructer for vehicle
	Public Vehicle(String owner, String reg, String topSpeed, String colour, bool automatic, int wheels) //constructer
	{
		self.ownerName=owner;
		self.regNumber=reg;
		self.topSpeed=maxSpeed;
		self.colour=colour;
		self.automatic=automatic;
		self.numberOfWheels=wheels;
	}//end constructer or vehicle

	//a simpler constructor for a vehicle
	Public Vehicle(String owner)
	{
		self.ownerName=owner;
	}
}
