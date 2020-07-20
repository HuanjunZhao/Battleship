/**
 * Skeleton for Game class for battleships team battle royal
 * @author Dillon Sahadevan, UCID 30075927
 * @version 1.0
 */
public class Game {
	private Board board;
	private Referee referee;
	
	/**
	 * Default constructor for game class
	 */
	public Game() {
		board = new Board();
		referee = new Referee();
	}
	
	/**
	 * Initializes the game by creating players
	 * and calling necessary functions in Referee.
	 */
	public void initializeGame() {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		referee.setPlayerOne(playerOne);
		referee.setPlayerTwo(playerTwo);
		referee.setOpponents();
		referee.runTheGame();
	}
	
	public static void main(String [] args) {
		Game theGame = new Game();
		game.initializeGame();
	}
}
