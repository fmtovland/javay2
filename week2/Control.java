/*
Class description: control class for animal
Author: Liam McCormick
Date: 1-2-18
OS: Arch
Kernel: 4.14.15-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week2;

public class Control
{
	public static void main(String[] args)
	{
		Animal spot=new Animal("Spot","dalmation",4,true,"Black and white",4);
		Animal leo=new Animal("Leo");
		Animal stitch=new Animal("Stitch","space monster",16,true,"Blue",6);
		Animal elliot=new Animal("Elliot","dragon",41,true,"Green and Purple and sometimes invisible",4);
		Animal bugs=new Animal("Bugs","bunny wabbit",78,false,"Gray",2);

		System.out.println(spot);
		spot.makeNoise(spot.getAge() > 10);
		System.out.println(leo);
		leo.makeNoise(leo.getAge() > 10);
		System.out.println(stitch);
		stitch.makeNoise(stitch.getAge() > 10);
		System.out.println(elliot);
		elliot.makeNoise(elliot.getAge() > 10);
		System.out.println(bugs);
		bugs.makeNoise(bugs.getAge() > 10);

		bugs.setName("Daffy");
		System.out.println(bugs.getName());

		leo.setBreed("Collie");
		System.out.println("Breed: "+leo.getBreed());

		leo.setAge(12);
		System.out.println("Age: "+leo.getAge());

		leo.toggleDomestic();
		System.out.println("domestic: "+leo.getDomestic());

		leo.setColour("red");
		System.out.println("Colour: "+leo.getColour());

		leo.setLegs(3);
		System.out.println("Legs: "+leo.getLegs());
	}
}
