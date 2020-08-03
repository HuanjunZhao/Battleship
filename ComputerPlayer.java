/**
 * AI data for a computer player.
 * @author Tristan Richardson
 *@version Alpha
 */
import java.util.Random;
public class ComputerPlayer{
	
	private String name;
	private Ship[] ships;
	private Player opponent;// code taken from Player class
	private Board board;
	
	public ComputerPlayer() {
		this.name="CPU";
		this.ships=new Ship[5];
	}
		
	public String getName() {
		return name;
	}
	public Ship[] getShips() {
		return ships;
	}
	public Player getOpponent() {
		return opponent;
	}
	public Board getBoard() {
		return board;
	}
	public void setName(String newName) {
		name=new String (newName);
	}
	
	public void setOpponent(Player newOpponent) {
		opponent=newOpponent;
	}
	public void setBoard(Board insertBoardHere) {
		board=insertBoardHere;
	}
	
	public void placeShip() { //currently functional
		
		Ship carrier;
		Ship battleship;
		Ship cruiser;
		Ship submarine;
		Ship destroyer;
		do {
			do {
				carrier = new Ship(ShipType.CARRIER, guess());
			} while(carrier.getLength() == -1);
			ships[0] = carrier;
		} while(!board.addShip(carrier));
		do {
			do {
				battleship = new Ship(ShipType.BATTLESHIP, guess());
			} while(battleship.getLength() == -1);
			ships[1] = battleship;
		} while(!board.addShip(battleship));
		do {
			do {
				cruiser = new Ship(ShipType.CRUISER, guess());
			} while(cruiser.getLength() == -1);
			ships[2] = cruiser;
		} while(!board.addShip(cruiser));
		do {
			do {
				submarine = new Ship(ShipType.SUBMARINE, guess());
			} while(submarine.getLength() == -1);
			ships[3] = submarine;
		} while(!board.addShip(submarine));
		do {
			do {
				destroyer = new Ship(ShipType.DESTROYER, guess());
			} while(destroyer.getLength() == -1);
			ships[4] = destroyer;
		} while(!board.addShip(destroyer));
		System.out.println("CPU Board");
		board.display();
	}

	public void play() {
		if(opponent.getPlayerBoard().checkGuess(new Point(guess()))) {
			System.out.println("Computer Hit!");
		} else {
			System.out.println("Computer Missed!");
		}
		opponent.getPlayerBoard().display();
	}
	
	private Point guess() {
		Random random=new Random();
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		return new Point(guessX,guessY);
	}
	

}
