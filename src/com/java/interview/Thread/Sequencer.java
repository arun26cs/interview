package com.java.interview.Thread;

public class Sequencer implements Runnable {

	int next=1;
	int finalval=0;
	public Sequencer(int i) {
		this.finalval=i;
	}
	@Override
	public synchronized void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			if(Integer.parseInt(Thread.currentThread().getName())==next) {
				next+=1;
				System.out.println(Thread.currentThread().getName()+" "+next+" "+finalval);
				if(Integer.parseInt(Thread.currentThread().getName())==finalval) {
					break;
				}
				notifyAll();
			}else {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	}

}
