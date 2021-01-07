package com.accenture.lkm.sortlistdemo;

import java.util.Comparator;

//import org.graalvm.compiler.core.common.cfg.AbstractBlockBase.BlockIdComparator;

/*
 * Implement comparator and override compare method
 * in order to compare by experience
 */
public class CompareByExperience implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getYearsOfExperience() > o2.getYearsOfExperience()) {
			return 1;
		}
		else if(o1.getYearsOfExperience() < o2.getYearsOfExperience()) {
			return -1;
		}
		else
			return 0;
	}

}
