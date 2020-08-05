package model;

/**
 * Skeleton for ship class for battleships team battle royal
 * @author Dillon Sahadevan, UCID 30075927
 * @version 1.0
 */
public class Ship {
	private ShipType shipType;
	private int length;
	private Point [] shipCoords;
	private int rotation;
	private double shipState;
	private double shipDamageMultiplier;
	private Point origin;
	
	/**
	 * Constructor for Ship class
	 * The origin of the ship is the coordinate for the ship's center.
	 * For a ship of length 5, the coordinate of the 3rd slot is it's origin.
	 * For a ship that has an even length, the origin is half the length.
	 * For example, for a ship of length 2, the origin is the 2nd slot.
	 * @param type the type of ship
	 * @param x x coordinate for the ship's origin
	 * @param y y coordinate for the ship's origin
	 * @param player the player that owns this ship
	 * @param rotation the angle to rotate the ship, 0 degrees being north
	 */
	public Ship(ShipType type, int x, int y, int rotation) {
		shipType = type;
		if(type == ShipType.CARRIER)
			length = 5;
		else if(type == ShipType.BATTLESHIP)
			length = 4;
		else if(type == ShipType.DESTROYER)
			length = 2;
		else
			length = 3;
		origin = new Point(x, y);
		shipCoords = new Point[length];
		//Origin index calculated based on position mentioned in javadoc above.
		int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
		for(int i = 0; i < length; i++) {
			if(i == originIndex) {
				shipCoords[i] = origin;
				continue;
			}
			//Get coordinate based on distance to origin.
			shipCoords[i] = new Point(origin.getX(), 
					originIndex + origin.getY() - i);
		}
		rotateShip(rotation);
		shipState = 1.0;
		shipDamageMultiplier = shipState / length;
	}

	/**
	 * Constructor for Ship class
	 * The origin of the ship is the coordinate for the ship's center.
	 * For a ship of length 5, the coordinate of the 3rd slot is it's origin.
	 * For a ship that has an even length, the origin is half the length.
	 * For example, for a ship of length 2, the origin is the 2nd slot.
	 * @param type the type of ship
	 * @param point the origin of the ship
	 * @param player the player that owns this ship
	 * @param rotation the angle to rotate the ship, 0 degrees being north
	 */
	public Ship(ShipType type, Point point, int rotation) {
		shipType = type;
		//Assign length based on shipType
		if(type == ShipType.CARRIER)
			length = 5;
		else if(type == ShipType.BATTLESHIP)
			length = 4;
		else if(type == ShipType.DESTROYER)
			length = 2;
		else
			length = 3;
		origin = new Point(point);
		shipCoords = new Point[length];
		//Origin index calculated based on position mentioned in javadoc above.
		int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
		for(int i = 0; i < length; i++) {
			if(i == originIndex) {
				shipCoords[i] = origin;
				continue;
			}
			//Get coordinate based on distance to origin.
			shipCoords[i] = new Point(origin.getX(), 
					originIndex + origin.getY() - i);
		}
		rotateShip(rotation);
		shipState = 1.0;
		shipDamageMultiplier = shipState / length;
	}
	
	/**
	 * Getter for length of ship
	 * @return length of ship : int
	 */
	public int getLength() {
		return length;
	}
	
	private void rotateShip(int angle) {
		Point[] temp = null;
		if(angle == 0)
			temp = shipCoords;
		int numRotations = angle/90;
		while(numRotations > 0) {
			temp = rotateShip();
			rotation += 90;
			numRotations--;
		}
		for(Point p : temp) {
			if(p.getX() < 0 || p.getX() > 9 ||
					p.getY() < 0 || p.getY() > 9) {
				System.out.println("Cannot place ship here");
				length = -1;
				return;
			}
		}
		//Limit rotation to 360 degrees (when it reaches 360, it will reset to 0)
		rotation = (rotation == 360 ? 0 : rotation);
		shipCoords = temp;
	}
	
	private Point[] rotateShip() {
		//Rotation if ship is upright.
		//Create temp array to return
		Point[] shipCoords = new Point[length];
		for(int i = 0; i < length; i++)
			shipCoords[i] = new Point(this.shipCoords[i]);
		if(rotation == 0) {
			int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
			for(int i = 0; i < length; i++) {
				shipCoords[i].setY(origin.getY());
				shipCoords[i].setX(origin.getX() + originIndex - i);
			}
		}
		//Rotation if ship has been rotated 90 degrees.
		//Swap coordinates then move coordinates on with respect to the origin
		//To conserve the order and location of the points
		else if (rotation == 90) {
			int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
			for(int i = 0; i < length; i++) {
				if(i == originIndex)
					continue;
				shipCoords[i].setX(origin.getX());
				shipCoords[i].setY(origin.getY() + originIndex - i);
			}
		}
		//Rotation if ship has been rotated 180 degrees.
		//Swap coordinates then move coordinates on respect to the origin
		//To conserve the order and location of the points
		else if (rotation == 180) {
			int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
			for(int i = 0; i < length; i++) {
				if(i == originIndex)
					continue;
				shipCoords[i].setY(origin.getY());
				shipCoords[i].setX(origin.getX() - originIndex + i);
			}
		} 
		//Rotation if ship has been rotated 270 degrees.
		//Swap coordinates then move coordinates on respect to the origin
		//To conserve the order and location of the points
		else {
			int originIndex = (length % 2 == 0 ? length / 2 : length / 2 + 1) - 1;
			for(int i = 0; i < length; i++) {
				if(i == originIndex)
					continue;
				shipCoords[i].swapCoordinates();
				shipCoords[i].setX(origin.getX());
				shipCoords[i].setY(origin.getY() + i - originIndex);
			}
		}
		
		return shipCoords;
	}
	
	/**
	 * Given a point, the function will return true if a successful
	 * hit has occurred. The ship's state will be impacted by this.
	 * false will be returned if the attempted hit missed.
	 * @param point the Point to attempt
	 * @return true or false based on a successful hit or miss.
	 */
	public boolean attemptHit(Point point) {
		for(Point p : shipCoords) {
			if(p.equals(point)) {
				shipState -= shipDamageMultiplier;
				//Fix arithmetic error
				shipState = (shipState < 0.01 ? 0 : shipState);
				if(shipState == 0) {
					System.out.println(toString() + " has been destroyed!!");
				}
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Getter function for ship origin
	 * @return origin of the ship
	 */
	public Point getOrigin() {
		return new Point(origin);
	}
	
	/**
	 * Getter function for ship coordinates
	 * @return the cooridnates of the ship
	 */
	public Point[] getShipCoords() {
		return shipCoords;
	}
	
	/**
	 * A function to check if the ship has been destroyed.
	 * @return true if the ship has been destoryed, false otherwise.
	 */
	public boolean isDestroyed() {
		if(shipState == 0)
			return true;
		return false;
	}
	
	/**
	 * toString for ship class
	 * returns the type of ship as a string
	 */
	@Override
	public String toString() {
		String type = "Carrier";
		if(shipType == ShipType.BATTLESHIP)
			type = "Battleship";
		else if(shipType == ShipType.CRUISER)
			type = "Cruiser";
		else if(shipType == ShipType.DESTROYER)
			type = "Destroyer";
		else if(shipType == ShipType.SUBMARINE)
			type = "Submarine";
		return type;
	}
}