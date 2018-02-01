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

		bugs.name="Daffy";
		System.out.println(bugs.name);
	}
}
