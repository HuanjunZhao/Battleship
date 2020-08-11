package model;


import java.util.Scanner;

/**
 * Battleship (Player Class): Beta version
 * Beta Changelog:
 * @author Taimur Rizwan
 * UCID: 30078941	(1st Iteration)<br>
 * Tristan Richardson UCID:30076898 (connecting with PlayerSlot abstract)
 *@version Beta
 */

public class Player extends PlayerSlot {
	
	/**
	 * Constructor for a player object
	 * @param board the player's board object
	 */
	public Player(Board board) {
		super("", board);
		isPlayer();
	}
	
	/**
	 * Overridden play function from the playerslot class
	 */
	@Override
	public void play() {
		System.out.println("Select a coordinate to attack!");
		if(getOpponent().getBoard().checkGuess(guess())) {
			System.out.println("You Hit!");
		} else {
			System.out.println("You Missed!");
		}
		getOpponent().getBoard().displayToOpponent();
	}

	/**
	 * Overridden ship connstructor method from the playerSlot class
	 * Asks users for input to place ships
	 */
	@Override
	public Ship shipConstructor(ShipType type) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ship rotation. 0 being North, 90 being East, etc.");
		int rotation = input.nextInt();
		return new Ship(type, guess(), rotation);
	}

	/**
	 * Overridden guess method from the playerSlot class
	 * Takes input from the user
	 */
	@Override
	public Point guess() {
		Scanner coord = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = coord.nextInt();
		System.out.println("Enter y: ");
		int y = coord.nextInt();
		return new Point(x, y);
	}

}
