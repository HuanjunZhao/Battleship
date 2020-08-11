package model;

public abstract class PlayerSlot {
	private boolean isPlayer;
	private String name;
	private Ship[] ships;
	private PlayerSlot opponent;
	private Board board;
	public abstract Ship shipConstructor(ShipType type);
	public abstract Point guess();
	
	/** 
	 * Constructor for a playerslot object
	 * @param name name of the player
	 * @param board the player's board
	 */
	public PlayerSlot(String name, Board board) {
		this.name=name;
		this.ships = new Ship[5];
		setBoard(board);
	}	
	
	/**
	 * Returns whether the player is a human or not.
	 */
	public void isPlayer() {
		isPlayer = true;
	}
	
	/**
	 * Setter for the player's opponent
	 * @param newOpponent the player's opponent
	 */
	public void setOpponent(PlayerSlot opponent) {
		this.opponent = opponent;
	}
	
	/**
	 * Getter for the player's opponent
	 * @return the player's opponent PlayerSlot object
	 */
	public PlayerSlot getOpponent() {
		return opponent;
	}
	
	/**
	 * Getter for the player's name
	 * @return player's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the player's board
	 * @return player's board
	 */
	public Board getBoard() {
		return board;
	}
	
	/**
	 * Getter for the player's ships
	 * @return an array of the player's ships
	 */
	public Ship[] getShips() {
		return ships;
	}

	/**
	 * Setter for player's board
	 * @param board the player's board object
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
	
	/**
	 * Setter for the player's name
	 * @param name a string containing the player's name
	 */
	public void setName(String name) {
		this.name = new String(name);
	}
	
	/**
	 * Function to get the player to place ships
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
	
	public abstract void play();
}
