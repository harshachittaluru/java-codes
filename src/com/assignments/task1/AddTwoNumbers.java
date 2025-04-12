package com.assignments.task1;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int second = scanner.nextInt();
        
        System.out.printf("Sum: %d", first+second);

        scanner.close();
	}

}
