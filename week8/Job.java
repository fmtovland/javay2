//a class to represent an employment record

package com.labs.week8;
import java.lang.IllegalArgumentException;

class Job
{
	//attributes
	private static int nextNumber=1;

	private double salary;
	private String role;
	private int jobID;

	//constructer
	Job(String role, double salary)
	{
		FileProcessor checker=new FileProcessor();

		//manual attributes
		this.salary=salary;
		if(checker.in(role))
			this.role=role;
		else
			throw new IllegalArgumentException("Role not in text file");

		//automatic attributes
		this.jobID=nextNumber;
		nextNumber++;
	}

	//setters and getters
	public void setSalary(double salary)
	{
		this.salary=salary;
	}

	public double getSalary()
	{
		return this.salary;
	}

	public void setRole(String role)
	{
		this.role=role;
	}

	public String getRole()
	{
		return this.role;
	}

	public int getJobID()	//no setter
	{
		return this.jobID;
	}

	//other methods
	public String toString()
	{
		String returnme="";
		returnme=returnme+"role: "+role+"\n";
		returnme=returnme+"Salary: "+salary+"\n";
		returnme=returnme+"JobID: "+jobID;
		return returnme;
	}
}
