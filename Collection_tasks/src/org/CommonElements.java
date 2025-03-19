
package org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs1 = new HashSet();

		for (int i = 0; i < 5; i++) {
			hs1.add(sc.nextInt());
		}

		HashSet hs2 = new HashSet();

		for (int i = 0; i < 5; i++) {
			hs2.add(sc.nextInt());
		}

		HashSet CommonSet = new HashSet();

		Iterator is = hs1.iterator();
		while (is.hasNext()) {
			Object e1 = is.next();

			Iterator is1 = hs2.iterator();
			while (is1.hasNext()) {
				Object e2 = is.next();
				if (e1.equals(e2)) {
					CommonSet.add(e1);
					break;
				}
			}
		}
		System.out.println(CommonSet);

	}

}
