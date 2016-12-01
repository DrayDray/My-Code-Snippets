package com.sharon.comparable_and_comparator.comparator;
import java.util.Comparator;

// I'm creating a new class which I'll use to compare between Employees in many different ways
// **** NOTICE THAT WHEN I'M USING COMPARATOR I CAN COMPARE IN MANY DIFFERENT WAYS UNLIKE 
// COMPARABLE WHICH ALLOWED ME ONLY 1 WAY TO COMPARE ****
public class EmployeeComparator{

	// I'm creating Comparator and giving it a name to compare by ID - notice that inside
	// the <> I'm putting the type of object I wish to compare
	// then I'm overriding the 'compare' method to compare the employees by ID
	public static Comparator<Employee> EmployeeIdComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getId() < employee2.getId()) {
				return -1;
			}

			if (employee1.getId() > employee2.getId()) {
				return 1;
			}

			return 0;
		}
	};

	
	// here I'm doing the very same thing only this time I'm comparing the employees by salary
	// in this way I can compare the employees by 2 different ways
	// 1. by ID
	// 2. by salary
	// when I'll sort the List/Set/Map of employees I will be able to choose in what manner
	// I want to sort them by
	public static Comparator<Employee> EmployeeSalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getSalary() < employee2.getSalary()) {
				return -1;
			}

			if (employee1.getSalary() > employee2.getSalary()) {
				return 1;
			}

			return 0;
		}
	};
}
