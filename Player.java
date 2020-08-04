
import java.util.Scanner;

/**
 * Battleship (Player Class): Beta version
 * Beta Changelog:
 * @author Taimur Rizwan
 *UCID: 30078941	(1st Iteration)<br>
 *Tristan Richardson UCID:30076898 (connecting with PlayerSlot abstract)
 *@version Beta
 */
/*
 * Beta changes:
 * - Made several adaptations for transfer to PlayerSlot.
 * - 
 */
public class Player extends PlayerSlot {
/**
 * Instance variables
 */
	private final boolean isPlayer=true;
	/*private String name;
	private Ship[] ships;
	private ComputerPlayer opponent;
	private Board board;
	*///Variables moved to 
	
	public Player() {
		super(board);
	}

	public void shipConstructor() {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an x-coordinate for CARRIER");
		int x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for CARRIER");
		int y = input.nextInt();
		
		Ship carrier = new Ship(ShipType.CARRIER, x, y, this); 
		
		ships[0] = carrier;
		
		board.addShip(carrier);
		board.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for BATTLESHIP");
		x = input.nextInt();
		
		System.out.println("Enter an y-coordinate for BATTLESHIP");
		y = input.nextInt();
		
		Ship battleship = new Ship(ShipType.BATTLESHIP, x, y, this);
		
		ships[1] = battleship;
		
		board.addShip(battleship);
		board.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for CRUISER");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for CRUISER");
		y = input.nextInt();
				
		Ship cruiser = new Ship(ShipType.CRUISER, x, y, this);
				
		ships[2] = cruiser;
				
		board.addShip(cruiser);
		board.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for SUBMARINE");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for SUBMARINE");
		y = input.nextInt();
				
		Ship submarine = new Ship(ShipType.SUBMARINE, x, y, this);
				
		ships[3] = submarine;
				
		board.addShip(submarine);
		board.display();
		
		//-----------------------------------------------------------------------------
		
		System.out.println("Enter an x-coordinate for DESTROYER");
		x = input.nextInt();
				
		System.out.println("Enter an y-coordinate for DESTROYER");
		y = input.nextInt();
				
		Ship destroyer = new Ship(ShipType.DESTROYER, x, y, this);
				
		ships[4] = destroyer;
				
		board.addShip(destroyer);
		board.display();
		
	}
	
	public void guess() {
		
	}
	
	public void play() {
		//
		
	}
	

	
	
}
