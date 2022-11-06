package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/// going to be large with a lot of methods -- going to read from text file in here. Did so in name separator 
public class AirField {
	private ArrayList<Jet> fleet = new ArrayList<Jet>();
	java.util.Scanner sc = new java.util.Scanner(System.in);

	public void readFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] splitLine = line.split(",");
				String model = splitLine[1];
				Double speed = Double.parseDouble(splitLine[2]);
				Integer range = Integer.parseInt(splitLine[3]);
				Long price = Long.parseLong(splitLine[4]);

				if (model.equals("Unicorn")) {
					Unicorn jetUnicorn = new Unicorn(model, speed, range, price);
					fleet.add(jetUnicorn);
				} else if (model.equals("Dragon")) {
					Dragon jetDragon = new Dragon(model, speed, range, price);
					fleet.add(jetDragon);
				} else if (model.equals("Airplane")) {
					Airplane aero = new Airplane(model, speed, range, price);
					fleet.add(aero);
				} else if (model.equals("Harpy")) {
					Harpy jetHarpy = new Harpy(model, speed, range, price);
					fleet.add(jetHarpy);
				} else if (model.equals("Hippogriff")) {
					Hippogriff jetHippogriff = new Hippogriff(model, speed, range, price);
					fleet.add(jetHippogriff);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void addObj() {

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.println("Thanks for wanting to add to the fun.");
			} else {
				System.out.println("Please enter the type of flying object.");
				String model = sc.next();

				System.out.println("Please enter how fast they can fly.");
				Double speed = sc.nextDouble();

				System.out.println("What is the objects range?");
				Integer range = sc.nextInt();
				sc.nextLine();

				System.out.println("How much does it cost?");
				Long price = sc.nextLong();

				AddedFlying added = new AddedFlying(model, speed, range, price);
				fleet.add(added);

				System.out.println("Do you want to stop adding objects? Type yes if so.");
				String option = sc.next();
				if (option.equalsIgnoreCase("yes")) {
					break;
				} else if (!option.equalsIgnoreCase("yes")) {
					continue;
				}
			}
		}
	}

	public void removeObj() {

		System.out.println("What would you like to remove ");
		for (int i = 0; i < getFleet().size(); i++) {
			System.out.print(i + " " + getFleet().get(i).getModel() + " ");
		}
		fleet.remove(sc.nextInt());

	}

	public ArrayList<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(ArrayList<Jet> fleet) {
		this.fleet = fleet;
	}

}