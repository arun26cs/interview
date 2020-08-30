package com.java.interview;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.util.Scanner;

public class TreeAction {

	TNode root;
	
	public static void main(String[] args) {
		TreeAction ta = new TreeAction();
		int n;
		int i=1;
		Scanner sc = new Scanner(System.in);
		//n=Integer.parseInt(sc.nextLine());
		//ta.root = new TNode(3);
		ta.root=ta.createTree(ta.root);
		ta.inorder(ta.root);
		System.out.println(ta.checkbst(ta.root));
	}

	private boolean checkbst(TNode root) {
		if(root==null) {
			return true;
		}
		 if(root.left!=null&&root.right!=null) {
			 if(root.left.n>root.n || root.right.n<root.n) {
				 BufferedInputStream bis;
				 FilterInputStream
				 return false;
			 }
		 }else if(root.left==null&&root.right!=null) {
			 if(root.right.n<root.n) {
				 return false;
			 }
		 }else if(root.right==null&&root.left!=null) {
			 if(root.left.n>root.n) {
				 return false;
			 }
		 }
		 if(checkbst(root.left)&&checkbst(root.right)) {
			 return true;
		 }else {
			 return false;
		 }
	}

	private void inorder(TNode root2) {
		if(root2==null) {
			return;
		}
		inorder(root2.left);
		System.out.println(root2.n);
		inorder(root2.right);
		
	}

	private TNode createTree(TNode root) {
		
		root = new TNode(3);
		root.left=new TNode(5);
		root.right=new TNode(2);
		root.left.left=new TNode(1);
		root.left.right=new TNode(4);
		root.right.left=new TNode(6);
		root.right.right=null;
		
//		root = new TNode(7);
//		root.left=new TNode(5);
//		root.right=new TNode(9);
//		root.left.left=new TNode(2);
//		root.left.right=new TNode(6);
//		root.right.left=new TNode(8);
//		root.right.right=new TNode(10);
		
		return root;
	}

	 
}

class TNode{
	int n;
	TNode left;
	TNode right;
	public TNode(int n) {
		this.n=n;
	}
}
