package org;

public class Employee implements Comparable {

	public Employee() {

	}

	public Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	private int id;
	private String name;
	private int sal;

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.id > e.getId() ? 1 : this.id < e.getId() ? -1 : 0;
	}

	public String toString() {
		return name + "\t" + id + "\t" + sal;
	}

}
