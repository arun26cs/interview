package com.java.interview;

 
//public class Genericclass<T> {
//
//	T obj1;
//	
//	public Genericclass(T obj1) {
//		
//		this.obj1 =obj1;
//		
//	}
//	
//	public T get() {
//		
//		return this.obj1;
//		
//	}
//	
//	public static void  main(String[] args) {
//		Genericclass<Integer> gc = new Genericclass<Integer>(15);
//		//Genericclass<Integer> gc1 = new Genericclass<Integer>("String"); error
//		Genericclass<String> gc1 = new Genericclass<String>("String type");
//		System.out.println(gc.get());
//		System.out.println(gc1.get());
//	}
//}


public interface Genericclass<T,U> {

	T getT();
	U getU();
}
	

