package com.java.interview;

public class LeftRotation {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5};
		int ans[] = new int[a.length];
		int d=12;
		int reminder = d%a.length; 
		int j=0;
		for(int i=reminder;i<a.length;i++) {
			ans[j]=a[i];
			j++;
		}
		if(reminder!=0) {
			for(int i=0;i<reminder;i++) {
				ans[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
		
	}
	
}

 