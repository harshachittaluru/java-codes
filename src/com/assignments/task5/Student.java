package com.assignments.task5;

public class Student {
	private String name;
	private int enrollmentNo;

	Student() {
		name = "Amay";
		enrollmentNo = 132;
	}

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Enrollment Number: " + enrollmentNo);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.displayDetails();
	}
}

