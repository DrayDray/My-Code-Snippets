package com.sharon.comparable_and_comparator.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		// I'm creating 4 different employees with different names, IDs, salaries
		Employee employee1 = new Employee("Arik", 1001, 5000);
		Employee employee2 = new Employee("Tal", 1002, 5500);
		Employee employee3 = new Employee("Ben", 1003, 6000);
		Employee employee4 = new Employee("Yossi", 1004, 4000);

		// I'm creating an arrayList with Employees inside of the list
		List<Employee> employeeList = new ArrayList<Employee>();

		// I'm adding the employees into the list
		// **** I'm adding in scrambled order on purpose ****
		employeeList.add(employee1);
		employeeList.add(employee4);
		employeeList.add(employee3);
		employeeList.add(employee2);

		// I'm printing the list before sorting.
		// notice the list is in the order of which I added the employees
		System.out.println("Before sorting the list:");
		for (int i =0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}

		System.out.println("---------------------------------------------------");

		// I'm sorting the list - notice I used sort method from the interface Collections
		// Collections interface is the 'father' of ArrayList so it is possible
		// in the method this time I'm sending the ArrayList which I want to sort
		// and I'm sending the Comparator which I want to use
		Collections.sort(employeeList, EmployeeComparator.EmployeeIdComparator);

		// I'm printing the list after sorting it
		// Notice that I chose an ID comparator so the employees will be sorted by ID
		System.out.println("After sorting the list:");
		for (int i =0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}
		
		System.out.println("---------------------------------------------------");

		// This time I'm sorting the ArrayList again but this time I'm using a
		// different Comparator which is based to salary
		Collections.sort(employeeList, EmployeeComparator.EmployeeSalaryComparator);

		// I'm printing the list after sorting it
		// Notice that I chose a salary comparator so the employees will be sorted by salary
		System.out.println("After sorting the list:");
		for (int i =0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}
	}

}
