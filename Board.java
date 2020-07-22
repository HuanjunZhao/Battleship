
public class Board {
	
	private char[][] grid ={{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
							{'~', '~', '~', '~', '~', '~', '~', '~', '~', '~'}};
							
	private Ship[] ships;
	
	public char[][] getGrid(){
		return grid; 
	}
	
	public boolean checkGuess(int rowGuess, int colGuess) {
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
	
	public boolean addShip(Ship ship ,int xCoord, int yCoord) {
		//addShip determines if ship placement is valid
		if ((xCoord < getGrid().length) && (yCoord < getGrid().length)){
			if (getGrid()[xCoord][yCoord] == '~'){
				//TODO figure out how to add ships (#) after valid placement is determined
				getGrid()[xCoord][yCoord] = '#'; //placeholder for the origin(?) from Ship class
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
	
	
	public void display() {
		System.out.println("\n" + "\t" + "A B C D E F G H I J" +"\n");
		
		for (int row=0; row<getGrid().length; row++) {
			System.out.print(row+1 + "\t");
			for (int col=0; col<getGrid()[row].length; col++) {
				System.out.print(getGrid()[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	//display winner message?
	public boolean checkWinner() {
		return false;
	}
	
	//display headers for each board, I.E. "player X ships", "enemy waters"?
	public String displayHeaders() {
		return "";
	}

	public static void main(String[] args) {

	}

}
