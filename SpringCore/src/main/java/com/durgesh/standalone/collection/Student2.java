package com.durgesh.standalone.collection;

import java.util.List;

public class Student2
{
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [friends=" + friends + "]";
	}
	

}
