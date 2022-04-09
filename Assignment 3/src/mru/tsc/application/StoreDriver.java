package mru.tsc.application;

import javafx.stage.Stage;
import mru.tsc.controller.StoreController;
import mru.tsc.view.Menus;
import mru.tsc.view.myGUI;

/**
 * This is a class to call the project by calling the StoreController and Menus constructors
 */
public class StoreDriver {
	
	public void start (Stage primaryStage) throws Exception {
		
		StoreController s = new StoreController();
		myGUI gui = new myGUI(primaryStage, s);
		new Menus();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
