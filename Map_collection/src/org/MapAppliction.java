package org;

import java.util.*;

public class MapAppliction {
	public static void main(String args[] ){
		HashMap hs = new HashMap();
		
		hs.put(12, "abc");
		hs.put(13, "pqr");
		hs.put(14, "xyz");
		hs.put(42, "abc");
		hs.put(33, "pqr");
		hs.put(54, "xyz");
		
		Set<Map.Entry> set=hs.entrySet();
			for(Map.Entry m:set) {
				System.out.println(m.getKey() +"\t"+m.getValue());
			}
		}
}