package model;

import java.util.ArrayList;

/**
 * Contains all 50 maps for the project in an ArrayList to be accessed in a dropdown listview
 * 
 * @author Jason Holley
 *
 */
public class AllMaps {
	ArrayList<Environment> maps;
	
	AllMaps(){
		maps = new ArrayList<Environment>();
		for (int x = 0; x<50; x++){
			Environment current = new Environment();
			maps.add(current);
		}
	}
}
