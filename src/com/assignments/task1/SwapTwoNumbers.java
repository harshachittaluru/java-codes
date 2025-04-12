package com.assignments.task1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int second = scanner.nextInt();
        
        int temp;
        
        System.out.println("********** Using Third Variable ************");
        System.out.println();
        
        System.out.printf("Numbers before Swap- First: %d and Second: %d\n", first, second);
        //Using third Variable
        temp = first;
        first = second;
        second = temp;
        
        System.out.printf("Numbers after Swap- First: %d and Second: %d\n\n", first, second);
        
        System.out.println("********** Without Third Variable ************");
        
        System.out.println();
        
        System.out.printf("Numbers before Swap- First: %d and Second: %d\n", first, second);
        //Using third Variable
        first = first+second;
        second = first-second;
        first = first-second;
        
        System.out.printf("Numbers after Swap- First: %d and Second: %d\n\n", first, second);

	}

}
