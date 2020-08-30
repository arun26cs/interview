package com.java.interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiffArray {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		String line1 = sc.nextLine();
		String[] line1s = line1.trim().split(" ");
		int col = Integer.parseInt(line1s[0]);
		int row = Integer.parseInt(line1s[1]);
		int [][] queries = new int[row][3];
		int i=0;
		File fobj = new File("input07.txt");
		Scanner scf = new Scanner(fobj);
		System.out.println("started file read....");
		while(scf.hasNext()) {
			String fline = scf.nextLine(); 
			String[] flines = fline.trim().split(" ");
			queries[i][0]=Integer.parseInt(flines[0]);
			queries[i][1]=Integer.parseInt(flines[1]);
			queries[i][2]=Integer.parseInt(flines[2]);
			i++;
		}
		System.out.println("complted file read....");
		
		scf.close(); 
		i=0;
		long first[]=new long[col+2];
		//long second[]=new long[col+1];
		int j=1;
		long hihValue=0l;
		while(i<row) {
//			String order = sc.nextLine();
//			String[] orders = order.trim().split(" ");
			 int start = queries[i][0];
	            int end = queries[i][1];
	            int value = queries[i][2];
			 
			
			first[start]+=value;
			first[end+1]-=value;
			j=0;
			while(j<col+2) {
				System.out.print(first[j]+" ");
				j++;
			}
			System.out.println();
			 
			if(i%10000==0) {
				System.out.println(hihValue);
			}
//			for(int k=0;k<first.length;k++) {
//				System.out.print(first[k]+" "+hihValue);
//			}
			//System.out.println();
			i++;
		}
		j=1;
		while(j<=col) {
			System.out.println(first[j]);
			first[j]+=first[j-1];
			if(hihValue<first[j]) {
				hihValue=first[j];
			}
			j++;
		}
		System.out.println(hihValue);
	}
}
