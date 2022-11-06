package com.skilldistillery.jets.entities;

public class AddedFlying extends Jet {
	
	public AddedFlying() {

	}

	public AddedFlying(String model, double speed, int range, long price) {
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
		return "Type: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange() + ", Price: $" + getPrice();

	}
}