//a class to represent an employee

package com.labs.week8;

class Employee extends Person
{
	//attributes
	private static int nextNumber=1;

	private Job job;
	private int personelNumber;
	private Date startDate;

	//constructor
	Employee(String firstName,String surName,Date dateOfBirth,String gender,Job job,Date startDate)
	{
		//manual attributes
		super(firstName,surName,dateOfBirth,gender);
		this.job=job;
		this.startDate=startDate;

		//automatic attributes
		this.personelNumber=nextNumber;
		nextNumber++;
	}

	//setters and getters
	public void setJob(Job job)
	{
		this.job=job;
	}

	public Job getJob()
	{
		return this.job;
	}

	public int getPersonelNumber()	//no setter
	{
		return this.personelNumber;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate=startDate;
	}

	public Date getStartDate()
	{
		return this.startDate;
	}

	public String toString()
	{
		String returnme=super.toString()+"\n";
		returnme=returnme+"Job: "+job.toString()+"\n";
		returnme=returnme+"Personel Number: "+personelNumber+"\n";
		returnme=returnme+"Date started: "+startDate+"\n";
		return returnme;
	}
}
