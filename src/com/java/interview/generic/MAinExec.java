package com.java.interview.generic;

import java.util.ArrayList;
import java.util.List;

public class MAinExec {

	public static void main(String[] args) {
		Animal a  = new Dog();
		List<Dog> dogs = new ArrayList<>();
		flist(dogs);
		Dog[] ds = {new Dog(),new Dog()};
		flistArray(ds);
		//WIDENING
		int i=0;
		double d = i;
		System.out.println(d);
		i = (int) d;
		System.out.println(i);
		Animal a1 = new Dog();
		
	}

	private static void flistArray(Animal[] ds) {
		//ds[1] = new Lion();
		
	}

	private static void flist(List<? extends Animal> dogs) {
		for(Animal d : dogs) {
			
		}
		
	}
	
	private static void flistSuper(List<? super Animal> dogs) {
		for(Object d : dogs) {
			
		}
		
	}
}
