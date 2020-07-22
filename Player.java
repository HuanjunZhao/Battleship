/**
 * Battleship (Player Class): Skeleton
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
	
	public void placeShip() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an x-coordinate for CARRIER");
		int x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for CARRIER");
		int y = input.nextInt();
		
		Ship carrier = new Ship(ShipType.CARRIER, x, y, this); //copy for all ship types
		
		ships[0] = carrier;
		
		playerBoard.addShip(carrier);
		playerBoard.display();
		
		System.out.println("Enter an x-coordinate for BATTLESHIP");
		x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for BATTLESHIP");
		y = input.nextInt();
		
		Ship battleship = new Ship(ShipType.BATTLESHIP, x, y, this);
	}
	
	public void guess() {
		
	}
	
	public void play() {
		//
		
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
	
	
}
