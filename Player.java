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
	private Board[] playerboard;
	
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
	
	private String getName() {
		return name;
	}

	private Board[] getPlayerboard() {
		return playerboard;
	}

	private void setPlayerboard(Board[] playerboard) {
		this.playerboard = playerboard;
	}
	
	public 
}
