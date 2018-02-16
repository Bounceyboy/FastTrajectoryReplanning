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
	
	boolean visited, revealed, blocked;

	Space() {
		this.visited = false;
		this.revealed = false;
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		if(n <= 3)
			this.blocked = true;
		else
			this.blocked = false;
	}
}
