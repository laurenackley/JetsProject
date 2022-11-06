package com.skilldistillery.jets.entities;

public class Dragon extends Jet implements CombatReady{

	public Dragon() {}
	
	public Dragon(String model, Double speed, Integer range, Long price) {
		// TODO Auto-generated constructor stub
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
		return "Type: "+getModel() + ", Speed: " + getSpeed() + " mph, Range: " + getRange()
				+ " miles, Price: " + getPrice();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("The dragon says: I win the fights with fire breathing ");
	}
}
