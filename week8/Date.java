//a class to represent a date

package com.labs.week8;

class Date
{
	//attributes
	private int day;
	private int month;
	private int year;

	//constructer
	Date(int day, int month, int year)
	{
		if(day>0 && day<=31)	//ensure valid day
			this.day=day;
		if(month>0 && month<=12)	//ensure valid month
			this.month=month;

		this.year=year;
	}

	//setgets
	public void setDay(int day)
	{
		if(day>0 && day<=31)
			this.day=day;
	}

	public int getDay()
	{
		return this.day;
	}

	public void setMonth(int month)
	{
		if(month>0 && month<=12)
			this.month=month;
	}

	public int getMonth()
	{
		return this.month;
	}

	public void setYear(int year)
	{
		this.year=year;
	}

	public int getYear()
	{
		return this.year;
	}

	//other methods
	public String toString()
	{
		return day+"-"+month+"-"+year;
	}
}
