package com.assignments.task2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 600000) {
            tax = (income - 250000) * 0.10;
        } else if (income <= 1200000) {
            tax = (600000 - 250000L) * 0.10 + (income - 600000) * 0.18;
        } else {
            tax = (600000 - 250000) * 0.10 + (1200000 - 600000) * 0.18 + (income - 600000) * 0.25;
        }

        System.out.println("Income tax: " + tax);

        scanner.close();
    }
}

