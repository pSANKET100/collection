package org;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack s = new Stack();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.PUSH elements in stack");
			System.out.println("2.POP elements in stack");
			System.out.println("3.PEEK elements in stack");
			System.out.println("4.Display stack value using last in first out");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter value to insert the stack");
				int value = sc.nextInt();
				s.push(value);
				break;
			case 2:
				boolean b = s.empty();
				if (b) {
					System.out.println("Stack is underflow");
				} else {
					Object obj = s.pop();
					System.out.println("Remove the last elements from stack" + obj);
				}
				break;
			case 3:
				b = s.empty();
				if (b) {
					System.out.println("Stack is underflow");
				} else {
					Object obj = s.peek();
					System.out.println("last elements is " + obj);
				}
				break;

			case 4:
				ListIterator li = s.listIterator(s.size());
				while (li.hasPrevious()) {
					Object obj = li.previous();
					System.out.print(obj + " ");
				}
				break;

			default:
				System.out.println("Wrong choice");
			}
		} while (true);
	}

}
