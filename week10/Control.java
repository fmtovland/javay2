package com.labs.week10;

class Control
{
	public static void main(String[] args)
	{
		TestHashSet myset=new TestHashSet();
		myset.printSet();
		myset.addEntry("vatican city");
		myset.printSet();
		if(myset.matchEntry("Russia"))
			System.out.println("Russia is here");
		else
			System.out.println("Russia not here");
	}
}
