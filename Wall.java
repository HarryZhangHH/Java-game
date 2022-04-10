package Snake;

class Wall {
	static final int MAX_NUMBER_OF_ELEMENT = 500;
	AppleOrWall[] wall;
	int wallLen;

	Wall(){
		wall = new AppleOrWall[MAX_NUMBER_OF_ELEMENT];
		wallLen = 0;
	}
	
	void addWall(AppleOrWall newWall) {
		wall[wallLen] = newWall;
		wallLen ++;
	}
}
