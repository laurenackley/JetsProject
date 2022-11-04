package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public void fly() {
		System.out.println("Look ma, I am flying!");
	}
}
