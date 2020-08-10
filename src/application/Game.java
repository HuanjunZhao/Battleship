package application;

import model.Board;
import model.ComputerPlayer;
import model.Player;
import model.Referee;

/**
 * Skeleton for Game class for battleships team battle royal
 * @author Dillon Sahadevan, UCID 30075927
 * @version 1.0
 */
public class Game {
	private Board boardOne;
	private Board boardTwo;
	private Referee referee;
	
	/**
	 * Default constructor for game class
	 */
	public Game() {
		boardOne = new Board();
		boardTwo = new Board();
	}
	
	/**
	 * Initializes the game by creating players
	 * and calling necessary functions in Referee.
	 */
	public void initializeGame() {
		Player playerOne = new Player(boardOne);
		ComputerPlayer playerTwo = new ComputerPlayer(boardTwo);
		referee = new Referee(playerOne, playerTwo);

		referee.runTheGame();
	}
	
	public static void main(String [] args) {
		Game theGame = new Game();
		theGame.initializeGame();
	}
}
