package com.java.interview.Thread;

public class RacerDemo{
	public static void main(String[] args) {
		Racer r = new Racer();
		Thread t1 = new Thread(r, "r1");
		Thread t2 = new Thread(r, "r2");
		Thread t3 = new Thread(r, "r3");
		Thread t4 = new Thread(r, "r4");
		Thread t5 = new Thread(r, "r4");
		Thread t6 = new Thread(r, "r5");
		Thread t7 = new Thread(r, "r6");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		 

	}
}
