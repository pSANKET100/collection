package org;

import java.util.Comparator;

public class SortPlayerById implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		player p1 = (player)o1;
		player p2 = (player)o2;
		
		if(p1.getId() > p2.getId()) {
			return 1;
		}
		
		else if(p1.getId() < p2.getId()) {
			return -1;
		}
		else {
		return 0;
		}
	}

}
