//test other classes

package com.labs.week8;

class test
{
	public static void main(String[] args)
	{
		Person p1=new Person("John","Smith",new Date(1,1,1970),"male");
		Employee e1=new Employee("Stan","Lee",new Date(28,12,1922),"male",new Job("artist", 1000000),new Date(15,1,1939));

		System.out.println(p1+"\n");
		System.out.println(e1);
	}
}
