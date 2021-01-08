package com.accenture.lkm.sortlistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDatabaseMain {

	public static void main(String[] args) {
		Employee one = new Employee(1001, "Martin", 1200, 2);
		Employee two = new Employee(1002, "Linda", 1400, 3);
		Employee three = new Employee(1002, "Celina", 3000, 4);
		Employee four = new Employee(1004, "Janet", 1600, 3);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(three);
		empList.add(one);
		empList.add(four);
		empList.add(two);

		EmployeeDatabase db = new EmployeeDatabase();
		
		System.out.println("Sorted by id");
		db.displayEmployeeDetailsSortedById(empList);
		
		System.out.println("Sorted by salary");
		ArrayList<Employee> sorted = db.displayEmployeeDetailsSortedBySalary(empList);
		Iterator<Employee> empIt = sorted.iterator();
		while (empIt.hasNext()) {
			Employee emp = empIt.next();
			System.out.println(emp);
		}

		System.out.println("Sorted by Employee name");
		ArrayList<Employee> sortedName=db.displayEmployeeDetailsSortedByName(empList);
		for(Employee emp: sortedName) {
			System.out.println(emp);
		}
		
		System.out.println("Sorted by years of Experience");
		ArrayList<Employee> sortedExperience=db.displayEmployeeDetailsSortedByExperience(empList);
		for(Employee emp: sortedExperience) {
			System.out.println(emp);
		}

	}

}
