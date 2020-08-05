package model;

import java.util.Scanner;
/**
 * This class will initialize the game and setup necessary environment for the player.
 * @author Huanjun Zhao 30102350
 *
 * 
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
	
	public PlayerSlot getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	public PlayerSlot getPlayerTwo() {
		return computerPlayer;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerOne = playerTwo;
	}
	
	public PlayerSlot getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	/**
	 * Run the text-base game, set opponent, place the ship
	 * 
	 */
	public void runTheGame() {
		
//		boolean opponentIsHuman = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to play BattleShip!");
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
//		while(true) {
//			playerOne.play();
//			if(computerPlayer.getBoard().checkWinner()) {
//				System.out.println("You have won!");
//				return;
//			}
//			computerPlayer.play();
//			if(playerOne.getBoard().checkWinner()) {
//				System.out.println("Computer won!");
//				return;
//			}
//		}
	}
}