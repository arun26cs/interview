package com.java.interview;

public class GenericCollect<T,U> implements Genericclass<T, U> {

	private T key;
	private U value;
	
	public GenericCollect (T key1, U value1){
		this.key=key1;
		this.value=value1;
	}
	@Override
	public T getT() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public U getU() {
		// TODO Auto-generated method stub
		return this.value;
	}

	public static void main(String args[]) {
		GenericCollect<String, Integer> gc = new GenericCollect<String, Integer>("Arun",1);
		System.out.println(gc.getT()+" "+gc.getU());
	}
}
