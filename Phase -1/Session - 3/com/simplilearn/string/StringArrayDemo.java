package com.simplilearn.string;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		System.out.println("Enter size of array :");
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    String[] array = new String[n];	    

	    for (int i = 0; i < n; i++) {
	    	System.out.println("Please enter User Name :");
	        array[i] = s.next();
	    }

	   
	}
		
	}
	
	


