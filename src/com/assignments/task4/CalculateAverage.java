package com.assignments.task4;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 20, 30, 40 };

		int sum = 0;

		for (int arr : array) {
			sum += arr;
		}

		System.out.println("Average using Array: " + sum / array.length);

	}

}
