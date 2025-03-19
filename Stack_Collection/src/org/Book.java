package org;

public class Book {
	
	public Book() {
		
	}
	public Book(int id,String name, String pub, double price) {
		this.id=id;
		this.name=name;
		this.pub=pub;
		this.price=price;
	}
	private int id;

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

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String name;
	private String pub;
	private double price;

	@Override
	public String toString() {
		return "Book [id = " + id + ", name = " + name + ", pub = " + pub + ", price = " + price + "]";
	}
	
}
