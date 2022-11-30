package model;

public class Player {
	private int score;
    private int health;
    private Room currentLocation;
    
    public Player() {
    	score = 0;
    	health = 10;
    	currentLocation = null;
    }
    
	/**
	 * @return the currentLocation
	 */
	public Room getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * @param currentLocation the currentLocation to set
	 */
	public void setCurrentLocation(Room currentLocation) {
		this.currentLocation = currentLocation;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void move() {
		score = score + 1;
		health = health - 2;
	}
	
	public String toString() {
		String description = "";
		description = description + "Score is " + score + "\n";
		description = description + "Health is " + health + "\n";
		return description;
	}

}
