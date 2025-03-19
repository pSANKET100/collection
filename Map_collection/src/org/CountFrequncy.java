package org;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequncy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "as abb baa va bv bv bv vb ";
		HashMap<String, Integer> hmap = new HashMap<>();
	
		String [] words = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			if(hmap.containsKey(words[i])) {
				int count = hmap.get(words[i]);
				hmap.put(words[i],count+1);
			}
			else {
				hmap.put(words[i],1);
			}
		}
		System.out.println(hmap);
	}

}
