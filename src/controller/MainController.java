package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.AllMaps;
import model.Environment;

public class MainController {
	Stage stage = new Stage();
	
	@FXML private Button goButton;
	@FXML private Button remakeButton;
	@FXML private MenuButton menuButton;
	@FXML private GridPane grid;
	
	@FXML public void handleGoButtonAction (ActionEvent event){
		//GO!
	}
	
	@FXML public void handleRemakeButtonAction (ActionEvent event){
		//remake maps
	}
	
	
	public void initialize(URL url, ResourceBundle rb) {
		//build initial map
		AllMaps maps = new AllMaps();
		Environment map = maps.getMaps().get(0);
		Rectangle current;
		
		for(int x = 0; x<101; x++){
			for (int y = 0; y<101; y++){
				current = new Rectangle();
				current.setHeight(grid.getHeight());
				current.setWidth(grid.getWidth());
				current.setFill(Color.ALICEBLUE);
				grid.setShape(current);
				current.setVisible(true);
			}
		}
		
	}
	
	public void setStage (Stage stage){
		this.stage = stage;
	}
	
	
}
