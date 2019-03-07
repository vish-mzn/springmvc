package com.hdfc.corebanking.dao.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Profess")
public class Professor 
{
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String name;
    private long salary;
    
    @ManyToOne
    private Department department;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

    
}