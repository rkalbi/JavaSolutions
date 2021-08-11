package dev.rkalbi.javaSolutions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ReverseStringArrayTest {
	

	@Test
	void reverseStringtest() {
		
		assertArrayEquals(new String[] {"o", "l", "l", "e", "h"}, ReverseStringArray.reverseString(new String[] {"h", "e", "l", "l", "o"}));
		assertArrayEquals(new String[] {"H", "a", "n", "n", "a", "h"}, ReverseStringArray.reverseString(new String[] {"h" ,"a", "n", "n", "a", "H"}));
		assertArrayEquals(new String[] {"n"}, ReverseStringArray.reverseString(new String[] {"n"}));
		assertArrayEquals(new String[] {" "}, ReverseStringArray.reverseString(new String[] {" "}));
		assertArrayEquals(new String[] {" "}, ReverseStringArray.reverseString(new String[] {" "}));
	}

}
