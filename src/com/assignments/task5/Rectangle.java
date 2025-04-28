package com.assignments.task5;

public class Rectangle {
	private int length;
	private int breadth;

	Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Rectangle(int side) {
		this.length = side;
		this.breadth = side;
	}

	int calculateArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5);
		Rectangle rect3 = new Rectangle(4, 6);

		System.out.println("Area of rectangle with no parameters: " + rect1.calculateArea());
		System.out.println("Area of rectangle with one parameter: " + rect2.calculateArea());
		System.out.println("Area of rectangle with two parameters: " + rect3.calculateArea());
	}
}

