package com.assignments.task2;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("It's Over");
                break;
                
            } else {
                System.out.println("Good Going");
                continue;
            }
        }

        scanner.close();
    }
}

