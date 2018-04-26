package com.scb.java8.practice;

public class Book {
	private int id;
	public Book(int i, String name, double proce) {
		this.id =id;
		this.name =name;
		this.price= price;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String name; 
	private double price;

}
