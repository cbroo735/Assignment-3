package mru.tsc.model;

public class Puzzle extends Toy {

	String puzzleType;

	/**
	 * Constructor to create "puzzle" object. The parameters come from the Toy
	 * superclass
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param availableCount Available-count
	 * @param ageAppropriate Age level
	 * @param type Puzzle type
	 */
	public Puzzle(String SN, String name, String brand, double price, int availableCount, int ageAppropriate,
			String type) {
		super(SN, name, brand, price, availableCount, ageAppropriate);
		puzzleType = type;
	}


	// SETTER + GETTER METHODS

	/**
	 * Accessor method for puzzle
	 * @return puzzleType
	 */
	public String getPuzzleType() {
		return puzzleType;
	}

	/**
	 * Mutator method for puzzle
	 * @param puzzleType
	 */
	public void setPuzzleType(String puzzleType) {
		this.puzzleType = puzzleType;
	}

	/**
	 * This is a method to allow the puzzle to be in a readable form
	 * @return Readable string
	 */
	@Override
	public String toString() {
		return "Puzzle [SN=" + SN + ", name=" + name + ", brand=" + brand + ", price=" + price + ", availableCount="
				+ availableCount + ", ageAppropriate=" + ageAppropriate + ", puzzleType=" + puzzleType + "]";
	}

	/**
	 * Formatting string for puzzle
	 * @return Formatted string
	 */
	public String format() {

		return SN + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";"
				+ puzzleType;
	}

}
