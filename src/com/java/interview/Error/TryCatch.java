package com.java.interview.Error;

import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) {
		int n=7;
		int d = 0;
		try {
			int k = n/d;
			System.out.println("Divided");
		} 
		finally {
			System.out.println("Atlast");
		}
		
	}
}
