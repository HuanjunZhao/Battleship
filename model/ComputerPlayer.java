package model;

/**
 * AI data for a computer player.
 * @author Tristan Richardson
 *@version Alpha
 */
import java.util.Random;

import model.Board;
import model.Player;
import model.Point;
import model.Ship;
import model.ShipType;
public class ComputerPlayer{
	
	private String name;
	private Ship[] ships;
	private Player opponent;// code taken from Player class
	private Board board;
	
	public ComputerPlayer() {
		this.name="CPU";
		this.ships=new Ship[5];
	}
		
	public String getName() {
		return name;
	}
	public Ship[] getShips() {
		return ships;
	}
	public Player getOpponent() {
		return opponent;
	}
	public Board getBoard() {
		return board;
	}
	public void setName(String newName) {
		name=new String (newName);
	}
	
	public void setOpponent(Player newOpponent) {
		opponent=newOpponent;
	}
	public void setBoard(Board insertBoardHere) {
		board=insertBoardHere;
	}
	
	public void placeShip() { //currently functional
		
		Ship carrier;
		Ship battleship;
		Ship cruiser;
		Ship submarine;
		Ship destroyer;
		boolean result;
		do {
			do {
				carrier = new Ship(ShipType.CARRIER, guess(), guessRotation());
			} while(carrier.getLength() == -1);
			ships[0] = carrier;
			result = board.addShip(carrier);
		} while(!result);
		do {
			do {
				battleship = new Ship(ShipType.BATTLESHIP, guess(), guessRotation());
			} while(battleship.getLength() == -1);
			ships[1] = battleship;
		} while(!board.addShip(battleship));
		do {
			do {
				cruiser = new Ship(ShipType.CRUISER, guess(), guessRotation());
			} while(cruiser.getLength() == -1);
			ships[2] = cruiser;
		} while(!board.addShip(cruiser));
		do {
			do {
				submarine = new Ship(ShipType.SUBMARINE, guess(), guessRotation());
			} while(submarine.getLength() == -1);
			ships[3] = submarine;
		} while(!board.addShip(submarine));
		do {
			do {
				destroyer = new Ship(ShipType.DESTROYER, guess(), guessRotation());
			} while(destroyer.getLength() == -1);
			ships[4] = destroyer;
		} while(!board.addShip(destroyer));
		System.out.println("CPU Board");
		board.display();
	}

	public void play() {
		if(opponent.getPlayerBoard().checkGuess(guess())) {
			System.out.println("Computer Hit!");
		} else {
			System.out.println("Computer Missed!");
		}
		opponent.getPlayerBoard().display();
	}
	
	private int guessRotation() {
		Random random = new Random();
		int rotationGuess = random.nextInt(30);
		if(rotationGuess > 15)
			return 90;
		if(rotationGuess > 10)
			return 180;
		if(rotationGuess > 5)
			return 270;
		return 0;
	}
	
	private Point guess() {
		Random random=new Random();
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		return new Point(guessX,guessY);
	}
	

}
