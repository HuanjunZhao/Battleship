package model;


import java.util.Scanner;

/**
 * Battleship (Player Class): Beta version
 * Beta Changelog:
 * @author Taimur Rizwan
 *UCID: 30078941	(1st Iteration)<br>
 *Tristan Richardson UCID:30076898 (connecting with PlayerSlot abstract)
 *@version Beta
 */
/*
 * Beta changes:
 * - Made several adaptations for transfer to PlayerSlot.
 * - 
 */
public class Player extends PlayerSlot {
/**
 * Instance variables
 */
	/*private String name;
	private Ship[] ships;
	private ComputerPlayer opponent;
	private Board board;
	*///Variables moved to 
	
	public Player(Board board) {
		super("", board);
		isPlayer();
	}
	
	/**
	* we pass in the gameboard as a parameter to this function
	* make sure that the proper gameboard is passed in from wherever the main game is ran from (Game.java)
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

	@Override
	public Ship shipConstructor(ShipType type) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ship rotation. 0 being North, 90 being East, etc.");
		int rotation = input.nextInt();
		return new Ship(type, guess(), rotation);
	}

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
