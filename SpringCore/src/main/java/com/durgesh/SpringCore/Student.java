package com.durgesh.SpringCore;

public class Student 
{
	private String name;
	private String usn;
	private String address;
	
	
	public Student() {
		super();
	}
	public Student(String name, String usn, String address) {
		super();
		this.name = name;
		this.usn = usn;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", address=" + address + "]";
	}
	
	

}
