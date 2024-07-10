package com.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
@Query(value="select * from emp where name like ?", nativeQuery=true)
	public List<Employee> getThis(String a);
	
}
