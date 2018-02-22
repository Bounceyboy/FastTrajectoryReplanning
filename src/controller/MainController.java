package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.AllMaps;
import model.Environment;
import model.Space;

public class MainController {
	
	/*
	 * CURRENT LOCATION = YELLOW
	 * START = DODGER BLUE
	 * END = GREEN YELLOW
	 * UNSEEN = GRAY
	 * SEEN/UNBLOCKED = WHITE
	 * SEEN/BLOCKED = BLACK
	 */
	
	Stage stage = new Stage();
	AllMaps maps;
	Environment map;
	
	@FXML private Button goButton;
	@FXML private Button remakeButton;
	@FXML private MenuButton menuButton;
	@FXML private GridPane grid;
	
	@FXML public void handleGoButtonAction (ActionEvent event){
		/*TODO code using the algorithm once it's complete
		 * should follow this order probably:
		 * 		Calculate next movement
		 * 		Set spaces in 2D array properly
		 * 		refreshMap()
		 * 		wait .5 seconds or something
		 */
	}
	
	@FXML public void handleRemakeButtonAction (ActionEvent event){
		maps = new AllMaps();
		map = maps.getMaps().get(0);
		refreshMap();
	}
	
	@FXML public void initialize() {
		//build initial map
		maps = new AllMaps();
		map = maps.getMaps().get(0);
		Space[][] spaces = map.getMap();
		
		MenuItem item;
		item = new MenuItem();
		item.setText("Map 0");
		item.setOnAction(a->{
			loadMap(0);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 1");
		item.setOnAction(a->{
			loadMap(1);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 2");
		item.setOnAction(a->{
			loadMap(2);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 3");
		item.setOnAction(a->{
			loadMap(3);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 4");
		item.setOnAction(a->{
			loadMap(4);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 5");
		item.setOnAction(a->{
			loadMap(5);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 6");
		item.setOnAction(a->{
			loadMap(6);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 7");
		item.setOnAction(a->{
			loadMap(7);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 8");
		item.setOnAction(a->{
			loadMap(8);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 9");
		item.setOnAction(a->{
			loadMap(9);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 10");
		item.setOnAction(a->{
			loadMap(10);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 11");
		item.setOnAction(a->{
			loadMap(11);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 12");
		item.setOnAction(a->{
			loadMap(12);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 13");
		item.setOnAction(a->{
			loadMap(13);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 14");
		item.setOnAction(a->{
			loadMap(14);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 15");
		item.setOnAction(a->{
			loadMap(15);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 16");
		item.setOnAction(a->{
			loadMap(16);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 17");
		item.setOnAction(a->{
			loadMap(17);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 18");
		item.setOnAction(a->{
			loadMap(18);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 19");
		item.setOnAction(a->{
			loadMap(19);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 20");
		item.setOnAction(a->{
			loadMap(20);
		});
		item = new MenuItem();
		item.setText("Map 21");
		item.setOnAction(a->{
			loadMap(21);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 22");
		item.setOnAction(a->{
			loadMap(22);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 23");
		item.setOnAction(a->{
			loadMap(23);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 24");
		item.setOnAction(a->{
			loadMap(24);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 25");
		item.setOnAction(a->{
			loadMap(25);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 26");
		item.setOnAction(a->{
			loadMap(26);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 27");
		item.setOnAction(a->{
			loadMap(27);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 28");
		item.setOnAction(a->{
			loadMap(28);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 29");
		item.setOnAction(a->{
			loadMap(29);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 30");
		item.setOnAction(a->{
			loadMap(30);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 31");
		item.setOnAction(a->{
			loadMap(31);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 32");
		item.setOnAction(a->{
			loadMap(32);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 33");
		item.setOnAction(a->{
			loadMap(33);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 34");
		item.setOnAction(a->{
			loadMap(34);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 35");
		item.setOnAction(a->{
			loadMap(35);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 36");
		item.setOnAction(a->{
			loadMap(36);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 37");
		item.setOnAction(a->{
			loadMap(37);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 38");
		item.setOnAction(a->{
			loadMap(38);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 39");
		item.setOnAction(a->{
			loadMap(39);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 40");
		item.setOnAction(a->{
			loadMap(40);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 41");
		item.setOnAction(a->{
			loadMap(41);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 42");
		item.setOnAction(a->{
			loadMap(42);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 43");
		item.setOnAction(a->{
			loadMap(43);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 44");
		item.setOnAction(a->{
			loadMap(44);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 45");
		item.setOnAction(a->{
			loadMap(45);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 46");
		item.setOnAction(a->{
			loadMap(46);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 47");
		item.setOnAction(a->{
			loadMap(47);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 48");
		item.setOnAction(a->{
			loadMap(48);
		});
		menuButton.getItems().add(item);
		item = new MenuItem();
		item.setText("Map 49");
		item.setOnAction(a->{
			loadMap(49);
		});
		menuButton.getItems().add(item);
		
		for(int x = 0; x<101; x++){
			for (int y = 0; y<101; y++){
				if(spaces[x][y].isVisited())
					grid.add(new Rectangle(7,7,Color.DODGERBLUE), x, y);
				else if (x == map.getEndx() && y == map.getEndy())
					grid.add(new Rectangle(7,7,Color.GREENYELLOW), x, y);
				else if (spaces[x][y].isRevealed()) {
					if(spaces[x][y].isBlocked())
						grid.add(new Rectangle(7,7,Color.BLACK), x, y);
					else
						grid.add(new Rectangle(7,7,Color.WHITE), x, y);
				}
				else		
					grid.add(new Rectangle(7,7,Color.GRAY), x, y);
				
			}
		}
	
	}
	
	public void loadMap(int q) {
		map = maps.getMaps().get(q);
		Space[][] spaces = map.getMap();

		
		for(int x = 0; x<101; x++){
			for (int y = 0; y<101; y++){
				grid.getChildren().remove(0);
				if(spaces[x][y].isVisited())
					grid.add(new Rectangle(7,7,Color.DODGERBLUE), x, y);
				else if (x == map.getEndx() && y == map.getEndy())
					grid.add(new Rectangle(7,7,Color.GREENYELLOW), x, y);
				else if (spaces[x][y].isRevealed()) {
					if(spaces[x][y].isBlocked())
						grid.add(new Rectangle(7,7,Color.BLACK), x, y);
					else
						grid.add(new Rectangle(7,7,Color.WHITE), x, y);
				}
				else		
					grid.add(new Rectangle(7,7,Color.GRAY), x, y);
			}
		}
	}

	public void refreshMap() {
		Space[][] spaces = map.getMap();

		
		for(int x = 0; x<101; x++){
			for (int y = 0; y<101; y++){
				grid.getChildren().remove(0);
				if(spaces[x][y].isVisited())
					grid.add(new Rectangle(7,7,Color.DODGERBLUE), x, y);
				else if (x == map.getEndx() && y == map.getEndy())
					grid.add(new Rectangle(7,7,Color.GREENYELLOW), x, y);
				else if (spaces[x][y].isRevealed()) {
					if(spaces[x][y].isBlocked())
						grid.add(new Rectangle(7,7,Color.BLACK), x, y);
					else
						grid.add(new Rectangle(7,7,Color.WHITE), x, y);
				}
				else		
					grid.add(new Rectangle(7,7,Color.GRAY), x, y);
			}
		}
	}
}
