package com.assignments.task7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HasUniqueCharacters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// This can be done, if need to do.
		input = input.toLowerCase();

		char[] charArray = input.toCharArray();

        Set<String> stringSet = new HashSet<>();
        for (char c : charArray) {
            stringSet.add(String.valueOf(c));
        }

		System.out.println("Has Unique Characters: " + (stringSet.size() == input.length()));

		scanner.close();

	}

}
