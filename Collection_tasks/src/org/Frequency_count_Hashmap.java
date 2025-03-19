package org;

import java.util.HashMap;
import java.util.Scanner;

public class Frequency_count_Hashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();  //10 20 30 10 20 30
		}

		HashMap hm = new HashMap();

		for (int i = 0; i < a.length; i++) {
			if (hm.get(a[i]) == null) {
				hm.put(a[i], 0);
			}
		}

		for (int i = 0; i < a.length; i++) {
			int count = (Integer) hm.get(a[i]);
			hm.put(a[i], count + 1);
		}

		System.out.println("Elements Frequncy ");
		for (Object key : hm.keySet()) {
			System.out.println(key + "  " + hm.get(key));
		}
	}

}
