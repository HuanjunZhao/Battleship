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
		switch(type) {
			case CARRIER:
				length = 5;
			case BATTLESHIP:
				length = 4;
			case CRUISER:
				length = 3;
			case SUBMARINE:
				length = 3;
			case DESTROYER:
				length = 2;
		}
		origin = new Point(x, y);
		shipCoords = new Point[length];
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
		switch(type) {
			case CARRIER:
				length = 5;
			case BATTLESHIP:
				length = 4;
			case CRUISER:
				length = 3;
			case SUBMARINE:
				length = 3;
			case DESTROYER:
				length = 2;
		}
		origin = new Point(point);
		shipCoords = new Point[length];
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
		rotation += 90;
		rotation = (rotation == 360 ? 0 : rotation);
		//TODO
		//Apply rotation to shipCoords
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
	 * A function to check if the ship has been destroyed.
	 * @return true if the ship has been destoryed, false otherwise.
	 */
	public boolean isDestroyed() {
		if(shipState == 0)
			return true;
		return false;
	}
}