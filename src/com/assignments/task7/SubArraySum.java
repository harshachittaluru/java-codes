package com.assignments.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
		int[] nums = { 1, -1, 3, 6, 2, -2, 4, 8, 2, -5 };
		int target = 6;

		Map<Integer, List<Integer>> map = new HashMap<>();

		int currentSum = 0;
		map.put(0, new ArrayList<>(Arrays.asList(-1)));

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];

			if (map.containsKey(currentSum - target)) {
				for (int start : map.get(currentSum - target)) {

					System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(nums, start + 1, i + 1)));
				}
			}

			if (map.containsKey(currentSum)) {
				map.get(currentSum).add(i);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(currentSum, list);
			}
		}

	}
}

