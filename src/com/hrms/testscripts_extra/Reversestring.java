package com.hrms.testscripts_extra;

import java.util.Scanner;

public class Reversestring {
	public static void main (String[]args)
	{
		String results="";
		System.out.println("Enter a string"); // Selenium
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char  ch[] = str.toCharArray();
		for(int i=ch.length-1; i>0; i--) //87
		{
			results += ch[i];  //
		}
		System.out.println("Reverse string is: "+ "Enter");
	
	
	
	}

}
