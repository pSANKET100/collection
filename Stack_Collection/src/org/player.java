package org;

import java.lang.*;

public class player {

	public player() {

	}

	public player(String name, int id, int run) {
		this.name = name;
		this.id = id;
		this.run = run;
	}

	private int id;
	private String name;
	private int run;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
