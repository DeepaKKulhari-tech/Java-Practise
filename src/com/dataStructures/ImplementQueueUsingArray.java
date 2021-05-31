package com.dataStructures;

public class ImplementQueueUsingArray {

	int capacity;
	int arr[];
	int rear;
	int front;
	int currentSize;

	public ImplementQueueUsingArray(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		arr = new int[this.capacity];
		front = -1;
		rear = -1;
		currentSize = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementQueueUsingArray queue = new ImplementQueueUsingArray(5);
		System.out.println(queue.isFull());
		queue.Enqueue(10);
		queue.Enqueue(11);
		queue.Enqueue(12);
		queue.Enqueue(13);
		queue.Enqueue(14);
		queue.Enqueue(15);
		queue.print();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.print();
		queue.Enqueue(20);
		queue.Enqueue(21);
		queue.Dequeue();	
		queue.print();
	
		
	
		
		
		

	}

	public boolean isFull() {
		return (currentSize == capacity);
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public void Enqueue(int Element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			rear++;
			if (rear == capacity) {
				rear = 0;
			}
			arr[rear] = Element;
			System.out.println("added in the queue: " + arr[rear]);
			currentSize++;
		}

	}

	public void Dequeue() {
		if (isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else 
		{
			
			front++;
			if (front == capacity)
			{
				front = 0;
			}
			System.out.println("removed from the queue: " + arr[front]);
			
			currentSize--;

		}

	}

	public void print() {
		int x = front;
		int y = rear;

		while (x != y) {
			x++;
			if(x==capacity)
			{
				x=0;
			}
			System.out.println(arr[x]);
			
		}

	}

}
