package model;

import java.util.Random;

/** 
 * A single space in the 101x101 map, contains booleans for visited, revealed and blocked.<br>
 * There's a 30% chance the space is blocked, 70% chance it's not. This is decided when the Space() constructor is called.
 * 
 * @author Jason Holley
 *
 */
public class Space {
	
	private boolean visited, revealed, blocked;

	Space() {
		this.setVisited(false);
		this.setRevealed(false);
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		if(n <= 3)
			this.setBlocked(true);
		else
			this.setBlocked(false);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isRevealed() {
		return revealed;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
}
