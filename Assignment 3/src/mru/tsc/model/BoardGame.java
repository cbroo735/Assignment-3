package mru.tsc.model;

public class BoardGame extends Toy {

	String players;
	String designers;

	/**
	 * Constructor to create board game objects based on parameters
	 * passed into it. Parameters come from Toy superclass
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param availableCount Avaiable-count
	 * @param ageAppropriate Age level
	 * @param player Players
	 * @param designer Designer
	 */
	public BoardGame(String SN, String name, String brand, double price, int availableCount, int ageAppropriate,
			String player, String designer) {
		super(SN, name, brand, price, availableCount, ageAppropriate);
		players = player;
		designers = designer;
	}

	// SETTER + GETTER METHODS

	/**
	 * Accessor method for designers
	 * @return designers
	 */
	public String getDesigners() {
		return designers;
	}

	/**
	 * Mutator method for designers
	 * @param designers
	 */
	public void setDesigners(String designers) {
		this.designers = designers;
	}

	/**
	 * This is a method to allow the board game to be in a readable form
	 * @return Readable string
	 */
	@Override
	public String toString() {
		return "BoardGame [SN=" + SN + ", name=" + name + ", brand=" + brand + ", price=" + price + ", availableCount="
				+ availableCount + ", ageAppropriate=" + ageAppropriate + ", players=" + players + ", designers="
				+ designers + "]";

	}

	/**
	 * Formatting string for board game
	 * @return Formatted string
	 */
	public String format() {

		return SN + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";" + players
				+ ";" + designers;

	}

}
