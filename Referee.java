import java.util.Scanner;


public class Referee {
	
	private Player playerOne;
	private Player playerTwo;
	private ComputerPlayer computerPlayer;
	private Board BoardOne; 
	private Board BoardTwo; 
	
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
		
		boolean opponentIsHuman = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to play BattleShip!");
		System.out.println();
		System.out.println("Would you like to play with A friend?(y/n)");
		String opponentStatus = scan.next();
		
		
		// Set the Second player is human or computer.
//		if (opponentStatus.equalsIgnoreCase("y") ||
//				opponentStatus.equalsIgnoreCase("yes")) {
//			
//			opponentIsHuman = true;
//			playerTwo = new Player();
//			
//			playerOne.setOpponent(playerTwo);
//			playerTwo.setOpponent(playerOne);
//		}
		
		if (opponentStatus.equalsIgnoreCase("n") ||
				opponentStatus.equalsIgnoreCase("no")) {
			
			opponentIsHuman = false;
						
			playerOne.setOpponent(computerPlayer);
			computerPlayer.setOpponent(playerOne);
		}
		
		//*** set board!
		// Set player one's name.
		System.out.println("Player one, please enter your name~");
		String playerOneName = scan.next();
		System.out.println("Player one, your name is: " + playerOneName);
		playerOne.setName(playerOneName);
		
		
		//if second player is human, set player two's name
//		if (opponentIsHuman == true) {
//			System.out.println("Player two, please enter your name~");
//			String playerTwoName = scan.next();
//			System.out.println("Player one, your name is: " + playerTwoName);
//			playerTwo.setName(playerTwoName);
//			
//			for (int i = 0; i < 5; i++ ) {	
//				playerOne.placeShip();
//				playerOne.getBoard().display();
//				playerTwo.placeShip();
//				playerTwo.getBoard().display();
//			}
//		}
//		else {
//			for (int i = 0; i < 5; i++ ) {	
//				playerOne.placeShip();
//				playerOne.getBoard().display();
//				getComputerPlayer().placeShip();	
//				getComputerPlayer().getBoard().display();
//			}
			
			System.out.println("Your opponent is A computer!");
			playerOne.placeShip();
//			computerPlayer.placeShip();
//		}
		
	}

	/**
	 * Deter
	 * @param player
	 * @param computerPlayer
	 * @param a
	 * @return
	 */
//	public boolean nextturn(Player player, ComputerPlayer computerPlayer, Point a) {
//		
//	}
	
	/**
	 * check who is the winner.
	 */
//	public boolean checkWinner() { 
//		
//		 if (playerTwo.getShips().isDestroped()) {
//	            System.out.println(playerOne.getName() + ", you WIN!");
//	            return true;
//	        }
//		 
//		 if (playerOne¡£getShips().isDestroped() == true) {
//			 System.out.println(playerTwo.getName() + ", you WIN!");
//			 return true;
//	        }
//	        
//		 if (computerPlayer¡£getShips().isDestroped() == true) {
//			 System.out.println("You lose!");
//			 return true;
//		 }
//		 return false;
//	}
//	
//	public boolean keepGameRunning() {
//		
//	}
//
//	
//	
}
