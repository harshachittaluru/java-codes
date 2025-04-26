package com.assignments.task3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		int fact = 1;
		
		while (n>0) {
			fact = fact * n;
			n=n-1;
		}
		System.out.print("Factorial: "+fact);
		scanner.close();
		
	}

}
