package com.assignments.task7;

import java.util.Scanner;

public class PermutationsOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.next();

		char[] chars = input.toCharArray();
		permute(chars, 0);
		scanner.close();
	}

	private static void permute(char[] chars, int start) {

		if (start == chars.length - 1) {
			System.out.println(String.valueOf(chars));
			return;
		}

		for (int i = start; i < chars.length; i++) {
			swap(chars, start, i);
			permute(chars, start + 1);
			swap(chars, start, i);
		}
	}

	private static void swap(char[] chars, int i, int j) {
		if (i != j) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
	}

}
