package com.Employee.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EmployeeController {
@Autowired
EmployeeService es;

@PostMapping(value="/addData")
public String addData(@RequestBody Employee e) {
	return es.addData(e);
}

@PostMapping(value="/addDetails")
public String addDetails(@RequestBody List<Employee> e) {
	return es.addDetails(e);
}

@GetMapping(value="/getDetails")
public List<Employee> getDetails() {
	return es.getDetails();
}

@GetMapping(value="/getEmpDet/{a}")
public Optional<Employee> getEmpDet(@PathVariable int a) {
	return es.getEmpDet(a);
}

@DeleteMapping(value="/delEmp/{b}")
public String delEmp(@PathVariable int b) {
	return es.delEmp(b);
}

@PutMapping(value="updateEmployee/{c}")
public String updateEmployee(@PathVariable int c, @RequestBody Employee e) {    
    return es.updateEmployee(c,e);
}

@GetMapping(value="/getMale")
public List<Employee> getMale() {
	return es.getMale();
}

@GetMapping(value="/getEmpAge") 
public List<Employee> getEmpAge() {
	return es.getEmpAge();
}

@GetMapping(value="/getEmName")
public List<String> getEmName() {
	return es.getEmName();
}

@GetMapping(value="/getEmpName/{a}")
public List<String> getEmpName(@PathVariable int a) {
	return es.getEmpName(a);
}

@GetMapping(value="/getMaxAge") 
public int getMaxAge() {
	return es.getMaxAge(); 
}

@GetMapping(value="/getMinAge") 
public int getMinAge() {
	return es.getMinAge(); 
}

@GetMapping(value="/getSecondMax")
public List<Integer> getSecondMax() {
	return es.getSecondMax();
}

@GetMapping(value="/getSalarDes")
public List<Integer> getSalarDes() {
	return es.getSalarDes();
}

@GetMapping(value="/getEmplDet/{a}/{b}")
public List<Employee> getEmplDet(@PathVariable int a, @PathVariable int b) {
	return es.getEmplDet(a,b);
}

@GetMapping(value="/getEmpNam/{a}")
public List<Employee> getThis(@PathVariable String a) {
	return es.getThis(a);
}

@GetMapping(value="/get1")
public Optional<Employee> get1(){
	return es.get1();
}

@GetMapping(value="/get2")
public Employee get2(){
	return es.get2();
}

@GetMapping(value="/get3")
public Employee get3(){
	return es.get3();
}


}
