package com.skilldistillery.jets.entities;

public class Hippogriff extends Jet{

	public Hippogriff() {
	}

	public Hippogriff(String model, Double speed, Integer range, Long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub

	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		Double length = getSpeed()*((double)getRange());
		return getModel() + " can fly up to "+length+" miles"; // change later
	
	}

	@Override
	public String toString() {
		return "Type: " + getModel() + ", Speed: " + getSpeed() + " mph, Range: " + getRange() + " miles, Price: $"
				+ getPrice();
	}

}
