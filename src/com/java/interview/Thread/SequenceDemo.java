package com.java.interview.Thread;

public class SequenceDemo {

	public static void main(String[] args) {
		Sequencer sr = new Sequencer(3);
		Thread t1 = new Thread(sr, "1");
		Thread t2 = new Thread(sr, "2");
		Thread t3 = new Thread(sr, "3");
		t3.start();
		t2.start();
		t1.start();
	}
}
