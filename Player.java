/**
 * Battleship (Player Class): Beta
 * @author Taimur Rizwan
 *UCID: 30078941
 */
import java.util.Scanner;



public class Player {
/**
 * Instance variables
 */

	private String name;
	private Ship[] ships;
	private ComputerPlayer opponent;
	private Board playerBoard;
	
	
	public Player() {
		this.ships = new Ship[5];
	}
	/**
	 * Input for each ship type
	 */
	public void placeShip() {
		Ship carrier;
		Ship battleship;
		Ship cruiser;
		Ship submarine;
		Ship destroyer;
		
		int x, y;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Do you want to rotate the next ship? (1 for yes, 0 for no)");
			int rotate = input.nextInt();
			
			System.out.println("Enter an x-coordinate for CARRIER");
			x = input.nextInt();
			
			System.out.println("Enter an y-coordinate for CARRIER");
			y = input.nextInt();
			
			carrier = new Ship(ShipType.CARRIER, x, y); 
			if(rotate == 1)
				carrier.rotateShip();
		} while (carrier.getLength() == -1);
		
		ships[0] = carrier;
		
		playerBoard.addShip(carrier);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		do {
			System.out.println("Do you want to rotate the next ship? (1 for yes, 0 for no)");
			int rotate = input.nextInt();
			System.out.println("Enter an x-coordinate for BATTLESHIP");
			x = input.nextInt();
			
			System.out.println("Enter an y-coordinate for BATTLESHIP");
			y = input.nextInt();
			
			battleship = new Ship(ShipType.BATTLESHIP, x, y);
			if(rotate == 1)
				battleship.rotateShip();
		} while (battleship.getLength() == -1);
		ships[1] = battleship;
		
		playerBoard.addShip(battleship);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		do {
			System.out.println("Do you want to rotate the next ship? (1 for yes, 0 for no)");
			int rotate = input.nextInt();
			System.out.println("Enter an x-coordinate for CRUISER");
			x = input.nextInt();
					
			System.out.println("Enter an y-coordinate for CRUISER");
			y = input.nextInt();
					
			cruiser = new Ship(ShipType.CRUISER, x, y);
			if(rotate == 1)
				cruiser.rotateShip();
		} while (cruiser.getLength() == -1);	
		ships[2] = cruiser;
				
		playerBoard.addShip(cruiser);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		do {
			System.out.println("Do you want to rotate the next ship? (1 for yes, 0 for no)");
			int rotate = input.nextInt();
			System.out.println("Enter an x-coordinate for SUBMARINE");
			x = input.nextInt();
					
			System.out.println("Enter an y-coordinate for SUBMARINE");
			y = input.nextInt();
					
			submarine = new Ship(ShipType.SUBMARINE, x, y);
			if(rotate == 1)
				submarine.rotateShip();
		} while (submarine.getLength() == -1);
		ships[3] = submarine;
				
		playerBoard.addShip(submarine);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		do {
			System.out.println("Do you want to rotate the next ship? (1 for yes, 0 for no)");
			int rotate = input.nextInt();
			System.out.println("Enter an x-coordinate for DESTROYER");
			x = input.nextInt();
					
			System.out.println("Enter an y-coordinate for DESTROYER");
			y = input.nextInt();
					
			destroyer = new Ship(ShipType.DESTROYER, x, y);
			if(rotate == 1)
				destroyer.rotateShip();
		} while (destroyer.getLength() == -1);
		ships[4] = destroyer;
				
		playerBoard.addShip(destroyer);
		playerBoard.display();
		
	}
	

	
	@SuppressWarnings("resource")
	/**
	* we pass in the gameboard as a parameter to this function
	* make sure that the proper gameboard is passed in from wherever the main game is ran from (Game.java)
	* and then that will allow you to use the checkGuess function
	*/
	public void play() {
		
		Scanner attackCoord = new Scanner(System.in);
		
		System.out.println("Select a coordinate to attack!");
		
		System.out.println("Enter x: ");
		int x = attackCoord.nextInt();
		
		System.out.println("Enter y: ");
		int y = attackCoord.nextInt();
		
		if(opponent.getBoard().checkGuess(new Point(x, y))) {
			System.out.println("You Hit!");
		} else {
			System.out.println("You Missed!");
		}
		opponent.getBoard().displayToOpponent();
	}
	

	public void setOpponent(ComputerPlayer newOpponent) {
		this.opponent = newOpponent;
		
	}
	

	public String getName() {
		return name;
	}

	public Board getPlayerBoard() {
		return playerBoard;
	}

	public void setPlayerBoard(Board playerBoard) {
		this.playerBoard = playerBoard;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
