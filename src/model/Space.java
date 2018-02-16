package model;

import java.util.Random;

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
