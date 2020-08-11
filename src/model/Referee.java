package model;

import java.util.Scanner;
/**
 * This class will initialize the game and setup necessary environment for the player.
 * @author Huanjun Zhao 30102350
 */

public class Referee {
	
	private PlayerSlot playerOne;
	private PlayerSlot computerPlayer;
	
	/**
	 * Constructor for create Human VS Human game
	 * @param playerOne
	 * @param playerTwo
	 */
	public Referee(PlayerSlot playerOne, PlayerSlot playerTwo) {
		 this.playerOne =  playerOne;
		 computerPlayer = playerTwo;
		 this.playerOne.setOpponent(this.computerPlayer);
		 this.computerPlayer.setOpponent(this.playerOne);
	}
	
	/**
	 * Getter for the first player slot
	 * @return the first player
	 */
	public PlayerSlot getPlayerOne() {
		return playerOne;
	}

	/**
	 * Setter for the first player slot
	 * @param playerOne a playerSlot's child object
	 */
	public void setPlayerOne(PlayerSlot playerOne) {
		this.playerOne = playerOne;
	}
	
	/**
	 * Getter for the second player slot
	 * @return the second player
	 */
	public PlayerSlot getPlayerTwo() {
		return computerPlayer;
	}

	/**
	 * Setter for the second player slot
	 * @param playerTwo a playerSlot's child object
	 */
	public void setPlayerTwo(PlayerSlot playerTwo) {
		this.computerPlayer = playerTwo;
	}
	
	/**
	 * Run the text-base game, set opponent, place the ship
	 */
	public void runTheGame() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to play BattleShip!");
		System.out.println("Player one, please enter your name~");
		String playerOneName = scan.next();
		System.out.println("Player one, your name is: " + playerOneName);
		playerOne.setName(playerOneName);
		System.out.println("Your opponent is A computer!");
		
		computerPlayer.placeShip();
		playerOne.placeShip();
		while(true) {
			playerOne.play();
			if(computerPlayer.getBoard().checkWinner()) {
				System.out.println("You have won!");
				return;
			}
			computerPlayer.play();
			if(playerOne.getBoard().checkWinner()) {
				System.out.println("Computer won!");
				return;
			}
		}
	}
	
	/**
	 * Keep GUI game running
	 */
	public void runTheGUIGame() {		
		computerPlayer.placeShip();
	}
}