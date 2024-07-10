package com.Employee.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;

public String addData(Employee e) {
	return ed.addData(e);
}
public String addDetails(List<Employee> e) {
	return ed.addDetails(e);
}

public List<Employee> getDetails() {
	return ed.getDetails();
}

public Optional<Employee> getEmpDet(int a) {
	return ed.getEmpDet(a);
}

public String delEmp(int b) {
	return ed.delEmp(b);
}

public String updateEmployee(int c, Employee e) {    
    return ed.updateEmployee(c,e);
}

public List<Employee> getMale() {
	List<Employee> x = ed.getDetails();
	List<Employee> mlist = x.stream().filter(d->d.getGender().equals("Male")).collect(Collectors.toList());
	return mlist;
}

public List<Employee> getEmpAge() {
	List<Employee> y = ed.getDetails();
	List<Employee> aglist = y.stream().filter(f->f.getAge()>27).collect(Collectors.toList());
	return aglist;
}

public List<String> getEmName() {
	List<Employee> x = ed.getDetails();
	List<String> idnam = x.stream().map(g->g.getName()).collect(Collectors.toList());
	return idnam;
}

public List<String> getEmpName(int a) {
	List<Employee> x = ed.getDetails();
	List<String> idnam = x.stream().filter(b->b.getId()==a).map(g->g.getName()).collect(Collectors.toList());
	return idnam;
}

public int getMaxAge() {
List<Employee> em = ed.getDetails();
int max = em.stream().map(a->a.getAge()).max(Comparable::compareTo).get();
return max;
}

public int getMinAge() {
List<Employee> em = ed.getDetails();
int min = em.stream().map(a->a.getAge()).min(Comparable::compareTo).get();
return min;
}

//int[] nums = {20,45,30,75,50,60,25,15,80,90,10};
public List<Integer> getSecondMax() {
List<Employee> em = ed.getDetails();
List<Integer> secondMax = em.stream().map(u->u.getAge()).sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).collect(Collectors.toList());
return secondMax;
}

public List<Integer> getSalarDes() {
List<Employee> em = ed.getDetails();
List<Integer> saldes = em.stream().map(u->u.getSalary()).sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
return saldes;
}

public List<Employee> getEmplDet(int a, int b) {
List<Employee> em = ed.getDetails();
List<Employee>	s = em.stream().filter(c->c.getAge()>a && c.getAge()<b).collect(Collectors.toList());
return s;
}  
	
public List<Employee> getThis(String a) {
	return ed.getThis(a);
}

public Optional<Employee> get1(){
	List<Employee> a = ed.getDetails();
    Optional<Employee> b = a.stream().filter(c-> c.getSalary()>35000).sorted(Comparator.comparing(Employee::getAge).reversed()).
    		           sorted(Comparator.comparing(Employee::getName).reversed()).findFirst();
    return b;  
}

public Employee get2(){
   List<Employee> a = ed.getDetails();
 Employee b = a.stream().filter(e -> e.getSalary() > 35000).sorted(Comparator.comparing(Employee::getName).reversed()
                      .thenComparing(Employee::getAge).reversed()).findFirst().get();
return b;
}

public Employee get3(){
	List<Employee> a = ed.getDetails();
	Employee b = a.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
	int c = b.getSalary()+b.getSalary()*(5/100);
	b.setSalary(c);
	return b;
 }

}
