package TheTerrainSimulator;

import java.util.Random;

public class Swamp {

	// A
	 static int size = 254;
	 static String[][] swampMap;
	 int numberOfFeatures = 100;
	 int view = 32;
	// int small = size/2-view/2;
	// int large = size/2+view/2;
	

	// C

	public void placeFeature(Player myPlayer) {
		Random rand = new Random();
		Feature featured = new Feature();
		for (int k = 0; k < numberOfFeatures; k++) {
			int random1 = rand.nextInt(this.size);
			int random2 = rand.nextInt(this.size);
			if (random1 == myPlayer.getPlayXPos() && random2 == myPlayer.getPlayYPos()) {
				k--;
				//System.out.print("Hit Player "+ k);
				continue;
			}
			swampMap[random1][random2] = featured.getFeature();
			for (int i = 0; i < this.size - 1; i++) {
				for (int j = 0; j < this.size - 1; j++) {
					// System.out.print(swampMap[i][j]);
					swampMap[i][j] = TextMaker.test();
				}
			}
			// System.out.println();
		}

	}
	// public void placePlayer() {
	//
	// //Player playChar = new Player();
	// swampMap[getPlayXPos()][this.getPlayYPos()] = this.getPlayer();
	// // for (int i = 0; i < this.size -1; i++) {
	// // for (int j = 0; j < this.size -1; j++) {
	//
	// // System.out.print(swampMap[i][j]);
	// //}
	// //System.out.println();
	// //}
	//
	// }

	// M
	public void printing(int vXPos, int vYPos) {
		int north = vYPos + view / 2;
		int south = vYPos - view / 2;
		int east = vXPos + view / 2;
		int west = vXPos - view / 2;
		for (int i = west; i < east; i++) {
			for (int j = south; j < north; j++) {
				System.out.print(swampMap[i][j]);
			}
			System.out.println();
		}
	}

	public void populateSwamp(Swamp mySwamp) {
		this.swampMap = new String[this.size][this.size];
		for (int i = 0; i < swampMap.length; i++) {
			for (int j = 0; j < swampMap.length; j++) {

				//myText.test(i,j);
				
				swampMap[i][j] = "0";
				
				// System.out.println(swampMap[i][j]);
			}

			// public void getSwamp(int vXPos, int vYPos){
			//
			// swampMap[vXPos][vYPos] = "0";
			// swampMap[][]="P";
			// }

		}
	}
}