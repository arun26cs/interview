package com.java.interview.serialize;

import java.io.Serializable;

public class Customer implements Serializable {

	int id;
	transient String name;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
