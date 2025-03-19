package org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add some elements");
			System.out.println("2.Print the list ");
			System.out.println("3.Remove an element at a specific index.");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter value to insert the arraylist ");
				int value = sc.nextInt();
				al.add(value);
				break;

			case 2:
				Iterator i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				break;

			case 3:
				System.out.println("Enter index to remove");
				int index = sc.nextInt();
				boolean found = false;
				for(int m=0; m<al.size();m++) {
					if((int) m == index) {
						al.remove(m);
						found = true;
						break;
					}
				}
				if(found) {
					System.out.println("remove value");
				}
				else {
					System.out.println("value are not remove");
				}
				break;

			}
		} while (true);
	}

}
