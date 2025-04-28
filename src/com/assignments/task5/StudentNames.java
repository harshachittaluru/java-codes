package com.assignments.task5;

public class StudentNames {
	private String name;

	StudentNames() {
		this.name = "Unknown";
	}

	StudentNames(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Student Name: " + name);
	}

	public static void main(String[] args) {

		StudentNames student1 = new StudentNames();
		StudentNames student2 = new StudentNames("Harsha");

		student1.display();
		student2.display();
	}
}

