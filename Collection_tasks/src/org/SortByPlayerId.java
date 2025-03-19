package org;

import java.util.Comparator;

public class SortByPlayerId implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Player_Modul p1 = (Player_Modul) o1;
		Player_Modul p2 = (Player_Modul) o2;

		if (p1.getId() > p2.getId()) {
			return 1;
		}

		else if (p1.getId() < p2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
