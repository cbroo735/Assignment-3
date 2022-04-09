package mru.tsc.model;

public abstract class Toy {
	
	String SN;
	String name;
	String brand;
	String type;
	double price;
	int availableCount;
	int ageAppropriate;

	/**
	 * This is a constructor for the params that are shared between all types
	 * 
	 * @param SN Serial number
	 * @param name Toy name
	 * @param brand Toy brand
	 * @param price Toy price
	 * @param availableCount Available count
	 * @param ageAppropriate Age level
	 */
	public Toy(String SN, String name, String brand, double price, int availableCount, int ageAppropriate) {
		this.SN = SN;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}

	// SETTER + GETTER METHODS

	/**
	 * Accessor method for SN
	 * @return SN
	 */
	public String getSN() {
		return SN;
	}

	/**
	 * Mutator method for sN
	 * @param sN
	 */
	public void setSN(String sN) {
		SN = sN;
	}

	/**
	 * Accessor method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator method for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor method for brand
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Mutator method for brand
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Accessor method for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mutator method for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Accessor method for available count
	 * @return availablecount
	 */
	public int getAvailableCount() {
		return availableCount;
	}

	/**
	 * Mutator method for available count
	 * @param availableCount
	 */
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	/**
	 * Accessor method for age level
	 * @return ageAppropriate
	 */
	public int getAgeAppropriate() {
		return ageAppropriate;
	}

	public void setAgeAppropriate(int ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}

}
