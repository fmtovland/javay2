//a class to represent an employment record

package com.labs.week8;

class Job
{
	//attributes
	private static int nextNumber=0;

	private double salary;
	private String role;
	private int jobID;

	//constructer
	Job(double salary, String role)
	{
		//manual attributes
		this.salary=salary;
		this.role=role;

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
