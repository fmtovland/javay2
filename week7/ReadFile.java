//read string from file
package com.labs.week7;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


class ReadFile
{
	public String content;

	ReadFile() throws FileNotFoundException
	{
		try
		{
			File file1=new File("textvalues.txt");
			Scanner scan1= new Scanner(file1);
			content=scan1.nextLine();
			scan1.close();
		}

		catch(FileNotFoundException e)
		{
			System.out.println("You broke it");
		}
	}
}
