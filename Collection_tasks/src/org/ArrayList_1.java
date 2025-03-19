//Q 1. Write a java program to create arraylist and perform following operations using switch case and do while.
//
//1. Add 10 Values In Arraylist.
//2. Display All Values In Arraylist.
//3. Add New Value In Arraylist.
//4. Search Value In Arraylist.
//5. Sort All Values In Ascending Order In Arraylist.
//6. Sort All Values In Descending Order In Arraylist.
//7. Find Max Value In Arraylist.
//8. Find Min Value In Arraylist.
//9. Update Value In Arraylist.
//10. Delete Value In Arraylist.

package org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Add 10 Values In Arraylist.");
			System.out.println("2. Display All Values In Arraylist.");
			System.out.println("3. Add New Value In Arraylist.");
			System.out.println("4. Search Value In Arraylist.");
			System.out.println("5. Sort All Values In Ascending Order In Arraylist.");
			System.out.println("6. Sort All Values In Descending Order In Arraylist.");
			System.out.println("7. Find Max Value In Arraylist.");
			System.out.println("8. Find Min Value In Arraylist.");
			System.out.println("9. Update Value In Arraylist.");
			System.out.println("10. Delete Value In Arraylist.");
			System.out.println("11.exit");
			System.out.println("Wrong choice");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter 10 values in arrayList");
				for (int i = 0; i < 10; i++) {
					al.add(sc.nextInt());
				}
				break;

			case 2:

				System.out.println("Displaying values in ");
				Iterator i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.println(obj);
				}
				break;

			case 3:

				System.out.println("Enter new value for add in the arraylist");
				int value = sc.nextInt();
				boolean b = al.add(value);
				if (b) {
					System.out.println("added elements in the arraylist");
				} else {
					System.out.println("same problem is here");
				}
				System.out.println();
				break;

			case 4:

				System.out.println("Enter value to search");
				int search = sc.nextInt();
				boolean found = false;
				for (Object obj : al) {
					if ((int) obj == search) {
						found = true;
						System.out.println("Value is found");
						break;
					}
				}
				if (!found) {
					System.out.println("Value not found");
				}
				System.out.println();
				break;

			case 5:

				System.out.println("Before sorting ");
				i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				System.out.println("After ascending sorting");
				int length = al.size();
				for (int j = 0; j < length; j++) {
					for (int k = j + 1; k < length; k++) {
						Object prev = al.get(j);
						Object next = al.get(k);
						if ((int) prev > (int) next) {
							al.set(j, next);
							al.set(k, prev);
						}
					}
				}

				i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				break;

			case 6:
				System.out.println("After descending order");
				length = al.size();
				for (int j = 0; j < length; j++) {
					for (int k = j + 1; k < length; k++) {
						Object prev = al.get(j);
						Object next = al.get(k);
						if ((int) prev < (int) next) {
							al.set(j, next);
							al.set(k, prev);
						}
					}
				}
				i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				break;

			case 7:
				int max = Integer.MIN_VALUE;
				for (Object obj : al) {
					if ((int) obj > max) {
						max = (int) obj;
					}
				}
				System.out.print("Max value is :" + max);
				System.out.println();
				break;

			case 8:
				int min = Integer.MAX_VALUE;
				for (Object obj : al) {
					if ((int) obj < min) {
						min = (int) obj;
					}
				}
				System.out.print("Min value is :" + min);
				System.out.println();
				break;

			case 9:
				System.out.println("Enter old value to madify");
				int update = sc.nextInt();
				boolean isUpdate = false;

				for (int m = 0; m < al.size(); m++) {
					if ((int) al.get(m) == update) {
						System.out.println("Enter new value");
						al.set(m, sc.nextInt());
						isUpdate = true;
						break;
					}
				}
				if (isUpdate) {
					System.out.println("Value is updated ");
				} else {
					System.out.println("values is not in the found");
				}
				break;

			case 10:
				System.out.println("Enter value to delete ");
				int delete = sc.nextInt();
				boolean isdeleted = false;
				for (int m = 0; m < al.size(); m++) {
					if ((int) al.get(m) == delete) {
						al.remove(m);
						isdeleted = true;
						break;
					}
				}
				if (isdeleted) {
					System.out.println("Value is deleted ");
				} else {
					System.out.println("Value is not deleted ");
				}
				break;

			case 11:
				System.out.println("Exiting program");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice.....");
			}
		} while (true);
	}

}
