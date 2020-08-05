package model;

import java.util.Scanner;

import model.ComputerPlayer;


public class Referee {
	
	private Player playerOne;
	private Player playerTwo;
	private ComputerPlayer computerPlayer;
	private Board boardOne; 
	private Board boardTwo; 
	
	/**
	 * Default constructor
	 */
	public Referee() {}
	
	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerOne = playerTwo;
	}
	
	public ComputerPlayer getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	/**
	 * run the game, set opponent, place the ship?
	 * enter the name .etc
	 */
	public void runTheGame() {
		
//		boolean opponentIsHuman = false;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Welcome to play BattleShip!");
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
//		
//		System.out.println("Player one, please enter your name~");
//		String playerOneName = scan.next();
//		System.out.println("Player one, your name is: " + playerOneName);
//		playerOne.setName(playerOneName);
//		System.out.println("Your opponent is A computer!");
		
		computerPlayer.placeShip();
		//playerOne.placeShip();
		
//		while(playerOne.getShips()[4] != null) {
//			//playerOne.play();
//			if(computerPlayer.getBoard().checkWinner()) {
//				System.out.println("You have won!");
//				return;
//			}
//			//computerPlayer.play();
//			if(playerOne.getPlayerBoard().checkWinner()) {
//				System.out.println("Computer won!");
//				return;
//			}
//		}
	}
}