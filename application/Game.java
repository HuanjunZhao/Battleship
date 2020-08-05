package application;

import model.Board;
import model.ComputerPlayer;
import model.Player;
import model.Referee;
import java.util.Scanner;

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
		referee = new Referee();
	}
	
	/**
	 * Initializes the game by creating players
	 * and calling necessary functions in Referee.
	 */
	public void initializeGame() {
		Player playerOne = new Player();
		ComputerPlayer playerTwo = new ComputerPlayer();
		playerOne.setPlayerBoard(boardOne);
		playerTwo.setBoard(boardTwo);
		referee.setPlayerOne(playerOne);
		referee.setComputerPlayer(playerTwo);
		Scanner input = new Scanner(System.in);
		System.out.println("Player one, please enter your name~");
		String playerOneName = input.next();
		System.out.println("Player one, your name is: " + playerOneName);
		playerOne.setName(playerOneName);
		System.out.println("Your opponent is A computer!");
		input.close();
		referee.runTheGame();
	}
	
	public static void main(String [] args) {
		Game theGame = new Game();
		theGame.initializeGame();
	}
}
