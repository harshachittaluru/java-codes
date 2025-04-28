package com.assignments.task4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 2, 2, 3, 3, 4, 4, 11, 11, 11, 11 };

		int duplicate = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				array[duplicate++] = array[i];
			}
		}

		for (int i = duplicate; i < array.length; i++) {
			array[i] = 0;
		}
	}

}
