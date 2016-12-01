package com.sharon.comparable_and_comparator.comparable;


// I'm creating a class and implementing the interface Comparable - inside the <> I'm writing what type of object
// we are comparing!!!
public class Employee implements Comparable<Employee>{
	
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

	// Overriding the compareTo method - without it we would get an error because we implemented an interface
	// Comparable. in this method I decide how to compare each Employee.. in my example I chose ID
	// **** DO NOTICE WE CAN ONLY OVERRIDE THIS METHOD ONCE SO WE CAN ONLY COMPARE BY 1 VARIABLE ONLY
	// IF WE WISH TO COMPARE BY MANY DIFFERENT WAYS WE WILL NOT!!! USE COMPARABLE ****
	@Override
	public int compareTo(Employee employee) {
		//int compareTo(T o)
		//Compares this object with the specified object for order. 
		//Returns a negative integer this object is less than the specified object.
		//Returns a zero as this object is equal to the specified object.
		//Returns a  positive integer as this object is greater than the specified object.

		if (this.id < employee.id) {
			return -1;
		}
		
		if (this.id > employee.id) {
			return 1;
		}
		
		return 0;
	}
}
