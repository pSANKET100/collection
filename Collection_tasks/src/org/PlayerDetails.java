package org;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerDetails {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(new player("rohit", 45, 19000));
		al.add(new player("virat", 18, 26000));
		al.add(new player("gill", 77, 6000));
		al.add(new player("kl", 1, 8000));
		al.add(new player("hardik", 33, 8000));
		al.add(new player("dhoni", 7, 9000));

		System.out.println("Before sorting data ");

		for (Object obj : al) {
			player value = (player) obj;
			System.out.println(value + " ");
		}
		System.out.println();

		Collections.sort(al);

		System.out.println("After sorting data ");

		for (Object obj : al) {
			player value = (player) obj;
			System.out.println(value + " ");
		}
	}

}
