package com.assignments.task1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int radius = scanner.nextInt();
        

        System.out.printf("Sum: %f", 3.14*radius*radius);

        scanner.close();

	}

}
