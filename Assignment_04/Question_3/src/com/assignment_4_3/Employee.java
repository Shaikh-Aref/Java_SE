package com.assignment_4_3;

public class Employee {
	private String name;
	private int empId;
	private double salary;

	public void displayRecord(String name) {
		this.name = name;
		System.out.println(this.name);
	}

	public void displayRecord(String name, int empId) {
		this.name = name;
		this.empId = empId;
		System.out.println(this.name + "	" + this.empId);
	}

	public void displayRecord(String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		System.out.println(this.name + "	" + this.empId + "	" + this.salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord("Aref");
		emp.displayRecord("Aref", 18);
		emp.displayRecord("Aref", 18, 9700.00);
	}
}
