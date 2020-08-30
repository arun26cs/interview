package com.java.interview;

import java.util.Scanner;

public class ListAction {

	Node head;
	public static void main(String[] args) {
		ListAction la = new ListAction();
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int i=0;
		while(i<n) {
			la.head=la.createList(la.head,Integer.parseInt(sc.nextLine()));
			i++;
		}
		
		la.traverse(la.head);
		int del = Integer.parseInt(sc.nextLine());
		System.out.println("after deleting");
		la.head=la.deleteNode(la.head,del);
		la.traverse(la.head);
		la.head=la.reverse(la.head);
		la.traverse(la.head);
	}
	private Node reverse(Node head2) {
		Node headtemp=head2;
		Node curr=head2;
		Node temp=head2.next;
		while(temp!=null) {
			Node temptemp = temp.next;
			temp.next=curr;
			curr=temp;
			temp=temptemp;
		}
		head2=curr;
		headtemp.next=null;//at last just nulllify the head else its would be infinte loopback
		return head2;
	}
	private Node deleteNode(Node head2, int del) {
		Node temp=head2;
		Node prev=head2;
		int i=0;
		while(temp.next!=null && i<del) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		if(del==0) {
			head2=head2.next;
		}else {
			prev.next=temp.next;
			temp=null;
		}
		
		return head2;
	}
	private void traverse(Node head2) {
		if(head2!=null) {
			System.out.println(head2.n);
			traverse(head2.next);
		}else {
			return;
		}
		
	}
	private Node createList(Node head2, int parseInt) {
		Node temp = head2;
		if(head2==null) {
			return new Node(parseInt);
		}else {
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=new Node(parseInt);
			 
			return head2;
			
		}
		 
	}
	
}


class Node{
	int n;
	Node next;
	public Node(int n){
		this.n=n;
	}
	
}