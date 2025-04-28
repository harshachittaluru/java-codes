package com.assignments.task4;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4, 6, 7 };
		int target = 9;

		Map<Integer, Integer> hash = new HashMap<>();
		int rem = 0, first = 0, second = 0;
		for (int i = 0; i < array.length; i++) {
			rem = target - array[i];

			if (hash.containsKey(rem)) {
				first = rem;
				second = array[i];
			}
			hash.put(array[i], i);
		}
		if (first == 0 && second == 0) {
			System.out.println("No Pair");
		} else {
			System.out.println(first + " " + second);
		}
	}

}
