package com.hrms.testscripts_extra;

import java.util.Scanner;

public class Swap_2numbers {
	public static void main (String[]args) {
		int x, y, t; //x and y are to swap
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping number: "+x +"  "+ y);
		
		t = x;
		x = y;
		y = t;
		System.out.println("After swapping:  "+x +"   "+ y);
		System.out.println();
		
	}

}
