package TheTerrainSimulator;

public class Player {
	// A

	private String displayPlayer;
	public int xPos = Swamp.size / 2;
	public int yPos = Swamp.size / 2;
	public int xMove = 0;
	public int yMove = 0;

	// c
	public Player() {
		this.displayPlayer = "P";

	}

	// m

	public void placePlayer() {
		Swamp.swampMap[getPlayXPos() + xMove][getPlayYPos() + yMove] = getPlayer();
	}

	public String getPlayer() {
		return this.displayPlayer;
	}

	public int getPlayXPos() {
		return xPos;
	}

	public int getPlayYPos() {
		return yPos;
	}

	public void setPlayPos(int vXPos, int vYPos) {
		xPos = vXPos + xMove;
		yPos = vYPos + yMove;
	}

	public void North() {
		xMove = -1;
		yMove = 0;
		Swamp.swampMap[xPos][yPos] = "0";
		xPos = xPos + xMove;
		Swamp.swampMap[xPos][yPos] = getPlayer();

	}

	public void South() {
		xMove = 1;
		yMove = 0;
		Swamp.swampMap[xPos][yPos] = "0";
		xPos = xPos + xMove;
		Swamp.swampMap[xPos][yPos] = getPlayer();

	}

	public void West() {
		xMove = 0;
		yMove = -1;
		Swamp.swampMap[xPos][yPos] = "0";
		yPos = yPos + yMove;
		Swamp.swampMap[xPos][yPos] = getPlayer();
	}

	public void East() {
		xMove = 0;
		yMove = 1;
		Swamp.swampMap[xPos][yPos] = "0";
		yPos = yPos + yMove;
		Swamp.swampMap[xPos][yPos] = getPlayer();
	}

}
