package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import mru.tsc.model.Figure;

/**
 * 
 * @author colin
 *
 */

class FigureTest {

	/**
	 * This tests to ensure that it creates a Figure object and that Figure can
	 * return a correct toString method
	 *
	 */

	@Test
	void test() {
		Figure test1 = new Figure("1234567891", "test", "Testy", 12.12, 4, 7, "Doll");
		String FigureTest = test1.toString();
		assertEquals(
				
				
				"Figure [SN=1234567891, name=test, brand=Testy, price=12.12, availableCount=4, ageAppropraite=7, classification=D]",
				FigureTest);
		

	}

}
