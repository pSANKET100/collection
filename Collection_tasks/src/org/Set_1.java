package org;

import java.util.HashSet;
import java.util.Scanner;

public class Set_1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add elements in set");
			System.out.println("2.Checking elemetns is exits or not");
			System.out.println("3.Finding the size of the set");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter value to insert ");
				int value = sc.nextInt();
				hs.add(value);
				
				break;
			case 2:
				System.out.println("Enter value to search");
				int search = sc.nextInt();
				boolean flag=false;
				for(Object obj : hs) {
					if((int) obj == search) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("Elements is exits");
				}
				else {
					System.out.println("Elements is not exits");
				}
				break;
			case 3:
				System.out.println("Size of set is :"+hs.size());
				break;
			}
		}while(true);
	}

}
