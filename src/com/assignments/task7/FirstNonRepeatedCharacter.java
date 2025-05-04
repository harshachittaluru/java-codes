package com.assignments.task7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// This can be done, if need to do.
		input = input.toLowerCase();

		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

		for (char ch : input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First Non-repeated Char: " + entry.getKey());
				break;
			}
		}

		scanner.close();

	}

}
