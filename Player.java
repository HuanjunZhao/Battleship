/**
 * Battleship (Player Class): Beta
 * @author Taimur Rizwan
 *UCID: 30078941
 */
import java.util.Scanner;



public class Player extends PlayerSlot {
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
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an x-coordinate for CARRIER");
		int x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for CARRIER");
		int y = input.nextInt();
		
		Ship carrier = new Ship(ShipType.CARRIER, x, y, this); 
		
		ships[0] = carrier;
		
		playerBoard.addShip(carrier);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for BATTLESHIP");
		x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for BATTLESHIP");
		y = input.nextInt();
		
		Ship battleship = new Ship(ShipType.BATTLESHIP, x, y, this);
		
		ships[1] = battleship;
		
		playerBoard.addShip(battleship);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for CRUISER");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for CRUISER");
		y = input.nextInt();
				
		Ship cruiser = new Ship(ShipType.CRUISER, x, y, this);
				
		ships[2] = cruiser;
				
		playerBoard.addShip(cruiser);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for SUBMARINE");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for SUBMARINE");
		y = input.nextInt();
				
		Ship submarine = new Ship(ShipType.SUBMARINE, x, y, this);
				
		ships[3] = submarine;
				
		playerBoard.addShip(submarine);
		playerBoard.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for DESTROYER");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for DESTROYER");
		y = input.nextInt();
				
		Ship destroyer = new Ship(ShipType.DESTROYER, x, y, this);
				
		ships[4] = destroyer;
				
		playerBoard.addShip(destroyer);
		playerBoard.display();
		
	}
	

	
	@SuppressWarnings("resource")
	/**
	* play()
	*/
	public void play() {
		
		Scanner attackCoord = new Scanner(System.in);
		
		System.out.println("Select a coordinate to attack!");
		
		System.out.println("Enter x: ");
		int x = attackCoord.nextInt();
		
		System.out.println("Enter y: ");
		int y = attackCoord.nextInt();
		
		opponent.getBoard().checkGuess(new Point(x, y));
		
		// if the point in the gameboard as the opoonent ship on there
//		if (opponent.getPlayerBoard().checkGuess(point)) {
//			// Get the ship at the point in the opponent player board
//			Ship curr = opponent.getPlayerBoard().getShipAtPoint(point);
//			// Attempt the hit to change the state of the ship at that point
//			curr.attemptHit(point);
//		}
//		return;
		
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

	private void setName(String name) {
		this.name = name;
	}
	
	
}
