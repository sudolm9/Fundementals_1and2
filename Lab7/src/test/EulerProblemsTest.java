package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import controller.EulerProblem3;

public class EulerProblemsTest {

	EulerProblem3 solution;

	@Before
	public void setUp() {
		solution = new EulerProblem3();
	}
// testing for EulerProblem3, one random number and the actual number for Euler Problem 3
	
	@Test
	public void testFactor1() {
		assertEquals(461, solution.PrimeFactor(98654));
	}

	@Test
	public void testFactor2() {
		assertEquals(6857, solution.PrimeFactor(600851475143L));
	}
	@Test
	public void testFactor3() {
		assertEquals(62761, solution.PrimeFactor(878654));
	}
	@Test
	public void testFactor4() {
		assertEquals(1607, solution.PrimeFactor(6428));
	}
}
