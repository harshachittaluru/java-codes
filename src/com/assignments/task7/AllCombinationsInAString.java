package com.assignments.task7;

import java.util.Scanner;

public class AllCombinationsInAString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		generateCombinations("", input);

		scanner.close();
	}

	public static void generateCombinations(String prefix, String remaining) {
		if (remaining.length() == 0) {
			if (!prefix.isEmpty()) {
				System.out.println(prefix);
			}
			return;
		}

		generateCombinations(prefix + remaining.charAt(0), remaining.substring(1));

		generateCombinations(prefix, remaining.substring(1));
	}


}
