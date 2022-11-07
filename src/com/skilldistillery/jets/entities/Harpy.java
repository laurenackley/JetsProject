package com.skilldistillery.jets.entities;

public class Harpy extends Jet implements CombatReady {

	public Harpy() {
	}

	public Harpy(String model, Double speed, Integer range, Long price) {
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

	@Override
	public void fight() {
		System.out.println("The harpy says: I can fight, but usually it is just luring ");
	}

}
