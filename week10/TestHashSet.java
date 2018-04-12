package com.labs.week10;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

class TestHashSet
{
	String[] euroCons={"Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark",  "Estonia",  "Hungary", "Iceland", "Ireland", "Italy", "Kosovo", "Latvia", "Liechtenstein", "Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Norway", "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia",  		"Spain", "Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"};
	HashSet europe;

	TestHashSet()
	{
		europe=new HashSet<String>(Arrays.asList(euroCons));
	}

	public void printSet()
	{
		Iterator ittr=europe.iterator();
		while(ittr.hasNext())
		{
			System.out.println(ittr.next());
		}
	}

	void addEntry (String country)
	{
		europe.add(country);
	}
}
