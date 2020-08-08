package model;

import java.util.Random;
import java.util.ArrayList;
/**
 * AI data for a computer player.
 * @author Tristan Richardson (30076898) - 1st Iteration code
 * Team C2
 *@version Iteration 2
 */
public class ComputerPlayer extends PlayerSlot{
	private byte hitCoef;
	private ArrayList<Point> shots;
	private Point lastPicked;
	private Random random;
	private boolean prevHit;
	
	public ComputerPlayer(Board board) {
		super("CPU",board);
		shots = new ArrayList<Point>(27);
		hitCoef = 0;
		random = new Random();
	}
	
	public Ship shipConstructor(ShipType type) {
		return new Ship(type, guessPlacement(), guessRotation()); 
	}
	
	/**
	 * Randomly rotates ships.
	 * @author Dillon Sahadevan, UCID 30075927
	 * @return
	 */
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
	 * Guess generator for AI. Generates a point to test in the AI path. Called until a suitable spot is found. The AI then sends this <i>Point</i> to the <i>Referee</i>. 
	 * <p>Meant to be run on AI paths chosen by <i>hitCoef</i> and rerun if the path rejects the point it got before. 
	 * The method will rerun itself if it rolls a spot it hit before (Recorded in <i>shots</i>).
	 * @return Coordinates of type Point to attempt to fire upon.
	 */	
	private Point constructHit() {
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		Point newP=new Point(guessX,guessY);
		if (shots.indexOf(newP)==-1) {
			return newP;
		}else {return constructHit();}
	}
	//hit and miss considerations for feedback.
	private void hit() {
		if(hitCoef<=-1) {hitCoef=1;}
		else if(hitCoef!=3){hitCoef++;}
	}
	private void miss() {
		if(hitCoef!=-3){hitCoef--;}
	}
	//----------------------------------------
	/**
	 * Algorithm for next decision.
	 * <br><b>nextHit()</b> If the AI lands a hit, it will target nearby tiles.
	 * <br><b>avoidance()</b> If the AI misses, it will avoid attacking tiles near the missed shot for one turn.
	 * <br><b>firstShot()</b> Default. Runs hit constructor.
	 * @return The results from the attack.
	 */
	@Override
	public Point guess(){
		Point path;
		if (hitCoef>=1 && prevHit) {path= nextHit();}
		else if(hitCoef<=-1){path=avoidance();}
		else {path=firstShot();}
		lastPicked=path;
		shots.add(path);
		return path;
	}
	
	public Point guessPlacement() {
		Random random = new Random();
		return new Point(random.nextInt(9), random.nextInt(9));
	}
	
	private Point nextHit(){
		Point tryP = constructHit();
		int range = 0;
		while (range >= 1) {
			tryP = constructHit();
			range = Math.abs(lastPicked.getX()-tryP.getX()) + 
					Math.abs(lastPicked.getY()-tryP.getY());
		}
		return tryP;
	}
	private Point avoidance(){
		Point tryP = constructHit();
		int range = 0;
		while (range <= 3) {
			tryP = constructHit();
			range = Math.abs(lastPicked.getX()-tryP.getX()) + 
					Math.abs(lastPicked.getY()-tryP.getY());
		}
		return tryP;
	}
	private Point firstShot(){
		Point tryP = constructHit();
		return tryP;
	}
	
	@Override
	public void play() {
		if(getOpponent().getBoard().checkGuess(guess())) {
			System.out.println("Computer Hit!");
			prevHit = true;
		} else {
			System.out.println("Computer Missed!");
			prevHit = false;
		}
		getOpponent().getBoard().display();
	}
	
	/*
	private Point shot(){
		Point tryP=guess();
		int range=0;
		if (hitCoef!=0) {
			boolean rangeTest = true;
			if(hitCoef<=-1) {rangeTest=(range<=3);}
			if(hitCoef>=1) {rangeTest=(range>=3);}
			while (rangeTest) {
			tryP=guess();
			range=Math.abs(lastPicked.getX()-tryP.getX())+Math.abs(lastPicked.getY()-tryP.getY());
			}
		}
		return tryP;
	}*/
}
