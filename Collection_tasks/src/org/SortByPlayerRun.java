package org;

import java.util.Comparator;

public class SortByPlayerRun implements Comparator <Player_Modul>{

	@Override
	public int compare(Player_Modul o1, Player_Modul o2) {
		 	
		return o1.getRun() > o2.getRun() ?1 : o1.getRun() < o2.getRun() ? -1:0;
	}

}
