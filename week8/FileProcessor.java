//get valid jobs from the list roles.txt

package com.labs.week8;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FileProcessor
{
	private String[] contents;

	FileProcessor()
	{
		try
		{
			String tmp="";
			File rolesFile=new File("roles.txt");
			Scanner myScanner=new Scanner(rolesFile);
			while(myScanner.hasNextLine())
				tmp=tmp+" "+myScanner.nextLine();

			this.contents=tmp.split("\\s+");
			myScanner.close();
		}

		catch(FileNotFoundException e)
		{
			System.out.println("Something went wrong");
		}
	}

	public String[] getContents()
	{
		return this.contents;
	}

	public boolean in(String checkme)
	{
		int i;
		for(i=0; i<contents.length; i++)
			if(contents[i].equals(checkme))
				return true;

		//basically else
		return false;
	}
}
