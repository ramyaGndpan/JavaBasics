package com.Comparator;

import java.util.Comparator;

import com.bean.TestEmpData;

public class EmpSalaryComparator implements Comparator<TestEmpData> {
	public int compare(TestEmpData obj1, TestEmpData obj2) {
		if (null != obj1 && null != obj2) {
			return Double.valueOf(obj1.getSalary()).compareTo(Double.valueOf(obj2.getSalary()));
		}
		return 0;
	}
}