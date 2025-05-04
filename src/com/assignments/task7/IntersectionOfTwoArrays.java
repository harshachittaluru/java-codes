package com.assignments.task7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array - 1: ");
		int n = scanner.nextInt();

		int[] arr1 = new int[n];
		System.out.print("Enter the " + n + " values to the Array - 1: ");

		for (int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.print("Enter the size of the array - 2: ");
		int m = scanner.nextInt();

		int[] arr2 = new int[m];
		System.out.print("Enter the " + m + " values to the Array - 2: ");

		for (int i = 0; i < m; i++) {
			arr2[i] = scanner.nextInt();
		}

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> result = new LinkedHashSet<>();

		for (int num : arr1) {
			set1.add(num);
		}

		for (int num : arr2) {
			if (set1.contains(num)) {
				result.add(num); // maintains insertion order
			}
		}

		System.out.println("Intersection: " + result);

		scanner.close();

	}

}
