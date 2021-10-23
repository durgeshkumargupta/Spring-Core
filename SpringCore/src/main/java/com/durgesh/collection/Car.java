package com.durgesh.collection;

import java.util.List;

public class Car
{
	private List carName;
	private List price;
	
	
	public List getCarName() {
		return carName;
	}
	public void setCarName(List carName) {
		this.carName = carName;
	}
	public List getPrice() {
		return price;
	}
	public void setPrice(List price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Car [carName=" + carName + " \nprice=" + price + "]";
	}
	

}
