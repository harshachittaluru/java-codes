package com.assignments.task5;

public class Employee {
	private String name;
	private int yearOfJoining;
	private String address;

	Employee(String name, int yearOfJoining, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}

	void display() {
		System.out.printf("%-10s %-15d %s\n", name, yearOfJoining, address);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Robert", 1994, "64C- Walls Street");
		Employee emp2 = new Employee("Sam", 2000, "68D- Walls Street");
		Employee emp3 = new Employee("John", 1999, "26B- Walls Street");

		System.out.printf("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");

		emp1.display();
		emp2.display();
		emp3.display();
	}
}

