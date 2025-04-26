package com.assignments.task3;

import java.util.Scanner;

public class IsPallindrome {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the text: ");
		String text = scanner.next().toLowerCase();
		
        int left = 0;
        int right = text.length() - 1;
        
        boolean pallindrome = true;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                pallindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if(pallindrome) {
        	System.out.println(text + " is a pallindrome");
        } else {
        	System.out.println(text + " is not a pallindrome");
        }
        scanner.close();

	}

}
