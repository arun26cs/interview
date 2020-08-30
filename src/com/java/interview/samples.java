package com.java.interview;

import java.util.HashMap;
import java.util.Hashtable;

public class samples  {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1==str2) {
			System.out.println("str1==str2");
		}else {
			System.out.println ("str1!=str2");
		}
		
		
	HashMap<Integer, String> student = new HashMap<Integer, String>();
	student.put(1, "arun");
	student.put(1, "arun");
	student.put(1, "arun");
	student.put(null,"arun");
	student.put(null,"kiran");
	System.out.println(student);
	
	Hashtable<Integer, String> stud = new Hashtable<Integer, String>();
	stud.put(1, "arun");
	stud.put(1, "arun");
	stud.put(1, "arun");
//	stud.put(null,"arun");//runtime exception
//	stud.put(null,"kiran");
	System.out.println(stud);
	
	
	//runtime poly
	college c = new MCIT();
	c.collegename();
	
	c=new Conc();
	c.collegename();
	
	College ci = new mcgill();
	ci.getCollegeName();
	ci.implCollegeName();
	}
}

abstract class college{
	abstract void collegename();
}
class MCIT extends college{

	@Override
	void collegename() {
		System.out.println("MCIT");
		
	}
	
}

class Conc extends college{

	@Override
	void collegename() {
		System.out.println("Conc");
		
	}
	
}


class mcgill implements College{
	@Override
	public void getCollegeName() {
		System.out.println("mcgill");
	}

	@Override
	public void implCollegeName() {
		System.out.println("mcgill impl");
		
	}
}
