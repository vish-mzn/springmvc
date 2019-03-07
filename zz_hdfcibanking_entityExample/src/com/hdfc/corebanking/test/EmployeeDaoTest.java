package com.hdfc.corebanking.test;

import com.hdfc.corebanking.dao.EmployeeDao;

public class EmployeeDaoTest {

	public static void main(String[] args) {
		EmployeeDao employeeDao = null;

		// TODO Auto-generated method stub
		try {
			employeeDao = new EmployeeDao();
			employeeDao.create(args);
		} catch (Exception e) {

		} finally {
			employeeDao.closeEntityManagerFactory();
		}
	}

}
