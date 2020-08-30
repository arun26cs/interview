package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class CommonSub {

	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		csp(s1,s2);
	}

	private static void csp(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int[][] ans = new int[s1.length+1][s2.length+1];
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				ans[0][j]=0;
				ans[i][0]=0;
			}
		}
		for(int i=1;i<s1.length;i++) {
			for(int j=1;j<s2.length;j++) {
				if(s1[i-1]==s2[j-1]) {
					ans[i][j] = 1+ans[i-1][j-1];
				}else {
					ans[i][j] = Math.max(ans[i-1][j],ans[i][j-1]);
				}
			}
			 
		}
		StringBuilder sb;
		StringBuffer sf;
		String s;
		sf.append(b)
		s.sub;
		
		Map<String, Integer> sup = new HashMap<String, Integer>();
		sup.co
		
		
		for(int i=0;i<s1.length+1;i++) {
			for(int j=0;j<s2.length+1;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
		
	}
}
