package com.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmpData implements Comparable {

		private String empId;
		private String empName;
		private double salary;
		private String deptId;
		private Date joiningDate;
		/**
		 * @return the empId
		 */
		public String getEmpId() {
			return empId;
		}
		/**
		 * @param empId the empId to set
		 */
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		/**
		 * @return the empName
		 */
		public String getEmpName() {
			return empName;
		}
		/**
		 * @param empName the empName to set
		 */
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(double salary) {
			this.salary = salary;
		}
		/**
		 * @return the deptId
		 */
		public String getDeptId() {
			return deptId;
		}
		/**
		 * @param deptId the deptId to set
		 */
		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}
		/**
		 * @return the joiningDate
		 */
		public Date getJoiningDate() {
			return joiningDate;
		}
		/**
		 * @param joiningDate the joiningDate to set
		 */
		public void setJoiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
		}
		
		@Override
		public String toString() {
			return "TestEmpData [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptId=" + deptId
					+ ", joiningDate=" + joiningDate + "]";
		}
		
		
		@Override
		public int compareTo(Object obj2) {
			/*
			 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); if(null!=obj2) {
			 * try { Date date1 = sdf.parse(this.getJoiningDate()); Date date2 =
			 * sdf.parse(((TestEmpData)obj2).getJoiningDate());
			 * System.out.println("date1:::+"+date1+" date2::"+date2); return
			 * date1.compareTo(date2); } catch(java.text.ParseException pex) {
			 * System.out.println("Parse Exception occured:::"+pex.getStackTrace()); }
			 * 
			 * } return 0;
			 */	
			if (null != obj2) {
				// System.out.println("compare:::"+obj1.getJoiningDate().compareTo(obj2.getJoiningDate()));
				return this.getJoiningDate().compareTo(((TestEmpData)obj2).getJoiningDate());
			}
			return -1;
		}
}
