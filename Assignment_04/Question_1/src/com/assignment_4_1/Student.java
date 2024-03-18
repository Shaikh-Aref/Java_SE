package com.assignment_4_1;

import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private int age;

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student name: ");
		this.name = scanner.nextLine();

		System.out.print("Enter student ID: ");
		this.id = scanner.nextInt();

		System.out.print("Enter student age: ");
		this.age = scanner.nextInt();

		// Close the scanner
		scanner.close();
	}

	public void printRecord() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		// Creating an instance of Student
		Student student = new Student();

		// Accepting student record
		student.acceptRecord();

		// Printing student record
		student.printRecord();
	}
}
