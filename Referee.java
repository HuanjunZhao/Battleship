import java.util.Scanner;


public class Referee {
	
	private Player playerOne;
	private Player playerTwo;
	private Board newBoard; 
	
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
		if (opponentStatus.equalsIgnoreCase("y") ||
				opponentStatus.equalsIgnoreCase("yes")) {
			
			opponentIsHuman = true;
			playerTwo = new Player();			
		}
		
		if (opponentStatus.equalsIgnoreCase("n") ||
				opponentStatus.equalsIgnoreCase("no")) {
			
			opponentIsHuman = false;
			playerTwo = new ComputerPlayer();	
		}
		
		
		/**
		 * set opponent to each other
		 */
		playerOne.setOpponent(playerTwo);
		playerTwo.setOpponent(playerOne);
		
		// Set player one's name.
		System.out.println("Player one, please enter your name~");
		String playerOneName = scan.next();
		System.out.println("Player one, your name is: " + playerOneName);
		playerOne.setName(playerOneName);
		playerOne.placeShip();
		
		//if second player is human, set player two's name
		if (opponentIsHuman == true) {
			System.out.println("Player two, please enter your name~");
			String playerTwoName = scan.next();
			System.out.println("Player one, your name is: " + playerTwoName);
			playerTwo.setName(playerTwoName);
		}
		else {
			System.out.println("Your opponent is A computer!");
		}
		playerTwo.placeShip();
		
		
	}

	
//	/**
//	 * set opponent to each other
//	 */
//	public void setOpponents() {
//		
//	}
	
	/**
	 * check who is the winner.
	 */
	public boolean checkWinner() {
		
	}

	
	
	
}
