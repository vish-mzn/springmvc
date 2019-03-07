package com.hdfc.corebanking.dao.onetomany;

import com.hdfc.corebanking.dao.base.HdfcBaseDao;

public class DepartmentDaoImpl extends HdfcBaseDao {

	public void createDepartment(Department department) {
		try 
		{
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(department);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	public Department getDepartment(int id) 
	{
		Department department = null;
		try 
		{
			em = getEntityManager();
			department = em.find(Department.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
		return department;
	}

}
