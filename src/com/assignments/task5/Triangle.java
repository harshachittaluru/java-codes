package com.assignments.task5;

public class Triangle {
	int side1, side2, side3;

	Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}

	int perimeter() {
		return side1 + side2 + side3;
	}

	double area() {
		double s = perimeter() / 2.0;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println("Perimeter of Triangle: " + triangle.perimeter());
		System.out.println("Area of Triangle: " + triangle.area());
	}
}

