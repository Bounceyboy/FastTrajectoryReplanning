package model;

import java.util.Random;

/**
 * 
 * The 101x101 map itself, calling the constructor creates a procedurally generated map to be stored in the "AllMaps" class <br>
 * <br>
 * 
 * This will just create a randomly generated field that is not guaranteed to have a path to the goal. I'm assuming this is what
 * we're supposed to do since it mentions that the AI should either follow "shortest presumed unblocked path" or know the goal is
 * impossible. This is why I didn't use an algorithm that ensures there's a possible path.
 * 
 * @value
 * <br>endx = x coordinate for end location
 * <br>endy = y coordinate for end location
 * <br>startx = x coordinate for start location
 * <br>starty = y coordinate for start location
 * <br>map = 2D array (map)
 * 
 * @author Jason Holley
 *
 */
public class Environment {
	Space[][] map;
	private int endx;
	private int endy;
	int startx;
	int starty;
	
	Environment(){
		map = new Space[101][101];
		for (int x = 0; x<101; x++){
			for (int y = 0; y<101; y++){
				map[x][y] = new Space();
			}
		}
		Random rand = new Random();
		int q = rand.nextInt(101);
		int r = rand.nextInt(101);
		setEndx(q);
		setEndy(r);
		map[q][r].setBlocked(false);
		map[q][r].setRevealed(true);
		q = rand.nextInt(101);
		r = rand.nextInt(101);
		startx = q;
		starty = r;
		if(startx == getEndx() && starty == getEndy()){
			while (startx == getEndx() && starty == getEndy()){
				q = rand.nextInt(101);
				r = rand.nextInt(101);
				startx = q;
				starty = r;
			}
		}
		map[q][r].setBlocked(false);
		map[q][r].setRevealed(true);
		map[q][r].setVisited(true);
		if(q!=0)
			map[q-1][r].setRevealed(true);
		if(q!=100)
			map[q+1][r].setRevealed(true);
		if(r!=0)
			map[q][r-1].setRevealed(true);
		if(r!=100)
			map[q][r+1].setRevealed(true);
	}
	
	public Space[][] getMap(){
		return map;
	}

	public int getEndx() {
		return endx;
	}

	public void setEndx(int endx) {
		this.endx = endx;
	}

	public int getEndy() {
		return endy;
	}

	public void setEndy(int endy) {
		this.endy = endy;
	}
}
