
public abstract class PlayerSlot {
	private boolean isPlayer;
	private String name;
	private Ship[] ships;
	private PlayerSlot opponent;// code taken from Player class
	private Board board;
	public abstract Ship shipConstructor(ShipType type,PlayerSlot opponent);
	public abstract Point guess();
	
	public PlayerSlot(Board board) {
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

	private void setName(String name) {
		this.name = name;
	}
	public void obtainShip() {
		Ship carrier = shipConstructor(ShipType.CARRIER, opponent); 
		ships[0] = carrier;
		board.addShip(carrier);
		if (isPlayer) board.display();
		
		Ship battleship = shipConstructor(ShipType.BATTLESHIP, opponent);
		ships[1] = battleship;
		board.addShip(battleship);
		if (isPlayer) board.display();
		
		Ship cruiser = shipConstructor(ShipType.CRUISER, opponent);
		ships[2] = cruiser;
		board.addShip(cruiser);
		if (isPlayer) board.display();
		
		Ship submarine = shipConstructor(ShipType.SUBMARINE, opponent);
		ships[3] = submarine;
		board.addShip(submarine);
		if (isPlayer) board.display();
		
		Ship destroyer = shipConstructor(ShipType.DESTROYER, opponent);
		ships[4] = destroyer;
		board.addShip(destroyer);
		System.out.println("CPU Board");
		board.display();
	}
	
	
	
}
