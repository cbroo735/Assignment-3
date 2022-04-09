package mru.tsc.model;

public class Figure extends Toy {
	
	char classification;

	/**
	 * The Constructor creates the object. Several of the parameters come from the
	 * toy superclass
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param availableCount Available-count
	 * @param ageAppropriate Age level
	 * @param Class Class
	 */
	public Figure(String SN, String name, String brand, double price, int availableCount, int ageAppropriate,
			String Class) {
		super(SN, name, brand, price, availableCount, ageAppropriate);
		classification = Class.charAt(0);
	}

	// SETTER + GETTER METHODS

	/**
	 * Accessor method for classification
	 * @return classification
	 */
	public char getClassification() {
		return classification;
	}

	/**
	 * Mutator method for classification
	 * @param classification
	 */
	public void setClassification(char classification) {
		this.classification = classification;
	}


	/**
	 * This is a method to allow the figure to be in a readable form
	 * @return Readable string
	 */
	@Override
	public String toString() {
		return "Figure [SN=" + SN + ", name=" + name + ", brand=" + brand + ", price=" + price + ", availableCount="
				+ availableCount + ", ageAppropriate=" + ageAppropriate + ", classification=" + classification + "]";
	}

	/**
	 * Formatting string for figure
	 * @return Formatted string
	 */
	public String format() {

		return SN + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";"
				+ classification;

	}

}
