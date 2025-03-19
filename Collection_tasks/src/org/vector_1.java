//Q 2. Write a java program to create Vector and perform following operations using switch case and do while.
//
//1. Add 10 Values In Vector.
//2. Display All Values In Vector.
//3. Add New Value In Vector.
//4. Search Value In Vector.
//5. Sort All Values In Ascending Order In Vector.
//6. Sort All Values In Descending Order In Vector.
//7. Find Max Value In Vector.
//8. Find Min Value In Vector.
//9. Update Value In Vector.
//10. Delete Value In Vector.

package org;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class vector_1 {

	public static void main(String[] args) {
		Vector v1 = new Vector(10);

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add 10 Values In Vector.");
			System.out.println("2.Display All Values In Vector.");
			System.out.println("3.Add New Value In Vector.");
			System.out.println("4.Search Value In Vector.");
			System.out.println("5.Sort All Values In Ascending Order In Vector.");
			System.out.println("6.Sort All Values In Descending Order In Vector.");
			System.out.println("7.Find Max Value In Vector.");
			System.out.println("8.Find Min Value In Vector.");
			System.out.println("9.Update Value In Vector.");
			System.out.println("10.Delete Value In Vector.");
			System.out.println("11.Exit......");
			System.out.println("Wrong choice");

			System.out.println("Enter choice ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter ten new elements");
				for (int i = 0; i < 10; i++) {
					v1.add(sc.nextInt());
				}
				break;

			case 2:
				Iterator i = v1.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				break;

			case 3:
				System.out.println("Enter a value of vector ");
				int value = sc.nextInt();
				boolean b = v1.add(value);
				if (b) {
					System.out.println(" New  elements added in vector collection ");
				} else {
					System.out.println("some is here.......");
				}
				break;

			case 4:
				System.out.println("Enter a value for searching ");
				int search = sc.nextInt();
				boolean flag = false;
				for (Object obj : v1) {
					if ((int) obj == search) {
						flag = true;
						System.out.println("Elements is found");
						break;
					}
				}
				if (!flag) {
					System.out.println("Not found");
				}
				break;

			case 5:
				System.out.println("Before sorting ");

				Iterator I = v1.iterator();
				while (I.hasNext()) {
					Object obj = I.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				System.out.println("After ascending  sorting ");

				int length = v1.size();
				for (int m = 0; m < length; m++) {
					for (int n = m + 1; n < length; n++) {
						Object prev = v1.get(m);
						Object next = v1.get(n);
						if ((int) prev > (int) next) {
							v1.set(m, next);
							v1.set(n, prev);
						}
					}
				}

				I = v1.iterator();
				while (I.hasNext()) {
					Object obj = I.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				break;

			case 6:
				System.out.println("Before Sorting descending order");
				I = v1.iterator();
				while (I.hasNext()) {
					Object obj = I.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				length = v1.size();
				for (int m = 0; m < length; m++) {
					for (int n = m + 1; n < length; n++) {
						Object prev = v1.get(m);
						Object next = v1.get(n);
						if ((int) prev < (int) next) {
							v1.set(m, next);
							v1.set(n, prev);
						}
					}
				}
				System.out.println("After Sorting descending order");
				I = v1.iterator();
				while (I.hasNext()) {
					Object obj = I.next();
					System.out.print(obj + " ");
				}
				System.out.println();
				break;

			case 7:
				int max = Integer.MIN_VALUE;
				for (Object obj : v1) {
					if ((int) obj > max) {
						max = (int) obj;
					}
				}
				System.out.print("Max value is :" + max);
				System.out.println();
				break;

			case 8:
				int min = Integer.MAX_VALUE;
				for (Object obj : v1) {
					if ((int) obj < min) {
						min = (int) obj;
					}
				}
				System.out.print("Min value is :" + min);
				System.out.println();
				break;

			case 9:
				System.out.println("Enter value of to update ");
				int oldValue = sc.nextInt();
				boolean isUpdate = false;
				for (int m = 0; m < v1.size(); m++) {
					if ((int) v1.get(m) == oldValue) {
						System.out.println("Enter new value");
						v1.set(m, sc.nextInt());
						isUpdate = true;
						break;
					}
				}
				if (isUpdate) {
					System.out.println("Value is updated ");
				} else {
					System.out.println("Value is not update ");
				}
				break;

			case 10:
				System.out.println("Enter value to delete to vetor ");
				int delete = sc.nextInt();
				boolean found = false;
				for (int m = 0; m < v1.size(); m++) {
					if ((int) v1.get(m) == delete) {
						v1.remove(m);
						found = true;
						break;
					}
				}
				if (found) {
					System.out.println("Value is deleted ");
				} else {
					System.out.println("Value is not delete");
				}
				break;

			case 11:
				System.out.println("Exiting program...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("worng choice! Try again....");
			}
		} while (true);

	}

}
