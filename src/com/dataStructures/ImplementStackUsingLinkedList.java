package com.dataStructures;

public class ImplementStackUsingLinkedList {

	static Node head;

	class Node {
		int value;
		Node next;
	}

	public ImplementStackUsingLinkedList() {
		head = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementStackUsingLinkedList list=new ImplementStackUsingLinkedList();
		list.push(10);
		list.push(200);
		list.push(300);
		list.push(440);
		list.push(244);
		list.pop();
		list.print(head);
	}
	
	
	public void push(int value) {
		Node temp = head;
		head = new Node();
		head.value = value;
		head.next = temp;
		System.out.println("node added: "+head.value);
	}

	public int pop() {
		if (head == null) {
			System.out.println("linkedList is empty");
			return 0;
		} 
		else 
		{
			System.out.println("popped value: "+head.value);
			int value = head.value;
			head = head.next;
			return value;

		}
		

	}
	
	
	public void print(Node head)
	{
		Node node=head;
		
		while(node!=null)
		{
			System.out.println(node.value);
			node=node.next;
		}
		
	}

}
