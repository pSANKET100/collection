package org;
import java.util.*;
public class Set {
	public static void main (String args[]) {
		LinkedHashSet hs = new LinkedHashSet();
		// 1.It is use to store data uniquely but arrange data according to use sequence......
		// 2. Backend data structure is LinkedHashMap......
		// 3. LinkedHashMap is the child of HashMap.......
		
		hs.add(100);
		hs.add(200);
		hs.add(50);
	
		for(Object obj:hs) {
			System.out.println("Accoding to LinkedHashSet "+obj);
		}
		
		
		TreeSet tr = new TreeSet();
		//1. It is helps us to store data uniquely but arrange data sequence in ascending order....
		//2. Backend data structure is TreeMap....
		//3. Not allows null value..
		//4.NavigableSet it is use for descending order......
		
		tr.add(100);
		tr.add(200);
		tr.add(50);
		
		for(Object obj:tr) {
			System.out.println("According to TreeSet "+obj);
		}
		
		NavigableSet nav  = tr.descendingSet();
		
		for(Object obj:nav) {
			System.out.println("Descending order using NavigableSet "+obj);
		}
		
		
				
		
	}
	
}
