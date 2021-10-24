package com.durgesh.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop 
{
	private double price;
	private String processer;
	
	@Autowired
	private Company company;
	
	public Company getCompany() {
		
		return company;
	}
	
	
	public void setCompany(Company company) {
		System.out.println("Setter Injection");
		this.company = company;
	}
	
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", processer=" + processer + ", company=" + company + "]";
	}
	
	
	

}
