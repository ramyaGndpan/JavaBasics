package com.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

import com.Comparator.EmpJoiningDateComparator;
import com.Comparator.EmpSalaryComparator;
import com.bean.TestEmpData;


public class TestComparator {

	// public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static Logger log = Logger.getLogger(Logger.class.getName());
	

	public static ArrayList<TestEmpData> loadData() {
		ArrayList<TestEmpData> arrEmpData = new ArrayList<TestEmpData>();
		arrEmpData.add(setData(new String[] { "12", "abc", "2", "40000", "2022-08-02" }));
		arrEmpData.add(setData(new String[] { "23", "def", "1", "80000", "2021-05-05" }));
		arrEmpData.add(setData(new String[] { "34", "ghj", "4", "50000", "2023-04-03" }));
		return arrEmpData;
	}

	private static TestEmpData setData(String[] arr) {
		TestEmpData t = new TestEmpData();
		t.setEmpId(arr[0]);
		t.setEmpName(arr[1]);
		t.setDeptId(arr[2]);
		t.setSalary(Double.valueOf(arr[3]));
		// t.setJoiningDate(String.valueOf(arr[4])); // when date field type was string
		// t.setJoiningDate(sdf.parse(arr[4])); // using simpledateformat to convert string to date type
		t.setJoiningDate(Date.valueOf(arr[4]));
		return t;
	}

	private static void displayList(ArrayList<TestEmpData> arrEmpData, String message) {
		//System.out.println(message);
		log.info(message);
		for (TestEmpData t : arrEmpData) {
			//System.out.println(t);
			log.info(t.toString());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("Logger class name:::********"+Logger.class.getName());
		ArrayList<TestEmpData> arrEmpData = loadData();
		displayList(arrEmpData,"before sorting:::::::arrEmpData:::");

		Collections.sort(arrEmpData, new EmpJoiningDateComparator());
		displayList(arrEmpData,"after sorting:::natural order::::EmpJoiningDateComparator:::");

		Collections.sort(arrEmpData, new EmpJoiningDateComparator().reversed());
		displayList(arrEmpData,"after sorting::reversed:::::EmpJoiningDateComparator:::");
		
		Collections.sort(arrEmpData, new EmpSalaryComparator());
		displayList(arrEmpData,"after sorting:::::::EmpSalaryComparator:::");
	}

}
