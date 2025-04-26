package com.assignments.task3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of fibonacci needed: ");
		int n = scanner.nextInt();
		
		int a = 0, b = 1;
		
		for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
		
		scanner.close();

	}

}
