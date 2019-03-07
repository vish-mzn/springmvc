package com.hdfc.corebanking.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hdfc.corebanking.model.Employee;

public class EmployeeDao 
{
	/* EntityManagerFactory */
	EntityManagerFactory emf = null;

	/* EntityManager */
	EntityManager em = null;

	Employee employee = new Employee();

	EntityManager getEntityManager() 
	{
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("persistence");
		}

		if (em == null) {
			em = emf.createEntityManager();
		}
		return em;
	}

	public void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}
	}

	void closeEntityManager() {
		if (em != null) {
			em.close();
		}
	}
	
	public void create(String[] args) {
		try {
			/* Create and populate Entity */
			Employee employee = new Employee();
			employee.setFirstname("erte");
			employee.setLastname("ete");
			employee.setEmail("someMail@gmail.com");
			employee.setIdEmployee(1);

			/* Persist entity */
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}	

	public void getEmployee() {
		try {
			/* Retrieve entity */
			em = getEntityManager();
			employee = em.find(Employee.class, 1);
			System.out.println(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(String[] args) {
		try {
			/* Update entity */
			em = getEntityManager();
			em.getTransaction().begin();
			employee.setFirstname("Pranil");
			System.out.println("Employee after updation :- " + employee);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(String[] args) {
		try {
			/* Remove entity */
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}