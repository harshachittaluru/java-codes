package com.assignments.task6;

public class MaxInArray {
	public static void main(String[] args) {
		int[] numbers = { 12, 45, 2, 89, 33, 67 };

		if (numbers.length == 0) {
			System.out.println("Array is empty.");
			return;
		}

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Maximum value in the array: " + max);
	}
}
