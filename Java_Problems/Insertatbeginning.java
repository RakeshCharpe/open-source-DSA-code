package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

import linkedlist.Insertionatindex.Node;

public class Insertatbeginning {
	class Node{
		int data;
		Node next;

		}
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next= null;
		if(head==null) {
			head=node;
		}
		else
		{
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void insertatstart(int data) {
		Node node = new Node();
		node.data=data;
		node.next= null;
		node.next =head;
		head = node;
		
	}
	public void insertatindex(int index,int data) {
		Node node = new Node();
		node.data=data;
		node.next= null;
		if(index==0) {
			insertatstart( data);
			//if return not added then repeat number is shown
			return;
		}
		//this part will be in else part correction
		Node n= head; 
		/*important index-1 for one step back*/
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		node.next =n.next;
		n.next = node;
		
		
	}
		
	public void show() {
		Node node= head;
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node= node.next;
			
		}
		System.out.println(node.data);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insertatbeginning obj = new Insertatbeginning();
		System.out.println("enter the elements");
		obj.insert(sc.nextInt());
		obj.insert(sc.nextInt());
		obj.insert(sc.nextInt());
		System.out.println("enter the element at start");
		obj.insertatstart(sc.nextInt());
		System.out.println("enter the index and element");
		obj.insertatindex(sc.nextInt(), sc.nextInt());
		obj.show();
		
		
		
	}

}
