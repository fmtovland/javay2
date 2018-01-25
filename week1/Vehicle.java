/*
Class Description: A class to represent a vehicle
Author: Liam McCormick
Date: 25-01-18
OS: Arch Linux
Kernel: 4.14.14-1-ARCH
Java Version: 1.8.0_162
*/

package com.lab1.test;	//put this class in the same package as hello world

public class Vehicle
{
	String ownerName;
	String regNumber;
	String maxSpeed;
	String colour;
	boolean automatic;
	int numberOfWheels;

	//constructer for vehicle
	public Vehicle(String owner, String reg, String topSpeed, String colour, boolean automatic, int wheels) //constructer
	{
		this.ownerName=owner;
		this.regNumber=reg;
		this.maxSpeed=topSpeed;
		this.colour=colour;
		this.automatic=automatic;
		this.numberOfWheels=wheels;

		System.out.println("Owned by: "+owner);
		System.out.println("registered as: "+reg);
		System.out.println("top speed of: "+topSpeed+"Km/H");
		System.out.println("Colour: "+colour);
		//specific output for automatic
		if(automatic)
		{
			System.out.println("automatic: yes");
		}
		else
		{
			System.out.println("automatic: no");
		}

		System.out.println("Wheels:"+wheels);

	}//end constructer or vehicle

	//a simpler constructor for a vehicle
	public Vehicle(String owner)
	{
		this.ownerName=owner;
	}

	public String toString()
	{
		return("Owned by: "+ownerName+"registered as: "+regNumber+"top speed of: "+maxSpeed+"Km/H"+"Colour: "+colour+"automatic"+automatic+"Wheels:"+numberOfWheels);
	}
}
