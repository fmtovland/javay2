//a class to represent a person

package com.labs.week9;

class Person
{
	private String firstname;
	private String surname;
	private String city;

	Person(String firstname,String surname,String city)
	{
		this.firstname=firstname;
		this.surname=surname;
		this.city=city;
	}

	public void setFirstname(String firstname)
	{
		this.firstname=firstname;
	}

	public String getFirstname()
	{
		return this.firstname;
	}

	public void setSurname(String surname)
	{
		this.surname=surname;
	}

	public String getSurname()
	{
		return this.surname;
	}

	public void setCity(String city)
	{
		this.city=city;
	}

	public String getCity()
	{
		return this.city;
	}

	public String toString()
	{
		return this.firstname+" "+this.surname+" is from "+this.city;
	}
}
