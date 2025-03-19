package org;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatedElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		List ls = new ArrayList();

		// add values into the list
		System.out.println("Enter 10 values with duplicate : ");
		for (int i = 0; i < 10; i++) {
			ls.add(sc.nextInt());
		}

		// then add into the set for find unique elements
		Set uniques = new HashSet(ls);

		System.out.println("uniques data"+uniques);
		
		ls.clear();
		// converting back to the list
//		List cleaned = new ArrayList(uniques);
		ls.addAll(uniques);
		
		
		System.out.println("after removing duplicated elements"+uniques);
	}
}
