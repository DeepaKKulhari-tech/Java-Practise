package com.Hashset;
import com.Hashset.*;

public class LinkedListPractise {

	Node head;// start node address

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListPractise llp = new LinkedListPractise();
		
       
		Node first =  new Node(10);
		llp.head = first;

		Node second =  new Node(20);
		first.next = second;

		Node third = new Node(30);
		second.next = third;

		llp.printLinkedList();
	}

	public void printLinkedList()

	{
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

}
