package org;

import java.util.*;

public class Book_Store_Application {
	public static void main(String arga[]) {
		Scanner sc = new Scanner(System.in);
		Book b = null;

		Stack s = new Stack();
		int value, choice, index;

		do {
			System.out.println("1.Add new book in stack");
			System.out.println("2.View all book from stack ");
			System.out.println("3.Check top most book");
			System.out.println("4.Delete book using id from stack");
			System.out.println("5.Search book present in stack or not");
			System.out.println("6.Count the total number of stack");
			System.out.println("7.Exit");

			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter book id,name,pub,price");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				String pub = sc.nextLine();
				double price = sc.nextDouble();
				b = new Book(id, name, pub, price);
				s.push(b);
				break;

			case 2:
//				ListIterator li = s.listIterator(s.size());
//				while(li.hasPrevious()) {
//					Object obj = li.previous();
//					Book b1 = (Book)obj;
//					System.out.print(b1.getId());
//					System.out.print(b1.getName());
//					System.out.print(b1.getPub());
//					System.out.print(b1.getPrice());
//				}

				for (Object obj : s) {
					System.out.println(obj);
				}
				break;

			case 3:
				boolean b2 = s.empty();
				if (b2) {
					System.out.println("Stack is overFlow ");
				} else {
					Object obj = s.peek();
					System.out.println("Top most book is : " + obj);
				}
				break;

			case 4:

				if (s.isEmpty()) {
					System.out.println("Books are not available in stack");
				}
				Book temp = null;
				System.out.println("Enter id for book delete");
				int bookid = sc.nextInt();
				for(Object obj: s) {
						Book book = (Book)obj;
						if(bookid == book.getId()) {
							temp=book;
							break;
						}
					}
				boolean removed = s.remove(temp);
				if(removed) {
					System.out.println("Book is removed");
				}
				else {
					System.out.println("Book not found");
				}
				break; 
				
			case 5:
				boolean isPresent = false;
				if (s.isEmpty()) {
					System.out.println("There is no element present in statk");
					break;
				}
				System.out.print("Enter the ID: ");
				int sid = sc.nextInt();
				ListIterator itr = s.listIterator();
				while (itr.hasNext()) {
					Book book = (Book) itr.next();
					if (book.getId() == sid) {
						isPresent = true;
						break;
					}
				}
				if (isPresent) {
					System.out.println("Id is present");
				} else {
					System.out.println("Id is not present");
				}
				break;

			case 6:
				System.out.println(s.size());
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("wrong choice");

			}
		} while (true);

	}

}
