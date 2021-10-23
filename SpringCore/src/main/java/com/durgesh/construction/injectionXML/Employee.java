package com.durgesh.construction.injectionXML;

public class Employee
{
	private String name;
	private String empId;
	public Employee(String name, String empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
}
