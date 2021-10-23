package com.durgesh.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bus
{
	private String name;
	private String price;
	
	public Bus() {
	}

	public Bus(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("I am init mathod");
	}
	
	@PreDestroy
	public void destory()
	{
		System.out.println("I am Destory method");
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
