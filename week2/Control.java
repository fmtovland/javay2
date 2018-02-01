package com.labs.week2;

public class Control
{
	public static void main(String[] args)
	{
		Animal spot=new Animal("Spot","Dalmation",4,true,"Black and white",4);
		Animal leo=new Animal("Leo");
		Animal stitch=new Animal("Stitch","Space monster",16,true,"Blue",6);
		Animal elliot=new Animal("Elliot","Dragon",41,true,"Green and Purple and sometimes invisible",4);
		Animal bugs=new Animal("Bugs","Bunny wabbit",78,false,"Gray",2);

		System.out.println(spot);
		System.out.println(leo);
		System.out.println(stitch);
		System.out.println(elliot);
		System.out.println(bugs);

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
