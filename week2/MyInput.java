/*
Class description: Get input from the user.
Author: Liam McCormick
Date: 1-2-18
OS: Arch
Kernel: 4.14.15-1-ARCH
Java version: 1.8.0_162
*/

package com.labs.week2;
import java.util.Scanner;

class MyInput
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Animal peter = new Animal("Peter");

		System.out.print("What Species is Peter? ");
		peter.setBreed(input.nextLine());

		System.out.println(peter);
	}
}
