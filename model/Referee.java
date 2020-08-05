package model;

import java.util.Scanner;
/**
 * This class will initialize the game and setup necessary environment for the player.
 * @author Huanjun Zhao 30102350
 *
 * 
 */

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
	
	/**
	 * Constructor for create Human VS Human game
	 * @param playerOne
	 * @param playerTwo
	 */
	public Referee(Player playerOne, Player playerTwo) {
		 this.playerOne =  playerOne;
		 this.playerTwo = playerTwo;
		 computerPlayer = null;
		 //this.playerOne.setOpponent(this.playerTwo);
		 //this.playerTwo.setOpponent(this.playerOne);
	}
	
	/**
	 * Constructor for create Human VS CPU game
	 * @param playerOne
	 * @param computerPlayer
	 */
	public Referee(Player playerOne, ComputerPlayer computerPlayer) {
		this.playerOne = playerOne;
		this.computerPlayer = computerPlayer;
		playerTwo = null;
		
		this.playerOne.setOpponent(this.computerPlayer);
		this.computerPlayer.setOpponent(this.playerOne);
		
		boardOne = new Board();
		boardTwo = new Board();
		this.playerOne.setPlayerBoard(boardOne);
        this.computerPlayer.setBoard(boardTwo);
		
	}
	
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
	 * Run the text-base game, set opponent, place the ship
	 * 
	 */
	public void runTheGame() {
		
		boolean opponentIsHuman = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to play BattleShip!");
		System.out.println();
		System.out.println("Would you like to play with A friend?(y/n)");
		String opponentStatus = scan.next();
		
		if (opponentStatus.equalsIgnoreCase("n") ||
				opponentStatus.equalsIgnoreCase("no")) {
			
			opponentIsHuman = false;
						
			playerOne.setOpponent(computerPlayer);
			computerPlayer.setOpponent(playerOne);
		}
		
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
			if(playerOne.getPlayerBoard().checkWinner()) {
				System.out.println("Computer won!");
				return;
			}
		}
	}
	
	/**
	 * Keep GUI game running
	 */
	public void runTheGUIGame() {		
		
		while(true) {
			playerOne.play();
			if(computerPlayer.getBoard().checkWinner()) {
				System.out.println("You have won!");
				return;
			}
			computerPlayer.play();
			if(playerOne.getPlayerBoard().checkWinner()) {
				System.out.println("Computer won!");
				return;
			}
		}
	}
}