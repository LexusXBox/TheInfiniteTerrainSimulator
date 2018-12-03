package TheTerrainSimulator;

import java.util.Random;

public class Swamp {


	
	// A
	public static int size = 254;
	public static String[][] swampMap;
	public int numberOfFeatures = 5;
	public int view = 9;
	//	int small = size/2-view/2;
	//	int large = size/2+view/2;
	
	// C

	
	public void placeFeature() {

		Random rand = new Random();
		Feature featured = new Feature();
		for (int k=0;k<numberOfFeatures;k++) {
		swampMap[rand.nextInt(this.size)][rand.nextInt(this.size)] = featured.getFeature();
		for (int i = 0; i < this.size -1; i++) {
			for (int j = 0; j < this.size -1; j++) {
				//System.out.print(swampMap[i][j]);
			}
		}
		//System.out.println();
		}
		
	}
//	public void placePlayer() {
//		
//		//Player playChar = new Player();
//		swampMap[getPlayXPos()][this.getPlayYPos()] = this.getPlayer();
//	//	for (int i = 0; i < this.size -1; i++) {
//	//		for (int j = 0; j < this.size -1; j++) {
//				
//	//			System.out.print(swampMap[i][j]);
//		//}
//		//System.out.println();
//		//}
//		
//	}
	
	// M
	public void printing(int vXPos, int vYPos) {
		int north = vYPos+view/2;
		int south = vYPos-view/2;
		int east = vXPos+view/2;
		int west = vXPos-view/2;
		for (int i = south; i < north; i++) {
			for (int j = west; j < east; j++) {
				 System.out.print(swampMap[i][j]);
			}
			System.out.println();
		}
	}

	public void populateSwamp() {
		this.swampMap = new String[this.size][this.size];
		for (int i =0 ; i < swampMap.length; i++) {
			for (int j = 0; j < swampMap.length; j++) {
				swampMap[i][j] = "0";
				// System.out.println(swampMap[i][j]);
			}

//	public void getSwamp(int vXPos, int vYPos){
//		
//		swampMap[vXPos][vYPos] = "0";
//		swampMap[][]="P";
//	}
		
		}
	}
}