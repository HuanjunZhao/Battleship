
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
	
	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void setName(String name) {
		this.name = name;
	}
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
			if (isPlayer) board.display();
		} while(!board.addShip(carrier));
		do {
			do {
				battleship = shipConstructor(ShipType.BATTLESHIP);
			} while(battleship.getLength() == -1);
			ships[1] = battleship;
			if (isPlayer) board.display();
		} while(!board.addShip(battleship));
		do {
			do {
				cruiser = shipConstructor(ShipType.CRUISER);
			} while(cruiser.getLength() == -1);
			ships[2] = cruiser;
			if (isPlayer) board.display();
		} while(!board.addShip(cruiser));
		do {
			do {
				submarine = shipConstructor(ShipType.SUBMARINE);
			} while(submarine.getLength() == -1);
			ships[3] = submarine;
			if (isPlayer) board.display();
		} while(!board.addShip(submarine));
		do {
			do {
				destroyer = shipConstructor(ShipType.DESTROYER);
			} while(destroyer.getLength() == -1);
			ships[4] = destroyer;
			if (isPlayer) board.display();
		} while(!board.addShip(destroyer));
		System.out.println(name+" Board");
		board.display();
		/*
		ships[1] = battleship;
		board.addShip(battleship);
		
		
		cruiser = shipConstructor(ShipType.CRUISER);
		
		ships[2] = cruiser;
		board.addShip(cruiser);
		if (isPlayer) board.display();
		
		submarine = shipConstructor(ShipType.SUBMARINE);
		
		ships[3] = submarine;
		board.addShip(submarine);
		if (isPlayer) board.display();
		
		destroyer = shipConstructor(ShipType.DESTROYER);
		
		ships[4] = destroyer;
		board.addShip(destroyer);
		System.out.println("CPU Board");
		board.display();*/
	}
	
	
	
}
