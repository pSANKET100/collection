package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class playerApplication {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();

		player p1 = new player("virat", 18, 14000);
		player p2 = new player("rohit", 45, 12000);
		player p3 = new player("shubhman", 77, 5000);

		al.add(p1);
		al.add(p2);
		al.add(p3);

		System.out.println("Display player record before sorting");
		for (Object obj : al) {
			p1 = (player) obj;
			System.out.println("[" + p1.getId() + "," + p1.getName() + "," + p1.getRun() + "]");
		}

		Comparator c= new SortPlayerById();
		Collections.sort(al,c);
		
		System.out.println("Display player record after sorting according to id");
		for (Object obj : al) {
			p1 = (player) obj;
			System.out.println("[" + p1.getId() + "," + p1.getName() + "," + p1.getRun() + "]");
		}
		
		c= new SortPlayerByRun();
		Collections.sort(al,c);
		
		System.out.println("Display player record after sorting according to run ");
		for (Object obj : al) {
			p1 = (player) obj;
			System.out.println("[" + p1.getId() + "," + p1.getName() + "," + p1.getRun() + "]");
		}

	}
}
