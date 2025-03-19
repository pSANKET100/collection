package org;

public class player implements Comparable {

	public player() {

	}

	public player(String name, int no, int run) {
		this.name = name;
		this.no = no;
		this.run = run;

	}

	private int no;
	private String name;
	private int run;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public int compareTo(Object o) {
		player p = (player) o;

		return this.run > p.getRun() ? 1 : this.run < p.getRun() ? -1 : 0;
	}

	public String toString() {
		return name + "\t" + no + "\t" + run + " ";
	}
}
