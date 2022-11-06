package com.skilldistillery.jets.entities;

public class Unicorn extends Jet implements MythicalAnimal {

	public Unicorn() {
	}

	public Unicorn(String model, Double speed, Integer range, Long price) {
		super(model, speed, range, price);
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		Double length = getSpeed()*((double)getRange());
		return getModel() + " can fly up to "+length+" miles"; // change later
	
	}

	@Override
	public String toString() {
		return "Type: " + getModel() + ", Speed: " + getSpeed() + " mph, Range: " + getRange() + " miles, Price: $" + getPrice();
	}

	@Override
	public void magical() {
		// TODO Auto-generated method stub
		System.out.println("The unicorn is the most magical!");
			
		}
	}
