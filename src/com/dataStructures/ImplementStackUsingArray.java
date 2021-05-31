package com.dataStructures;

public class ImplementStackUsingArray {

	int size;
	int[] arr;
	int top;

	public ImplementStackUsingArray(int size) {
		this.arr = new int[size];
		this.top = -1;
		this.size = size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementStackUsingArray stack = new ImplementStackUsingArray(5);
		stack.pop();
		stack.peek();
		stack.push(10);
		stack.push(11);
		stack.push(99);
		stack.push(101);
		stack.push(111);
		stack.push(1);
		stack.peek();
		stack.printArr();
		stack.pop();
		System.out.println();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(99);
		stack.peek();

	}

	public Boolean isEmpty() {
		return (top == -1);

	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
		} else
			System.out.println("stack is Full");

	}

	public void pop() {

		if (!isEmpty()) {
			top--;
		} else {
			System.out.println("stack is empty");

		}
	}

	public int peek() {

		if (!isEmpty()) {
			System.out.println(arr[top]);
			return arr[top];
		} else {
			System.out.println("stack is empty");
			return -1;
		}

	}

	public void printArr() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
