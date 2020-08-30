package com.java.interview.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Customer c = new Customer();
		c.id=12;
		c.name="arun";
		
		FileOutputStream fos = new FileOutputStream("customer.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
		
		FileInputStream fis = new FileInputStream("customer.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer ci = (Customer)ois.readObject();
		System.out.println(ci);
	}
}
