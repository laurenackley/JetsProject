package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Dragon;
import com.skilldistillery.jets.entities.Harpy;
import com.skilldistillery.jets.entities.Unicorn;

public class JetsApplication {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jA = new JetsApplication();

		jA.MenuChoices();
	}

	public void MenuChoices() {
		AirField af = new AirField();
		af.readFile();
		int choice = 0;
		while (choice != 9) {
			System.out.println("Please choice from the following:");
			System.out.println("1. List the fleet of flying objects");
			System.out.println("2. Fly all available. ");
			System.out.println("3. View the fastest flying object. ");
			System.out.println("4. View the flying object with the longest range. ");
			System.out.println("5. What option is the most magical? "); // can change later
			System.out.println("6. What can fight?"); // can change later
			System.out.println("7. Add a flying object.");
			System.out.println("8. Remove a flying object.");
			System.out.println("9. End the program. ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				for (int i = 0; i < (af.getFleet().size()); i++) {
					System.out.println(af.getFleet().get(i));
				}
				break;
			case 2:

				for (int i = 0; i < (af.getFleet().size()); i++) {
					System.out.println(af.getFleet().get(i).fly());
				}
				break;
			case 3:

				double speeds = 0;
				double topSpeed = 0;
				int index = 0;
				for (int i = 0; i < (af.getFleet().size()); i++) {
					if (af.getFleet().size() != 0) {
						speeds = af.getFleet().get(i).getSpeed();
						if (speeds > topSpeed) {
							topSpeed = speeds;
							index = i;
						}
					}
				}
				System.out.println(af.getFleet().get(index));
				break;

			case 4:

				int range = 0;
				double longestRange = 0;
				double speed = 0;
				int index1 = 0;
				for (int i = 0; i < (af.getFleet().size()); i++) {
					if (af.getFleet().size() != 0) {
						range = af.getFleet().get(i).getRange();
						speed = af.getFleet().get(i).getSpeed();
						i++;
						if (range > longestRange) {
							longestRange = (((double) range) * speed);
							index1 = i;
							System.out.println(af.getFleet().get(index1));
						}
					}
				}

				break;

			case 5:
				Unicorn unicorn1 = new Unicorn();
				unicorn1.magical();
				break;

			case 6:
				Harpy harpy1 = new Harpy();
				harpy1.fight();
				Dragon dragon1 = new Dragon();
				dragon1.fight();
				break;

			case 7:
				af.addObj();
				break;

			case 8:
				af.removeObj();
				break;

			case 9:
				System.out.println("Thanks for playing. Program ending");
				break;

			default:
				System.out.println("You have selected an invalid option. Please try again.");
				break;
			}
			if (choice == 9) {
				break;
			}
		}

		sc.close();
	}

}
