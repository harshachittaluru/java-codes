package com.assignments.task4;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Size of Array: ");
		int n = scanner.nextInt();

		int array[] = new int[n];
		System.out.print("Enter the " + n + " values to the Array: ");

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the Target element to search in Array: ");
		int target = scanner.nextInt();

		boolean found = false;
		int low = 0, high = n - 1, mid;

		Arrays.sort(array);

		while (low <= high) {
			mid = (low + high) / 2;

			if (array[mid] == target) {
				found = true;
				break;
			}

			else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (found)
			System.out.println("Target Found successfully");
		else
			System.out.println("Target Not found!!!");

		scanner.close();
	}

}
