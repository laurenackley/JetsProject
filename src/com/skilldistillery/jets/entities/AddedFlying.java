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
//prints out the jet details and the amount of time the jet can fly until it runs out of fuel 
		Double length = getSpeed() * ((double) getRange());
		double time = length / getSpeed();
		return getModel() + " can fly up to " + length + " miles. It would take " + time
				+ " hours before it couldn't continue flying."; // change later
	}

	@Override
	public String toString() {
		return "Type: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange() + ", Price: $" + getPrice();

	}
}