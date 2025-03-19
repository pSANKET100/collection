package org;
import java.util.*;
public class Stack_Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice,value,index;
		
		Stack s = new Stack();
		
		do {
			System.out.println("1.PUSH elements of stack");
			System.out.println("2.POOP elements of stack");
			System.out.println("3.PEEK elements from stack");
			System.out.println("4.Display elements from stack");
			System.out.println("5.Search elements from stack");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter value");
				value = sc.nextInt();
				s.push(value);
				break;
			case 2:
				boolean b= s.empty();
				if(b) {
					System.out.println("Stack is underflow");
					
				}
				else {
					Object obj=s.pop();
					System.out.println("Remove elements from stack "+obj);
				}
				break;
			case 3:
			    b = s.empty();
			    if(b){
			    	System.out.println("Stack is underflow");
			    }
			    else {
			    	Object obj=s.peek();
			    	System.out.println("Last elements of stack"+obj);
			    }
				break;
			case 4:
				ListIterator li= s.listIterator(s.size());
				while(li.hasPrevious()) {
					Object obj=li.previous();
					System.out.println(obj);
				}
				break;
			case 5:
				System.out.println("Enter for search elements from stack");
				value = sc.nextInt();
				index = s.search(value);
				
				if(index!=-1) {
					System.out.println("elements found..");
				}
				else {
					System.out.println("elements not found.........");
				}
				break;
			case 6:
				System.exit(0);
			default :
				System.out.println("wrong choice");
			}
			
		}while(true);
	}
}
