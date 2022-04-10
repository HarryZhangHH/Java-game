package Snake;

class ArrayOfCoordinate {
	CoordinatesOfSnake[] snake;
	static final int MAX_NUMBER_OF_ELEMENT = 1000;
	CoordinatesOfSnake apple;
	int snakeLen;
	
	ArrayOfCoordinate(){
		snake = new CoordinatesOfSnake[MAX_NUMBER_OF_ELEMENT];  
		apple = null; 
		snakeLen = 0;
	}
	
	void addHeads(int x, int y) {
		CoordinatesOfSnake newCoordinate = new  CoordinatesOfSnake(x,y);
		CoordinatesOfSnake[] newSnake = new CoordinatesOfSnake[1 + snake.length];
		newSnake[0] = newCoordinate;
		for  (int i = 0; i < snake.length; i++) {
			newSnake[i+1] = snake[i];
 		}
		snake = newSnake;
	}
	
	void appleEaten() {
		apple = null;
	}
	
	void deleteTail() {
		snake[snakeLen] = null;
	}
	

}
