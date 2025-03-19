package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PlayerApplication {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
			al.add(new Player_Modul("rohit", 45, 19000));
			al.add(new Player_Modul("virat", 18, 26000));
			al.add(new Player_Modul("gill", 77, 6000));
			al.add(new Player_Modul("kl", 1, 8000));
			al.add(new Player_Modul("hardik", 33, 8000));
			al.add(new Player_Modul("dhoni", 7, 9000));
		
		System.out.println("Display before sorting data");
		Iterator ls = al.listIterator();
		
		System.out.println("Before sorting");
		for(Object obj :al) {
			Player_Modul p = (Player_Modul) obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		
		Comparator c = new SortByPlayerId();
		Collections.sort(al,c);
		
		System.out.println("After Sorted By Player Id");
		for(Object obj : al) {
			Player_Modul p  = (Player_Modul)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		
		c = new SortByPlayerRun();
		Collections.sort(al,c);
		
		System.out.println("After sorted By Player Run");
		for(Object obj : al) {
			Player_Modul p = (Player_Modul) obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
	}
}
