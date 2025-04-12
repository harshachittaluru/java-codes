package com.assignments.task1;

import java.util.Scanner;

public class PrintNameByCustomInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Your Name: "+ name);
		sc.close();
	}

}
