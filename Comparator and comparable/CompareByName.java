package com.accenture.lkm.sortlistdemo;

import java.util.Comparator;

/*
 * Implement comparator and override compare method
 * in order to compare by name
 */
public class CompareByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
