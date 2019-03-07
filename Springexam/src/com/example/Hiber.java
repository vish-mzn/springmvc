package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

public class Hiber extends AppBaseDao 
{

	public void addemp(Emp emp1) 
	{
		em=getEntityManager();
		em.getTransaction().begin();
		em.persist(emp1);
		em.getTransaction().commit();
		closeEntityManager();
	}

	public List<Emp> getlist() 
	{
		List<Emp> emp=new ArrayList<Emp>();
		em=getEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("from Emp");
		emp=(List<Emp>)query.getResultList();		
		em.getTransaction().commit();
		closeEntityManager();
		return emp;
	}
  
}
