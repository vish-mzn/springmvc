package com.hdfc.corebanking.test;

import java.util.ArrayList;
import java.util.List;

import com.hdfc.corebanking.dao.onetomany.Department;
import com.hdfc.corebanking.dao.onetomany.DepartmentDaoImpl;
import com.hdfc.corebanking.dao.onetomany.Professor;

public class DepartmentDaoImplCientTest {

	DepartmentDaoImpl departmentDaoImpl = new DepartmentDaoImpl();

	public static void main(String[] args) 
	{
		try 
		{
			DepartmentDaoImplCientTest departmentCientTest = new DepartmentDaoImplCientTest();
			departmentCientTest.createDepartment();
			// departmentCientTest.getDepartment();
			// departmentCient.updateDepartment();
			// employeeDaoTest.deleteEmployee();
			// employeeDaoTest.listEmployee();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void createDepartment() {
		try 
		{
			Department department = new Department();
			department.setName("Mechanical");
			department.setCode("mech");

			List<Professor> listProfessor = new ArrayList<Professor>();

			Professor professor = new Professor();
			professor.setName("pm2");
			professor.setSalary(242);
			professor.setDepartment(department);
			listProfessor.add(professor);

			Professor professor1 = new Professor();
			professor1.setName("pm1");
			professor1.setSalary(7548);
			professor1.setDepartment(department);
			listProfessor.add(professor1);

			department.setListProfessor(listProfessor);

			departmentDaoImpl.createDepartment(department);
			
			/*System.out.println(professor);
			System.out.println(professor1);*/
			System.out.println(department);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			departmentDaoImpl.closeEntityManagerFactory();
		}

	}

	void getDepartment() {
		try 
		{
			//System.out.println();
			Department department = departmentDaoImpl.getDepartment(34);
			System.out.println("Professor count..." + department.getListProfessor().size());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			departmentDaoImpl.closeEntityManagerFactory();
		}
	}
}
