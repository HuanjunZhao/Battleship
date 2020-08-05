package model;

import model.ComputerPlayer;


public class Referee {
	
	private Player playerOne;
	private Player playerTwo;
	private ComputerPlayer computerPlayer;

	
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
		computerPlayer.placeShip();
		playerOne.placeShip();
		
		while(playerOne.getShips()[4] != null) {
			//playerOne.play();
			if(computerPlayer.getBoard().checkWinner()) {
				System.out.println("You have won!");
				return;
			}
			//computerPlayer.play();
			if(playerOne.getPlayerBoard().checkWinner()) {
				System.out.println("Computer won!");
				return;
			}
		}
	}
}