/**
 * Skeleton for board class for battleships team battle royal
 * @author Joshua Fine, UCID 30011448
 * @version 1.0
 */
public class Board {
	
	private char[][] grid; 
							
	private Ship[] ships;
	
	private int numShips;
	
	public char[][] getGrid(){
		return grid; 
	}
	
	/**
	 * Creates 2D array for the board used for the text base application
	 */
	public Board() {
		grid = new char[10][10];
		for (int i = 0; i <10; i++) {
			for (int j=0; j<10; j++) {
				grid[i][j]= '~';
			}
		}
		ships = new Ship[5];

	}
	
	/**
	 * checkGuess will take a point as a parameter and checks to see if there is a ship(#) there.
	 * it will update the board to have an 'X' for hits and '?' for misses
	 * @param pointGuess: the point on the board which the user/player will use to guess if 
	 * a ship is present
	 * @return returns a boolean for if the guess was correct, true for hits, false for misses, 
	 * additionally it returns false if the guess is made on a point that does not exist on the board.
	 */
	public boolean checkGuess(Point pointGuess) {
		int rowGuess = pointGuess.getY();
		int colGuess = pointGuess.getX();
		//returns if the guess is valid and whether the guess is a location with a ship
		if ((rowGuess < getGrid().length) && (colGuess < getGrid().length)){
			for(Ship ship : ships) {
				boolean returnResult = ship.attemptHit(new Point(colGuess, rowGuess));
				if(returnResult) {
					grid[colGuess][rowGuess] = 'X';
					return true;
				}
			}
			grid[colGuess][rowGuess] = '?';
		} else {
			System.out.println("Not a space on the board!");
		}
		return false;
	}
	
	/**
	 * Takes the ship class and decides if the point of origin of the ship is a valid placement.
	 * 
	 * @param shipAdded: the ship to add, it will be of type ship and should contain a point of origin
	 * as well as a player (String) associated with the ship 
	 * @return returns a boolean for valid ship placement, true for valid and false for invalid
	 */
	public boolean addShip(Ship shipAdded) {
		int xCoord = shipAdded.getOrigin().getX(); 
		int yCoord = shipAdded.getOrigin().getY(); 
		updateGrid();
		Point[] points = shipAdded.getShipCoords();
		for(Point p : points) {
			if(getGrid()[p.getX()][p.getY()] == '#')
				return false;
		}
		//addShip determines if ship placement is valid
		if ((xCoord < getGrid().length) && (yCoord < getGrid().length)){
			if (getGrid()[xCoord][yCoord] == '~'){
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
	
	/**
	 * updates the board/grid object after rotating ships, adding ships, and guesses.
	 */
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
	
	/**
	 * displays the board with a legend for points coordinates
	 */
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
	
	public void displayToOpponent() {
		updateGrid();
		System.out.println("\n" + "\t" + "0 1 2 3 4 5 6 7 8 9" +"\n");
		
		for (int row=0; row<getGrid().length; row++) {
			System.out.print(row + "\t");
			for (int col=0; col<getGrid()[row].length; col++) {
				char c = getGrid()[col][row];
				if(c == '#')
					c = '~';
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}
	
	//display winner message?
	public boolean checkWinner() {
		for(Ship ship : ships) {
			if(ship.isDestroyed() == false)
				return false;
		}
		return true;
	}

}
