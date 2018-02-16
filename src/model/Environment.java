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
	int endx, endy, startx, starty;
	
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
		endx = q;
		endy = r;
		map[q][r].blocked = false;
		map[q][r].revealed = true;
		q = rand.nextInt(101);
		r = rand.nextInt(101);
		startx = q;
		starty = r;
		if(startx == endx && starty == endy){
			while (startx == endx && starty == endy){
				q = rand.nextInt(101);
				r = rand.nextInt(101);
				startx = q;
				starty = r;
			}
		}
		map[q][r].blocked = false;
		map[q][r].revealed = true;
		map[q][r].visited = true;
		if(q!=0)
			map[q-1][r].revealed = true;
		if(q!=100)
			map[q+1][r].revealed = true;
		if(r!=0)
			map[q][r-1].revealed = true;
		if(r!=100)
			map[q][r+1].revealed = true;
	}
}
