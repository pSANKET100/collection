package org;

import java.util.Scanner;
import java.util.Stack;

public class LibraryManageMent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack s = new Stack();
		
		System.out.println("Enter book into stack");
		for(int i=1; i<=3; i++) {
		s.push(sc.nextLine());
		}
		
		System.out.println("Displying stack");
		for(Object obj:s) {
			System.out.println(obj);
		}
		
		boolean b2 = s.empty();
		if(b2) {
			System.out.println("Stack is overflow");
		}
		else {
			Object obj = s.pop();
			System.out.println("Removed last elements in stack "+obj);
		}
		
		System.out.println("Displaying data after removed last elements");
		for(Object obj : s) {
			System.out.println(obj);
		}
	}
}
