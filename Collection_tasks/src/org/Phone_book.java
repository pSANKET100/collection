package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Phone_book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap hs = new HashMap();

		while (true) {
			System.out.println("1.Add Contact ");
			System.out.println("2.Display details");
			System.out.println("3.exit");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("Enter number: ");
				String number = sc.nextLine();

				System.out.println("Enter name: ");
				String name = sc.nextLine();

				hs.put(number, name);
			}

			else if (choice == 2) {
				System.out.println("Phone book");
				for (Object key : hs.keySet()) {
					System.out.println(key + ":" + hs.get(key));
				}
			}

			else if (choice == 3) {
				System.out.println("Exit.......");
				break;
			} else {
				System.out.println("wrong choice ");
			}
		}
	}

}
