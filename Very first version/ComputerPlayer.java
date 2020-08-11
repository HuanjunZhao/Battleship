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
	/*The same code as in Player, except randomized.
	When we're ready for inheritance, much of this method will be its own method in Player
	for which this class will override selections with a randomizer.
	*/
	public void placeShip() {
		Ship carrier = new Ship(ShipType.CARRIER, guess(), opponent); 
		ships[0] = carrier;
		board.addShip(carrier);
		
		Ship battleship = new Ship(ShipType.BATTLESHIP, guess(), opponent);
		ships[1] = battleship;
		board.addShip(battleship);
		
		Ship cruiser = new Ship(ShipType.CRUISER, guess(), opponent);
		ships[2] = cruiser;
		board.addShip(cruiser);
		
		Ship submarine = new Ship(ShipType.SUBMARINE, guess(), opponent);
		ships[3] = submarine;
		board.addShip(submarine);
		
		Ship destroyer = new Ship(ShipType.DESTROYER, guess(), opponent);
		ships[4] = destroyer;
		board.addShip(destroyer);
		System.out.println("CPU Board");
		board.display();
	}

	private Point guess() {
		Random random=new Random();
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		return new Point(guessX,guessY);
	}
	

}
