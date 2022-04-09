package mru.tsc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import mru.tsc.model.Animal;
import mru.tsc.model.BoardGame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;

public class StoreController {

	/**
	 * This class interacts with the ArrayList and the database file
	 * 
	 * @throws Exception
	 * @author Colin Brookes & Ashley Hunchak
	 */

	public StoreController() throws Exception {
		loadData();
	}

	private final String FILE_PATH = "res/toys.txt"; // Declaring the filepath for the database,
	protected Scanner input = new Scanner(System.in); // Creating the scanner to read user inputs
	ArrayList<Toy> toys = new ArrayList<>(); // initializing the arraylist for the toys

	/**
	 * This is a method to load the data from the txt file into the ArrayList
	 * @throws Exception
	 */
	public void loadData() throws Exception {
		File db = new File(FILE_PATH);
		String currentLine;
		String[] splittedLine;

		// Reading the file
		if (db.exists()) {
			Scanner fileReader = new Scanner(db);

			while (fileReader.hasNextLine()) {

				currentLine = fileReader.nextLine();
				splittedLine = currentLine.split(";");
				char SN = splittedLine[0].charAt(0);

				if (checkType(SN) == "F") { // Figure
					Toy F = new Figure(splittedLine[0], splittedLine[1], splittedLine[2],
							Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]),
							Integer.parseInt(splittedLine[5]), splittedLine[6]);
					toys.add(F);

				}
				if (checkType(SN) == "A") { // Animal
					Toy A = new Animal(splittedLine[0], splittedLine[1], splittedLine[2],
							Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]),
							Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7]);
					toys.add(A);
				}
				if (checkType(SN) == "P") { // Puzzle
					Toy P = new Puzzle(splittedLine[0], splittedLine[1], splittedLine[2],
							Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]),
							Integer.parseInt(splittedLine[5]), splittedLine[6]);
					toys.add(P);
				}
				if (checkType(SN) == "B") { // Board game
					Toy B = new BoardGame(splittedLine[0], splittedLine[1], splittedLine[2],
							Double.parseDouble(splittedLine[3]), Integer.parseInt(splittedLine[4]),
							Integer.parseInt(splittedLine[5]), splittedLine[6], splittedLine[7]);
					toys.add(B);

				}
			}
			fileReader.close(); // Close FileReader
		}
	}

	/**
	 * This is a method to determine the type of toy based on the
	 * first digit of the SN
	 * 
	 * @param SN Serial Number
	 * @return type Type of toy
	 */
	public String checkType(char SN) {
		String Type = null;
		switch (SN) {
		case '1':
		case '0':
			Type = "F"; // Figure
			break;
		case '2':
		case '3':
			Type = "A"; // Animal
			break;
		case '4':
		case '5':
		case '6':
			Type = "P"; // Puzzle
			break;
		case '7':
		case '8':
		case '9':
			Type = "B"; // Board Game
			break;
		}
		return Type;
	}

	// ADDING TOYS

	/**
	 * Takes several parameters from the menu sub class and uses them to
	 * create a new Figure toy and then add that Figure to the arraylist.
	 * 
	 * @param SN Serial Number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param count Available-count
	 * @param age Age level
	 * @param type Toy type
	 */
	public void addFigure(String SN, String name, String brand, double price, int count, int age, String type) {
		Toy F = new Figure(SN, name, brand, price, count, age, type);
		toys.add(F);
	}

	/**
	 * Takes several parameters from the menu sub class and uses them to
	 * create a new Animal toy and then add that Figure to the arraylist.
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param count Available-count
	 * @param age Age level
	 * @param material Material of toy
	 * @param Size Figure size
	 */
	public void addAnimal(String SN, String name, String brand, double price, int count, int age, String material,
			String Size) {
		Toy A = new Animal(SN, name, brand, price, count, age, material, Size);
		toys.add(A);
	}

	/**
	 * Takes several parameters from the menu sub class and uses them to
	 * create a new puzzle toy and then add that Figure to the arraylist
	 * 
	 * @param SN Serial Number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param count Available-count
	 * @param age Age level
	 * @param type Puzzle-type
	 */
	public void addPuzzle(String SN, String name, String brand, double price, int count, int age, String type) {
		Toy P = new Puzzle(SN, name, brand, price, count, age, type);
		toys.add(P);
	}

	/**
	 * Takes several parameters from the menu sub class and uses them to
	 * create a new board game toy and then add that Figure to the arraylist
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param count Available-count
	 * @param age Age level
	 * @param players Number of players
	 * @param designers Toy designers
	 */

	public void addBoardGame(String SN, String name, String brand, double price, int count, int age, String players,
			String designers) {
		Toy B = new BoardGame(SN, name, brand, price, count, age, players, designers);
		toys.add(B);
	}
	
	/**
	 * Saves all information into database, and exits the program.
	 * 
	 * @throws IOException
	 */
	public void Exit() throws IOException {
		File db = new File(FILE_PATH);
		PrintWriter pw = new PrintWriter(db);
		int i = 0;
		while (i < toys.size()) { // Print out all instances of toys
			if (toys.get(i) instanceof Animal)
			{
				Animal A = (Animal)toys.get(i);
				pw.println(A.format());
			}
			if (toys.get(i) instanceof BoardGame)
			{
				BoardGame B = (BoardGame)toys.get(i);
				pw.println(B.format());
			}
			if (toys.get(i) instanceof Figure)
			{
				Figure F = (Figure)toys.get(i);
				pw.println(F.format());
			}
			if (toys.get(i) instanceof Puzzle)
			{
				Puzzle P = (Puzzle)toys.get(i);
				pw.println(P.format());
			}
			i++; // Adds one to the loop
		}
		pw.close(); // Close PrintWiter
	}

	/**
	 * This is a method to determine if a SN is unique
	 *
	 * @param SN Serial Number
	 * @return repeatSN Availability of SN
	 * @throws Exception
	 */
	public boolean repeatSN(String SN) throws Exception {
		boolean repeatSN = false;
		String storedSN = "0";
		int i = 0;
		while (i < toys.size()) {
			storedSN = toys.get(i).getSN();
			if (storedSN.equals(SN)) {
				repeatSN = true;
			}
			i++;
		}
		return repeatSN;
	}

	/**
	 * This method searches the SN of a Toy
	 * @param SN Serial Number
	 * @return toy Toy
	 */
	protected Toy searchSN(String SN) {
		Toy toy = null;
		for (Toy t : toys) {
			if (t.getSN().equals(SN)) {
				toy = t;
				break;
			}
		}
		return toy;
	}

	/**
	 * Removes a Toy from the database based on the SN
	 * @param SN Serial Number
	 */
	protected void RemoveToy(String SN) {
		int i = 0;

		while (i < toys.size()) {
			String storedSN = toys.get(i).getSN();
			if (storedSN.equals(SN)) {
				toys.remove(i);
			}
			i++;
		}
	}

	/**
	 * This method allows the user to search the toy by type
	 * @param choice
	 */
	public void typeSearching(String choice) {
        int i;
        char type = choice.toUpperCase().charAt(0);

        if (type == 'A') {
            i = 0;

            while (i < toys.size()) {
                if (toys.get(i) instanceof Animal) {
                    Animal A = (Animal) toys.get(i);
                    System.out.println(A.toString());
                }
                i++;
            }
        }
            if (type == 'B') {
                i = 0;

                while (i < toys.size()) {
                    if (toys.get(i) instanceof BoardGame) 
                    {
                        BoardGame B = (BoardGame) toys.get(i);
                        System.out.println(B.toString());
                    }
                    i++;
            }
            }
            if (type == 'F') {
                i = 0;

                while (i < toys.size()) {

                    if (toys.get(i) instanceof Figure) {
                        Figure F = (Figure) toys.get(i);
                        System.out.println(F.toString());
                    }
                i++;
            }
            }
            if (type == 'P') {
                i = 0;

                while (i < toys.size()) {

                    if (toys.get(i) instanceof Puzzle) {
                        Puzzle P = (Puzzle) toys.get(i);
                        System.out.println(P.toString());
                    }
                i++;
            }
            }
    }

	/**
	 * This searches for the name in the ArrayList, later then printing it out with
	 * the ToString method
	 * 
	 * @param name Search name
	 * 
	 */
	protected void toySearch(String name) {
		Toy toy = null;

		for (Toy t1 : toys) {

			if ((t1.getName().toUpperCase()).contains(name.toUpperCase())) {
				toy = t1;

				if (toy instanceof Puzzle) {
					Puzzle P = (Puzzle) toy;
					System.out.println(P.toString());
				}
				if (toy instanceof Animal) {
					Animal A = (Animal) toy;
					System.out.println(A.toString());
				}
				if (toy instanceof BoardGame) {
					BoardGame B = (BoardGame) toy;
					System.out.println(B.toString());
				}
				if (toy instanceof Figure) {
					Figure F = (Figure) toy;
					System.out.println(F.toString());
				}
				System.out.println(" ");
			}
		}
		
	}

}