package model;


import java.util.Scanner;

/**
 * Battleship (Player Class): Final version
 * Beta Changelog:
 * @author Taimur Rizwan
 *UCID: 30078941	(Final Iteration)<br>
 *Tristan Richardson UCID:30076898 (connecting with PlayerSlot abstract)
 *@version Final
 */
/*
 * Final changes:
 * - Made several adaptations for transfer to PlayerSlot.
 * - 
 */
public class Player extends PlayerSlot {


	public Player(Board board) {
		super("", board);
		isPlayer();
	}
	
	/**
	* we pass in the gameboard as a parameter to this function
	* make sure that the proper gameboard is passed in from Game.java
	* and then that will allow you to use the checkGuess function
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
 * rotation stores the user input as an integer to pass to onto
 * Ship.java to rotate the ship
 */
	@Override
	public Ship shipConstructor(ShipType type) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ship rotation. 0 being North, 90 being East, etc.");
		int rotation = input.nextInt();
		return new Ship(type, guess(), rotation);
	}
/**
 * x,y coordinates are used to choose a place to attack
 * passed as a new Point 
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