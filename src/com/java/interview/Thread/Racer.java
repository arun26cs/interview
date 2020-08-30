package com.java.interview.Thread;

public class Racer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			runRace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void runRace() throws InterruptedException {
		boolean isCoverd=false;
		 for(int i=0;i<10;i++) {
			 Thread.sleep(200);
			 System.out.println(Thread.currentThread().getName()+" distance coverd: "+i);
			 
		 }
		 isCoverd=true;
		 if(isCoverd) {
			 System.out.println(Thread.currentThread().getName()+" completed races");
		 }
	}

	
}


