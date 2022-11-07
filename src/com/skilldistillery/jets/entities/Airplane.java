package com.skilldistillery.jets.entities;

public class Airplane extends Jet {

	public Airplane() {
	}

	public Airplane(String model, Double speed, Integer range, Long price) {
		super(model, speed, range, price);

	}

	@Override
	public String fly() {
		Double length = getSpeed() * ((double) getRange());
		double time = length / getSpeed();
		return getModel() + " can fly up to " + length + " miles. It would take " + time
				+ " hours before it couldn't continue flying."; // change later
	}

	@Override
	public String toString() {
		return "Type: " + getModel() + ", Speed: " + getSpeed() + " mph, Range: " + getRange() + " miles, Price: $"
				+ getPrice();
	}
}
