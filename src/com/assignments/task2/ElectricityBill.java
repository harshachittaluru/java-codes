package com.assignments.task2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of units: ");
        double units = scanner.nextDouble();

        double totalBill = 0;
        
        if (units <= 50) {
            totalBill = units * 0.50;
        } else if (units <= 150) {
            totalBill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            totalBill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            totalBill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        totalBill += totalBill * 0.20;

        System.out.println("Total electricity bill: " + totalBill);

        scanner.close();
    }
}
