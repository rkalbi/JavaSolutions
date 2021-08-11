package dev.rkalbi.javaSolutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatedNumberInArrayTest {

	@Test
	void findRepeatedNumberTest() {
		
		assertEquals(2, RepeatedNumberInArray.findRepeatedNumber(new int[] {1, 3, 4, 2, 2}));
		assertEquals(3, RepeatedNumberInArray.findRepeatedNumber(new int[] {3,1,3,4,2}));
		assertEquals(-1, RepeatedNumberInArray.findRepeatedNumber(new int[] {}));
	}

}
