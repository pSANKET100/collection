package org;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
	public static void main(String args[]) {
		LinkedList ls = new LinkedList();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in arraylist");
		for (int i = 0; i < 5; i++) {
			ls.add(sc.nextInt());
		}
		
		for(int i=0; i<ls.size(); i++) {
			for(int j=i+1; j<ls.size(); j++) {
				Object obj = ls.get(i);
				ls.set(i,ls.get(j));
				ls.set(j, obj);
			}
		}
		System.out.println(ls);
	}
}
