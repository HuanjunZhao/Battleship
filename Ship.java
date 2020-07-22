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
	private Player owner;
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
	 */
	public Ship(ShipType type, int x, int y, Player player) {
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
		rotation = 0;
		shipState = 1.0;
		shipDamageMultiplier = shipState / length;
		owner = player;
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
	 */
	public Ship(ShipType type, Point point, Player player) {
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
		rotation = 0;
		shipState = 1.0;
		shipDamageMultiplier = shipState / length;
		owner = player;
	}
	
	/**
	 * Rotates the ship in 90 degree increments that reverts to 0
	 * once it reaches 360 degrees (implemented on line 58)
	 * Changes the coordinates of the ship's slots accordingly.
	 */
	public void rotateShip() {
		//Rotation if ship is upright.
		//Swap x and y coordinates.
		if(rotation == 0) {
			for(Point p : shipCoords) {
				if(p.equals(origin))
					continue;
				p.swapCoordinates();
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
				shipCoords[i].swapCoordinates();
				shipCoords[i].setX(origin.getX());
				shipCoords[i].setY(origin.getY() - originIndex + i);
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
				shipCoords[i].swapCoordinates();
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
				shipCoords[i].setY(origin.getY() + originIndex - i);
			}
		}
		rotation += 90;
		//Limit rotation to 360 degrees (when it reaches 360, it will reset to 0)
		rotation = (rotation == 360 ? 0 : rotation);
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
}