package com.assignments.task7;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrencesInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		Map<Character, Integer> hashMap = new TreeMap<>();

		for (char s : input.toCharArray()) {
			if (hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s) + 1);
			}
			else {
				hashMap.put(s, 1);
			}
		}

		for (char c : hashMap.keySet()) {
			System.out.println(c + "-" + hashMap.get(c));
		}
		scanner.close();

	}

}
