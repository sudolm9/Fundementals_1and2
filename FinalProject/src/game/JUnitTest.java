/*Matthew Meyers
 * 
 */
package game;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnitTest of Check.checkAnswer
 * This makes sure that the checkAnswer method is able to take 4 ints and successfully make an equation that equals 24
 * Also checks to make sure that 4 ints that have no mathematical way to reach 24 will return with "No Answer Found"
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */
public class JUnitTest {

	
	
	/**
	 * Check 1.
	 */
	@Test
	public void check1() {
		assertEquals("(5*5)-(4-3)", Check.checkAnswer(new int[]{5,5,4,3}));
	}
	
	/**
	 * Check 2.
	 */
	@Test
	public void check2() {
		assertEquals("8+4+4+8", Check.checkAnswer(new int[]{8,4,4,8}));
	}
	
	/**
	 * Check 3.
	 */
	@Test
	public void check3() {
		assertEquals("(2+13)*(5/3)", Check.checkAnswer(new int[]{2,13,5,3}));
	}
	
	/**
	 * Check 4.
	 */
	@Test
	public void check4() {
		assertEquals("No Answer Found...", Check.checkAnswer(new int[]{13,13,13,13}));
	}

}
