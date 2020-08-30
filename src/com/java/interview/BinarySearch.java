package com.java.interview;

public class BinarySearch {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,7,8};
		int target = 4;
		int idx = binarySearch(a,target,0,a.length-1);
		System.out.println(idx);
		idx = binarySearch(a,target,idx+1,a.length-1);
		System.out.println(idx);
	}

	private static int binarySearch(int[] a, int target,int sidx,int eidx) {
		if(a.length==1) {
			if(a[sidx-1]==target) {
				return sidx-1;
			}
			return -1;
		}
		int mid=(eidx-sidx)/2;
		mid=sidx+mid;//this is to map from the subset start point
		int idx=0;
		if(a[mid]<target) {
			idx=binarySearch(a,target,mid+1,eidx);
		}else if(a[mid]>target){
			idx=binarySearch(a,target,sidx,mid-1);
		}else {
			return mid;
		}
		 
		return idx;
		
	}

}
