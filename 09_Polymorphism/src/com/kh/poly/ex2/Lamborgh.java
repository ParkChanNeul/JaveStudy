package com.kh.poly.ex2;

public class Lamborgh extends Car {
	
	public Lamborgh(String color, String fuel, int year) {
		super(color, fuel, year);
	}

	public void moveLamborgh() {
		System.out.println("move lamborgh");
	}
	
	@Override
	public void drive() {
		System.out.println("Lamborgh ~ drive~");
	}
	
}
