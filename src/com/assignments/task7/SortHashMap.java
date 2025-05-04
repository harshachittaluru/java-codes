package com.assignments.task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		Map<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		hashMap.put(10, 12);
		hashMap.put(12, 9);
		hashMap.put(4, 8);
		hashMap.put(8, 18);

		// sort by Key
		Map<Integer, Integer> sortedbyKey = new TreeMap<>(hashMap);

		System.out.println("Sorted by Values:");
		for (int c : sortedbyKey.keySet()) {
			System.out.println(c + "-" + hashMap.get(c));
		}

		// sort by Value
		List<Map.Entry<Integer, Integer>> entrySet = new ArrayList<>(hashMap.entrySet());

		entrySet.sort(Map.Entry.comparingByValue());

		Map<Integer, Integer> sortedByValue = new LinkedHashMap<>();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted by Values:");
		for (int c : sortedByValue.keySet()) {
			System.out.println(c + "-" + hashMap.get(c));
		}

	}

}
