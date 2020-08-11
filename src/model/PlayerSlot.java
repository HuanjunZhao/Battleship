package model;
/**
 * Parent class for Player and ComputerPlayer. Contains all methods shared between the classes. 
 * Methods in this class are for making sure that the player and computer player follow the same rules.
 * @author Tristan Richardson (30076898)
 * @team C2
 * @version Final Iteration
 */
public abstract class PlayerSlot {
	private boolean isPlayer;
	private String name;
	private Ship[] ships;
	private PlayerSlot opponent;// code taken from Player class
	private Board board;
	public abstract Ship shipConstructor(ShipType type);
	public abstract Point guess();
	
	public PlayerSlot(String name, Board board) {
		this.name=name;
		this.ships = new Ship[5];
		setBoard(board);
	}	
	
	/*getters and setters from player class (iteration 1)*/
	public void setOpponent(ComputerPlayer newOpponent) {
		this.opponent = newOpponent;	
	}
	
	public void isPlayer() {
		isPlayer = true;
	}
	
	public void setOpponent(PlayerSlot opponent) {
		this.opponent = opponent;
	}
	
	public PlayerSlot getOpponent() {
		return opponent;
	}
	
	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}
	
	public Ship[] getShips() {
		return ships;
	}
	
	public void setShip(Ship [] ships) {
		this.ships = ships;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Ship placement algorithm. This method takes data from ShipType and processes the player's ship placement using the abstract method shipConstructor in the inheriting classes.
	 * While attempts to place ships fail due to a ship being out of bounds or overlapping with another ship, it will retry its ship placement. 
	 * No exceptions are thrown in the event of a failed ship placement.
	 * <p> Uses abstract method shipConstructor(ShipType type) in class Player and ComputerPlayer.
	 */
	public void placeShip() {

		Ship carrier;
		Ship battleship;
		Ship cruiser;
		Ship submarine;
		Ship destroyer;
		do {
			do {
				carrier = shipConstructor(ShipType.CARRIER); 
			} while(carrier.getLength() == -1);
			ships[0] = carrier;
		} while(!board.addShip(carrier));
		if (isPlayer) board.display();
		do {
			do {
				battleship = shipConstructor(ShipType.BATTLESHIP);
			} while(battleship.getLength() == -1);
			ships[1] = battleship;
		} while(!board.addShip(battleship));
		if (isPlayer) board.display();
		do {
			do {
				cruiser = shipConstructor(ShipType.CRUISER);
			} while(cruiser.getLength() == -1);
			ships[2] = cruiser;
		} while(!board.addShip(cruiser));
		if (isPlayer) board.display();
		do {
			do {
				submarine = shipConstructor(ShipType.SUBMARINE);
			} while(submarine.getLength() == -1);
			ships[3] = submarine;
		} while(!board.addShip(submarine));
		if (isPlayer) board.display();
		do {
			do {
				destroyer = shipConstructor(ShipType.DESTROYER);
			} while(destroyer.getLength() == -1);
			ships[4] = destroyer;
		} while(!board.addShip(destroyer));
		System.out.println(name+" Board");
		board.display();
	}
	/**
	 * Method for for a player's turn. Creates a guess, provides feedback on the hit, passes to the opponent.
	 */
	public abstract void play();
}
