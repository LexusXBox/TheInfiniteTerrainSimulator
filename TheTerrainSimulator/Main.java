package TheTerrainSimulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Swamp mySwamp = new Swamp();
		Player myPlayer = new Player();

		String command = "";
		// String north ="north";
		// String south = "south";
		// String west = "west";
		// String east = "east";

		mySwamp.populateSwamp();
		mySwamp.placeFeature();
		myPlayer.placePlayer();
		mySwamp.printing(myPlayer.getPlayXPos(),myPlayer.getPlayYPos());

		System.out.println("You are in a unpleasant place. its ...");
		System.out.println("Enter your Command...");
		Scanner s = new Scanner(System.in);

		do {


			// getDistance();
			command = s.nextLine();
			// s.close();
			switch (command) {
			case "n"://"north":
				//printing myPlayer.getPlayXPos();
				
				myPlayer.North();
				break;
			case "s"://"south":
				myPlayer.South();
				break;
			case "e":// "east"
				myPlayer.East();
				break;
			case "w": //"west":
				myPlayer.West();
				break;
			default:
				System.out.println("Enter a valid command");
				break;
			}
			// mySwamp.swampMap[myPlayer.getPlayXPos()][myPlayer.getPlayYPos()] =
			// myPlayer.getPlayer();
			// myPlayer.placePlayer();
			// System.out.println(command);

			mySwamp.printing(myPlayer.getPlayXPos(),myPlayer.getPlayYPos());

			
		} while (true);

	}

}
