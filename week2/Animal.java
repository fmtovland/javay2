package com.labs.week2;

public class Animal
{

	private String name;
	private String breed="Unknown";
	private int age;
	private boolean domesticAnimal;
	private String colour="Unknown";
	private int legs=4;


	public void makeNoise()	//say  woof, meow etc
	{
		if(breed == "dog" || breed == "collie" || breed == "dalmation")
			System.out.println("Woof!");
		else if(breed == "duck")
			System.out.println("Quack!");
		else if(breed == "rabbit" || breed == "bunny" || breed == "bunny wabbit")
			System.out.println("Whats up doc?");
		else
			System.out.println("He got stagefright. Poor thing.");
	}

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

		returnable="This animal is called "+name+". ";		//add name to string
		returnable=returnable+"he is a "+breed+" that is "+colour+" in colour. ";	//add breed and colour
		returnable=returnable+"he is "+Integer.toString(age)+" years old. ";	//add age
		if(domesticAnimal)		//add domestic or not
		{
			returnable=returnable+"He is a domestic animal. ";
		}

		else
		{
			returnable=returnable+"He is not a domestic animal. ";
		}

		returnable=returnable+"He has "+Integer.toString(legs)+" legs.";	//add number of legs

		return returnable;

	}

	public void setName(String changed)	//change the name of the animal
	{
		this.name=changed;
	}

	public String getName()
	{
		return this.name;
	}

	public void setBreed(String changed)	//change the breed of the animal
	{
		this.breed=changed;
	}

	public String getBreed()
	{
		return this.breed;
	}

	public void setAge(int changed)	//change the age of the animal
	{
		this.age=changed;
	}

	public int getAge()
	{
		return this.age;
	}

	public void toggleDomestic()		//switch the animal to domestic or wild
	{
		if(domesticAnimal)
			domesticAnimal=false;
		else
			domesticAnimal=true;
	}

	public boolean getDomestic()
	{
		return this.domesticAnimal;
	}

	public void setColour(String changed)
	{
		this.colour=changed;
	}

	public String getColour()
	{
		return this.colour;
	}

	public void setLegs(int changed)
	{
		this.legs=changed;
	}

	public int getLegs()
	{
		return this.legs;
	}

}
