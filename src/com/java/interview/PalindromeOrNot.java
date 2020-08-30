package com.java.interview;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String s="abccba";//abccba
		System.out.println(isPalindrome(s));
	}
	
	
	public static boolean isPalindrome(String str) {
	boolean notPal=false;
    if(!notPal){
    	if(str.length()==1) {
    		return true;
    	}
    	if(str.length()==2) {
    		if(str.charAt(0)==str.charAt(str.length()-1)){
    			return true;
    		}else {
    			return false;
    		}
    	}
		if(str.charAt(0)==str.charAt(str.length()-1)){
			notPal=isPalindrome(str.substring(1,str.length()-1));
		}else{
			return false;
		}
		System.out.println(str);
		return notPal;
	}
    return false;
  }
	
}
