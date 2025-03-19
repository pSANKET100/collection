package org;

import java.util.ArrayList;

public class margedArray {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(5);
		al2.add(6);
		al2.add(7);
		al2.add(8);
		
		ArrayList marged = new ArrayList();
		for(int i=0; i<al1.size(); i++) {
			marged.add(al1.get(i));
		}
		
		for(int i=0;i<al2.size(); i++) {
			marged.add(al2.get(i));
		}
		
		System.out.println("Marged array"+marged);
	}

}
