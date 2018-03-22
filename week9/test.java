//a gui free control class to test person

package com.labs.week9;
import java.util.ArrayList;

class test
{
	public static void main(String[] args)
	{
		int i;
		ArrayList people=new ArrayList(0);

		people.add(new Person("John","Smith","London"));
		people.add(new Person("Wolfgang","Mozart","Berlin"));
		people.add(new Person("Donald","Duck","Los Angeles"));

		for(i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i));
		}
	}
}
