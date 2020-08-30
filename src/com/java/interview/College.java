package com.java.interview;

public interface College {
	

	public default void getCollegeName() {
		System.out.println("cannot eturen any");
	}
	
	public void implCollegeName();
}
