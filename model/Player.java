package model;
/**
 * Battleship (Player Class): Alpha
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
	
	public void setName(String name) {
		this.name = name;
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
