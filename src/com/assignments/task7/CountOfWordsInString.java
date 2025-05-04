package com.assignments.task7;

import java.util.Scanner;

public class CountOfWordsInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String[] inputWords = input.split(" ");

		System.out.println("Number of Words in String: " + inputWords.length);

		scanner.close();

	}

}
