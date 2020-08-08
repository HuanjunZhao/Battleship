package model;

/**
 * Skeleton for Point class for battleships team battle royal
 * @author Dillon Sahadevan, UCID 30075927
 * @version 1.0
 */
public class Point {
	private int xCoord;
	private int yCoord;
	
	/**
	 * Constructor for point class
	 * @param x x coordinate of Point
	 * @param y y coordinate of Point
	 */
	public Point(int x, int y) {
		xCoord = x;
		yCoord = y;
	}

	/**
	 * Copy Constructor for point class
	 * @param otherPoint the point to copy
	 */
	public Point(Point otherPoint) {
		xCoord = otherPoint.getX();
		yCoord = otherPoint.getY();
	}
	
	/**
	 * Getter for x coordinate of point
	 * @return x coordinate of point
	 */ 
	public int getX() {
		return xCoord;
	}
	
	/**
	 * Getter for y coordinate of point
	 * @return y coordinate of point
	 */ 
	public int getY() {
		return yCoord;
	}
	
	/**
	 * Setter for x coordinate of point
	 * @param x the new x coordinate
	 */
	public void setX(int x) {
		xCoord = x;
	}
	
	/**
	 * Setter for y coordinate of point
	 * @param y the new y coordinate
	 */
	public void setY(int y) {
		yCoord = y;
	}
	
	public void swapCoordinates() {
		int temp = xCoord;
		xCoord = yCoord;
		yCoord = temp;
	}
	
	/**
	 * A function to check if 2 points are equal
	 * @param p the other point to check
	 * @return true or false based on whether the points are the same
	 */
	public boolean equals(Point p) {
		if(p.getX() == xCoord &&
				p.getY() == yCoord)
			return true;
		return false;
	}
}
