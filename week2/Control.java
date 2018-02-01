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
		spot.makeNoise();
		System.out.println(leo);
		leo.makeNoise();
		System.out.println(stitch);
		stitch.makeNoise();
		System.out.println(elliot);
		elliot.makeNoise();
		System.out.println(bugs);
		bugs.makeNoise();

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
