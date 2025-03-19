package org;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_1 {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		sc.nextInt();
		for (int i = 0; i <= 5; i++) {
			ls.add(sc.nextInt());
		}

		for (Object obj : ls) {
			Integer value = (Integer) obj;
			System.out.print(value + " ");
		}

		if (ls.size() > 1) {
			ls.removeFirst();
			ls.removeLast();
		}

		System.out.println("After removing elements ");
		for (Object obj : ls) {
			Integer value = (Integer) obj;
			System.out.print(value + " ");
		}

	}

}
