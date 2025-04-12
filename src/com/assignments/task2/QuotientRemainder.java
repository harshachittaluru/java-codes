package com.assignments.task2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int denominator = scanner.nextInt();

        int quotient = numerator / denominator;
        int remainder = numerator % denominator;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}

