package mru.tsc.model;

public class Animal extends Toy {

	String Material;
	char size;

	/**
	 * This is a constructor to create an animal based on the parameters
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param availableCount Available-count
	 * @param ageAppropriate Age level
	 * @param mat Material
	 * @param Size Animal size
	 */

	public Animal(String SN, String name, String brand, double price, int availableCount, int ageAppropriate,
			String mat, String Size) {
		super(SN, name, brand, price, availableCount, ageAppropriate);
		Material = mat;
		size = Size.charAt(0);
	}

	// SETTER + GETTER METHODS

	/**
	 * Acessor method for material
	 * @return Material
	 */
	public String getMaterial() {
		return Material;
	}

	/**
	 * Mutator method for material
	 * @param material
	 */
	public void setMaterial(String material) {
		Material = material;
	}

	/**
	 * Accessor method for size
	 * @return size
	 */
	public char getSize() {
		return size;
	}

	/**
	 * Mutator method for size
	 * @param size
	 */
	public void setSize(char size) {
		this.size = size;
	}

	/**
	 * Method to allow animal toy to be shown in readable form
	 * @return Readable string
	 */
	@Override
	public String toString() {
		return "Animal [SN=" + SN + ", name=" + name + ", brand=" + brand + ", price=" + price + ", availableCount="
				+ availableCount + ", ageAppropriate=" + ageAppropriate + ", Material=" + Material + ", size=" + size
				+ "]";
	}

	/**
	 * Formatting method for animal
	 * @return Formatted string
	 */
	public String format() {

		return SN + ";" + name + ";" + brand + ";" + price + ";" + availableCount + ";" + ageAppropriate + ";"
				+ Material + ";" + size;

	}

}
