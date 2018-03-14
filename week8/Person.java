//a class to represent a person

package com.labs.week8;

class Person
{
	//attributes
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String gender;

	//constructer
	Person(String firstName,String surName,Date dateOfBirth,String gender)
	{
		this.firstName=firstName;
		this.surName=surName;
		this.dateOfBirth=dateOfBirth;
		this.gender=gender;
	}


	//setters and getters
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setSurName(String surName)
	{
		this.surName=surName;
	}

	public String getSurName()
	{
		return this.surName;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}

	public Date getDateOfBirth()
	{
		return this.dateOfBirth;
	}

	public void setGender(String gender)
	{
		this.gender=gender;
	}

	public String getGender()
	{
		return this.gender;
	}

}
