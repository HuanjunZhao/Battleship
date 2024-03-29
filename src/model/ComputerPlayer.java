package model;

import java.util.Random;
import java.util.ArrayList;
/**
 * AI data for a computer player.
 * @author Tristan Richardson (30076898) - 1st Iteration code
 * Team C2
 *@version Final Iteration
 */
public class ComputerPlayer extends PlayerSlot{
	private int hitCoef;
	private ArrayList<Point> shots;
	private Point lastPicked;
	private Random random;
	private boolean prevHit;
	
	public ComputerPlayer(Board board) {
		super("CPU",board);
		shots=new ArrayList<Point>(27);
		setHitCoef(0);
		random = new Random();
	}
	
	private int getHitCoef() {
		return hitCoef;
	}

	private void setHitCoef(int hitCoef) {
		this.hitCoef = hitCoef;
	}

	private ArrayList<Point> getShots() {
		return shots;
	}

	private void addShots(Point shot) {
		this.shots.add(shot);
	}
	/**Computer player's ship constructor. Overrides an abstract method in superclass PlayerSlot. Creates a new ship object on the computer player's board. 
	 * While there are types of ship left to call, it continues to return new ship placements until a valid ship is returned.
	 * @param type The type of ship requested from placeShip() in the PlayerSlot class.
	 */
	public Ship shipConstructor(ShipType type) {
		return new Ship(type, guessPlacement(), guessRotation()); 
	}
	
	private Point guessPlacement() {
		Random random = new Random();
		return new Point(random.nextInt(10), random.nextInt(10));
	}
	
	private int guessRotation() {
		int rotationGuess = random.nextInt(30);
		if(rotationGuess > 15)
			return 90;
		if(rotationGuess > 10)
			return 180;
		if(rotationGuess > 5)
			return 270;
		return 0;
	}
	/**
	 * Guess generator for AI. Generates a point to test in the AI path. It runs a test on each of its previous turns. Called until a suitable spot is found. The AI then sends this <i>Point</i> to the <i>Referee</i>. 
	 * <p>Meant to be run on AI paths chosen by <i>hitCoef</i> and rerun if the path rejects the point it got before. 
	 * The method will rerun itself if it rolls a spot it hit before (Recorded in <i>shots</i>).
	 * @return Coordinates of type Point to attempt to fire upon.
	 */	
	private Point constructHit() {
		int guessX = random.nextInt(10);
		int guessY = random.nextInt(10);
		Point newP = new Point(guessX,guessY);
		int matching = 0;
		for (Point p : shots) {
			if (newP.equals(p)) matching++;
		}
		if (matching == 0) {
			return newP;
		}else {return constructHit();}

	}

	//----------------------------------------
	/**
	 * Algorithm for next decision. Uses an integer hitCoef to decide what to do next. AI becomes active when hitCoef is not 0.
	 * A positive hitCoef places the AI's focus directly within the four tiles adjacent to the last point hit. If all four tiles have already been selected, the AI turns off and takes a different spot.
	 * A negative hitCoef makes the AI avoid tiles within a range of 3 tiles (Cartesian).
	 * <br>Private methods used by this method:
	 * <br><b>inactiveAI()</b> Simply runs hit constructor. Outside of the contructor's native condition against selecting the same point twice, no parameters are used.
	 * <br><b>activeAI()</b> Takes a range of type int and a boolean operator that sets the scope of the Computer's selection standards.
	 * @return The results from the attack.
	 */
	@Override
	public Point guess(){
		Point path;
		
		if (getHitCoef() >= 1) {
			path = activeAI(1,false);
			}
		else if(getHitCoef() <= -1){
			path = activeAI(3,true);
		}
		else {
			path=inactiveAI();
			}
		lastPicked = path;
		if(getOpponent().getBoard().checkGuess(lastPicked)) {
			setHitCoef(1);
		}
		else {
			setHitCoef(-1);
			}
		addShots(path);
		return path;
	}
	private Point activeAI(int range,boolean inverted){
		Point tryP = constructHit();
		int attempt = 0;
		int dist = Math.abs(lastPicked.getX() - tryP.getX()) +
					Math.abs(lastPicked.getY() - tryP.getY());
		if (hitCoef != 0) {
			while (inverted ? dist <= range : dist > range ) {
			attempt++;
			tryP=constructHit();
			dist = Math.abs(lastPicked.getX() - tryP.getX()) +
					Math.abs(lastPicked.getY() - tryP.getY());
			if (attempt > 100) break; //If the AI gets railroaded into a few spots it can't access.
			}
		}
		return tryP;
	}

	private Point inactiveAI(){
		Point tryP = constructHit();
		return tryP;
	}
	/**
	 * Computer player's turn. Runs the guessing algorithm, checks for a hit, adapts the AI based on feedback and passes the turn over to the player.
	 */
	@Override
	public void play() {
		if(getOpponent().getBoard().checkGuess(guess())) {
			System.out.println("Computer Hit!");
			prevHit = true;
			setHitCoef(1);
		} else {
			System.out.println("Computer Missed!");
			prevHit = false;
			setHitCoef(-1);
		}
		getOpponent().getBoard().display();
	}
	
	
	
}
