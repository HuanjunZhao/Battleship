/**
 * AI data for a computer player.
 * @author Tristan Richardson
 *@version Alpha
 */
import java.util.Random;
import java.util.ArrayList;
public class ComputerPlayer{
	private final boolean isPlayer=false;//for a branch 
	private String name;
	private Ship[] ships;
	private Player opponent;// code taken from Player class
	private Board board;
	private byte hitCoef=0;
	private ArrayList<Point> shots;
	private Point lastPicked;
	private Random random;
	
	public ComputerPlayer() {
		this.name="CPU";
		this.ships=new Ship[5];
		shots=new ArrayList<Point>(27);//
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
	/*The same code as in Player, except randomized.
	When we're ready for inheritance, much of this method will be its own method in Player
	for which this class will override selections with a randomizer.
	*/
	public void placeShip() {
		Ship carrier = new Ship(ShipType.CARRIER, guess(), opponent); 
		ships[0] = carrier;
		board.addShip(carrier);
		
		Ship battleship = new Ship(ShipType.BATTLESHIP, guess(), opponent);
		ships[1] = battleship;
		board.addShip(battleship);
		
		Ship cruiser = new Ship(ShipType.CRUISER, guess(), opponent);
		ships[2] = cruiser;
		board.addShip(cruiser);
		
		Ship submarine = new Ship(ShipType.SUBMARINE, guess(), opponent);
		ships[3] = submarine;
		board.addShip(submarine);
		
		Ship destroyer = new Ship(ShipType.DESTROYER, guess(), opponent);
		ships[4] = destroyer;
		board.addShip(destroyer);
		System.out.println("CPU Board");
		board.display();
	}
	/**
	 * Guess generator for AI. Generates a point to test in the AI path. Called until a suitable spot is found. The AI then sends this <i>Point</i> to the <i>Referee</i>. 
	 * <p>Meant to be run on AI paths chosen by <i>hitCoef</i> and rerun if the path rejects the point it got before. 
	 * The method will rerun itself if it rolls a spot it hit before (Recorded in <i>shots</i>).
	 * @return Coordinates of type Point to attempt to fire upon.
	 */	
	private Point guess() {
		int guessX=random.nextInt(9);
		int guessY=random.nextInt(9);
		Point newP=new Point(guessX,guessY);
		if (shots.indexOf(newP)==-1) {
			return newP;
		}else {return guess();}
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
	 * <br><b>nextHit()</b> If the AI lands a hit, it will try 
	 * <br><b>avoidance()</b> 
	 * <br><b>firstShot()</b> 
	 * @return The return method in the AI path it picks next.
	 */
	private Point decision(){
		Point path;
		if (hitCoef>=1/*&& [insert feedback saying a ship didn't sink yet here]*/) {path= nextHit();}
		else if(hitCoef<=-1){path=avoidance();}
		else {path=firstShot();}
		lastPicked=path;
		return path;
	}
	private Point nextHit(){
		Point tryP=guess();
		int range=0;
		while (range>=1) {
			tryP=guess();
			range=Math.abs(lastPicked.getX()-tryP.getX())+Math.abs(lastPicked.getY()-tryP.getY());
		}
		return tryP;
	}
	private Point avoidance(){
		Point tryP=guess();
		int range=0;
		while (range<=3) {
			tryP=guess();
			range=Math.abs(lastPicked.getX()-tryP.getX())+Math.abs(lastPicked.getY()-tryP.getY());
		}
		return tryP;
	}
	
	private Point firstShot(){
		Point tryP=guess();
		return tryP;
	}
	

}
