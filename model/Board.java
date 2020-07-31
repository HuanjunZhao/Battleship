package model;

public class Board {
	
	private char[][] grid; 
							
	private Ship[] ships;
	
	private int numShips;
	
	public char[][] getGrid(){
		return grid; 
	}
			
	public Board() {
		grid = new char[10][10];
		for (int i = 0; i <10; i++) {
			for (int j=0; j<10; j++) {
				grid[i][j]= '~';
			}
		}
		ships = new Ship[5];

	}
	
	
	public boolean checkGuess(Point pointGuess) {
		int rowGuess = pointGuess.getY();
		int colGuess = pointGuess.getX();
		//returns if the guess is valid and whether the guess is a location with a ship
		if ((rowGuess < getGrid().length) && (colGuess < getGrid().length)){
			if (getGrid()[rowGuess][colGuess] == '#') {
				System.out.println("		HIT");
				getGrid()[rowGuess][colGuess] = 'X';
				return true;
	
			}
			else {
				System.out.println("		MISS");
				getGrid()[rowGuess][colGuess] = '?';
				return false;

			}
		}
		else  {
			System.out.println("Not a space on board");
			return false;
		}
	}
	
	public boolean addShip(Ship shipAdded) {
		int xCoord = shipAdded.getOrigin().getX(); 
		int yCoord = shipAdded.getOrigin().getY(); 
		
		//addShip determines if ship placement is valid
		if ((xCoord < getGrid().length) && (yCoord < getGrid().length)){
			if (getGrid()[xCoord][yCoord] == '~'){
				//TODO figure out how to add ships (#) after valid placement is determined
				ships[numShips] = shipAdded;
				numShips++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	private void updateGrid() {
		for (int i = 0; i <10; i++) {
			for (int j=0; j<10; j++) {
				if (grid[i][j] ==  '#') {
					grid[i][j] = '~';
				}
					
			}
		}

		for (Ship shipObject: ships) {
			if (shipObject == null) {
				return;
			}
			Point[] shipLocations = shipObject.getShipCoords();
			for (Point shipPoint: shipLocations) {
				if(grid[shipPoint.getX()][shipPoint.getY()] == '~') {
					grid[shipPoint.getX()][shipPoint.getY()] = '#';
				}
		
			}
		}
	}
	
	
	public void display() {
		updateGrid();
		System.out.println("\n" + "\t" + "0 1 2 3 4 5 6 7 8 9" +"\n");
		
		for (int row=0; row<getGrid().length; row++) {
			System.out.print(row + "\t");
			for (int col=0; col<getGrid()[row].length; col++) {
				System.out.print(getGrid()[col][row]+" ");
			}
			System.out.println();
		}
	}
	
	//display winner message?
	public boolean checkWinner() {
		return false;
	}
	
	//display headers for each board, I.E. "player X ships", "enemy waters"?
	public void displayHeaders() {
	}

}
