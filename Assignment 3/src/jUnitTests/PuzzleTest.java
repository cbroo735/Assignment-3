package jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;

class PuzzleTest {
	
	/**
	 * @author colin
	 */
	@Test
	void test() {
		Puzzle test1 = new Puzzle("5234567891", "test", "Testy", 12.12, 4, 7, "L");
		String PuzzleTest = test1.toString();
		
		assertEquals("Puzzle [SN=5234567891, name=test, brand=Testy, price=12.12, availableCount=4, ageAppropraite=7, puzzleType=L]", PuzzleTest);
	}
	
}
