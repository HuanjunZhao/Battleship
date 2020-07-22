/**
 * AI data for a computer player.
 * @author Tristan Richardson
 *@version Alpha
 */
import java.util.Random;
public class ComputerPlayer{
	
	private String name= "CPU";
	private Ship[] ships;
	private Player opponent;// code taken from Player class
	private Board board;
	
	public ComputerPlayer(ComputerPlayer toCopy) {
		this.name=toCopy.getName();
		this.ships=toCopy.getShips();
		this.opponent=toCopy.getOpponent();
		this.board=toCopy.getBoard();
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
	board
	public void setName(String newName) {
		name=new String (newName);
	}
	public void setOpponent(Player newOpponent) {
		opponent= new Player(newOpponent);
	}
	
	public void placeShip() { //Not currently functional
		do {
			this.getBoard().addShip();
		}
	}

	private Point guess() {
		Random random=new Random();
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		return new Point(guessX,guessY);
	}
	

}
