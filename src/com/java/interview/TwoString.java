package com.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoString {

	public static void main(String[] args) {
		int[] q= {2,5,1,3,4};
		minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
        int ans=0;
        for(int i=0;i<q.length;i++){
            if(q[i]-(i+1)>2){
                System.out.println("Too chaotic");
                return;
            }else{ 
            	if(q[i]-(i+1)>0) {
            		ans+=(q[i]-(i+1)); 
            	}
                
            }
        }
        System.out.println(ans);

    }
}
