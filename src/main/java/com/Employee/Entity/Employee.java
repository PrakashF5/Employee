package com.Employee.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="Emp")
@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;
private String name;
private int salary;
private String gender;
private int age;
private boolean isRotationalShift;

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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isRotationalShift() {
	return isRotationalShift;
}
public void setisRotationalShift(boolean isRotationalShift) {
	this.isRotationalShift = isRotationalShift;
}



}
