package com.sharon.comparable_and_comparator.comparable;
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
		Collections.sort(employeeList);
		
		// I'm printing the list after sorting it
		// notice I choose to sort by the ID number in the compareTo method in Employee class
		// If we are to delete the compareTo method we will get an exception because java
		// will NOT know by what to sort the list
		System.out.println("After sorting the list:");
		for (int i =0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
		}
	}

}
