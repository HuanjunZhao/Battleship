package model;

import java.util.Scanner;
/**
 * This class will initialize the game and setup necessary environment for players.
 * @author Huanjun Zhao, UCID 30102350
 *
 * @version 3.8
 */

public class Referee {
	
	private PlayerSlot playerOne;
	private PlayerSlot computerPlayer;
	
	/**
	 * Constructor for create a game.
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
	 * Get PlayerOne
	 * @return playerOne
	 */
	public PlayerSlot getPlayerOne() {
		return playerOne;
	}

	/**
	 * Set playerOne
	 * @param playerOne
	 */
	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	/**
	 * Get PlayerTwo
	 * @return playerTwo
	 */
	public PlayerSlot getPlayerTwo() {
		return computerPlayer;
	}

	/**
	 * Set playerTwo
	 * @param playerTwo
	 */
	public void setPlayerTwo(Player playerTwo) {
		this.computerPlayer = playerTwo;
	}
	
	/**
	 * Get ComputerPlayer
	 * @return newComputerPlayer
	 */
	public PlayerSlot getComputerPlayer() {
		return computerPlayer;
	}

	/**
	 * Set ComputerPlayer
	 * @param newComputerPlayer
	 */
	public void setComputerPlayer(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	/**
	 * Run the text-base game, set opponent, place the ship
	 * call necessary functions.
	 * 
	 */
	public void runTheGame() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to play BattleShip!");

		//This part will enable when we implement the human VS human version.
//		System.out.println();
//		System.out.println("Would you like to play with A friend?(y/n)");
//		String opponentStatus = scan.next();
//		
//		if (opponentStatus.equalsIgnoreCase("n") ||
//				opponentStatus.equalsIgnoreCase("no")) {
//			
//			opponentIsHuman = false;
//						
//			playerOne.setOpponent(computerPlayer);
//			computerPlayer.setOpponent(playerOne);
//		}
		
		//Set player Name
		System.out.println("Player one, please enter your name~");
		String playerOneName = scan.next();
		System.out.println("Player one, your name is: " + playerOneName);
		playerOne.setName(playerOneName);
		System.out.println("Your opponent is A computer!");
		
		// Set ships ready.
		computerPlayer.placeShip();
		playerOne.placeShip();
		
		//Keep game running until there is a winner.
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
	 * Set GUI game running
	 */
	public void runTheGUIGame() {		
		computerPlayer.placeShip();
	}
}