package com.assignments.task3;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of even numbers to sum: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 2;

        int count = 0;
        while (count < n) {
            sum += i;
            i += 2; 
            count++;
        }

        System.out.println("The sum of the first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}

