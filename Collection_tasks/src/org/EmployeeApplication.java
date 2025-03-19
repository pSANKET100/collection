package org;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApplication {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(new Employee("ram", 1, 30000));
		al.add(new Employee("abc", 5, 29000));
		al.add(new Employee("def", 2, 21000));
		al.add(new Employee("ghi", 6, 24000));
		al.add(new Employee("mno", 9, 23000));
		al.add(new Employee("pqr", 7, 28000));
		al.add(new Employee("stv", 4, 26000));

		System.out.println("Before sorting list");
		for (Object obj : al) {
			Employee value = (Employee) obj;
			System.out.println(value + " ");
		}

		Collections.sort(al);

		System.out.println("After sorting list");
		for (Object obj : al) {
			Employee value = (Employee) obj;
			System.out.println(value + " ");
		}
	}

}
