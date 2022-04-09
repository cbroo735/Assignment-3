package mru.tsc.application;

import mru.tsc.controller.StoreController;
import mru.tsc.view.Menus;

/**
 * This is a class to call the project by calling the StoreController and Menus constructors
 */
public class StoreDriver {
	
	public static void main(String[] args) throws Exception {
		
		new StoreController();
		new Menus();
	}

}
