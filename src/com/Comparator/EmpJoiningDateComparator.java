package com.Comparator;

import java.util.Comparator;

import com.bean.TestEmpData;

public class EmpJoiningDateComparator implements Comparator<TestEmpData> {

	public int compare(TestEmpData obj1, TestEmpData obj2) {
		if (null != obj1 && null != obj2) {
			// System.out.println("compare:::"+obj1.getJoiningDate().compareTo(obj2.getJoiningDate()));
			return obj1.getJoiningDate().compareTo(obj2.getJoiningDate());
		}
		return 0;
	}

}
