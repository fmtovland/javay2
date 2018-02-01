package com.labs.week2;

public class Animal
{

	String name;
	String breed;
	int age;
	boolean domesticAnimal;
	String colour;

	public Animal(String name)
	{
		this.name=name;
	}

	public Animal(String name, String breed, int age, boolean domestic, String colour)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.domesticAnimal=domestic;
		this.colour=colour;
	}

	public String toString()
	{
		String returnable;

		returnable="This animal is called "+name+", ";		//add name to string
		returnable=returnable+"is a "+breed+" that is "+colour+" in colour. ";
		returnable=returnable+"he is "+Integer.toString(age)+" years old. ";
		if(domesticAnimal)
		{
			returnable=returnable+"He is a domestic animal.";
		}

		else
		{
			returnable=returnable+"He is not a domestic animal.";
		}

		return returnable;

	}
}
