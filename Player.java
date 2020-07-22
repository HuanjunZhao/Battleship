/**
 * Battleship (Player Class): Skeleton
 * @author Taimur Rizwan
 *UCID: 30078941
 */
public class Player {
/**
 * Instance variables
 */
	
	private String name;
	private Ship[] ships;
	private Player opponent;
	private Board playerBoard;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void placeShip() {
		
	}
	
	public void guess() {
		
	}
	
	public void play(Point point, Player opponent) {
		
		
	}
	
	public void ComputerPlayer setOpponent(Player newOpponent) {
		this.opponent = newOpponent;
		
	}
	
	public void setPlayer(Player newPlayer) {
		this.name = newPlayer;
	}
	
	public String getName() {
		return name;
	}

	public Board getPlayerBoard() {
		return playerBoard;
	}

	public void setPlayerBoard(Board playerBoard) {
		this.playerBoard = playerBoard;
	}
	
	
}
