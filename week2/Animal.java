package com.labs.week2;

public class Animal
{

	String name;
	String breed;
	int age;
	boolean domesticAnimal;
	String colour;
	int legs;

	public Animal(String name)
	{
		this.name=name;
	}

	public Animal(String name, String breed, int age, boolean domestic, String colour,int legs)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.domesticAnimal=domestic;
		this.colour=colour;
		this.legs=legs;
	}

	public String toString()
	{
		String returnable;

		returnable="This animal is called "+name+", ";		//add name to string
		returnable=returnable+"is a "+breed+" that is "+colour+" in colour. ";	//add breed and colour
		returnable=returnable+"he is "+Integer.toString(age)+" years old. ";	//add age
		if(domesticAnimal)		//add domestic or not
		{
			returnable=returnable+"He is a domestic animal.";
		}

		else
		{
			returnable=returnable+"He is not a domestic animal. ";
		}

		returnable=returnable+"He has "+Integer.toString(legs)+" legs.";	//add number of legs

		return returnable;

	}
}
