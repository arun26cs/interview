package com.java.interview;

public class StringQuery {

	public static void main(String[] args) {
		String[] str = {"a","b","c","d"};
		String[] query = {"b","c"};
		int[] res = new int[query.length];
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<query.length;j++) {
				if(str[i].equalsIgnoreCase(query[j])) {
					res[j]++;
				}
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
