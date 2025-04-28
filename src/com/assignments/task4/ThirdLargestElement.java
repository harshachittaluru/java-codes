package com.assignments.task4;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array atleast 3: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter the " + n + " values to the Array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}
		}

		System.out.println("The third largest element is: " + third);

		scanner.close();
	}
}

