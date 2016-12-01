package com.sharon.comparable_and_comparator.comparator;

public class Employee {
	
	// I'm adding variables to the class Employee
	private String name;
	private long id;
	private float salary;
	
	// I'm adding constructor to create new Employee - the constructor will receive 3 variables and will add them
	// into the class variables.
	public Employee(String name, long id, float salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// I'm adding getters and setters to all the class variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// Overriding the 'toString' method in order to print the Employees
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}	
}
