package org;

import java.util.Map;
import java.util.Set;
import java.util.*;
public class HashMap_1 {

	public static void main(String[] args) {
		HashMap  hm = new HashMap ();
		
		hm.put(1,"chhoti");
		hm.put(2, "gudiya");
		hm.put(3,"guddi");
		
		Set set = hm.entrySet();
		for(Object obj :set) {
			Map.Entry entry  = (Map.Entry)obj;
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		Object value = hm.remove(1);
		System.out.println("Removed value : "+value);
		
		Object name = hm.get(2);
		System.out.println("retrival is : "+name);
	}

}
