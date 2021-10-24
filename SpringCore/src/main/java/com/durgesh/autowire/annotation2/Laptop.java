package com.durgesh.autowire.annotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop 
{
	private double price;
	private String processer;
	
	
	private Company company;
	
	public Laptop() {
	}

	
	public Laptop(double price, String processer, Company company) {
		System.out.println("Construction injection");
		this.price = price;
		this.processer = processer;
		this.company = company;
	}

	public Company getCompany() {
		
		return company;
	}
	
	@Autowired
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
