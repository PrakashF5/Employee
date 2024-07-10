package com.Employee.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.Employee.Entity.Employee;
import com.Employee.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;

public String addData(Employee e) {
	 er.save(e);
	 return "Employee details added successfully";
}

public String addDetails(List<Employee> e) {
	er.saveAll(e);
	return "Details added successfully";
}

public List<Employee> getDetails() {
	return er.findAll();
}

public Optional<Employee> getEmpDet(int a) {
	return er.findById(a);
}

public String delEmp(int b) {
	 er.deleteById(b);
	 return "Employee detail deleted";
}

public String updateEmployee(int c, Employee e) {    
     er.save(e);
     return "Employee detail updated";    
}

public List<Employee> getThis(String a) {
	return er.getThis(a);
}
	
}
