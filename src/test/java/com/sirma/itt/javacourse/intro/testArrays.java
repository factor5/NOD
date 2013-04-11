package com.sirma.itt.javacourse.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * testing array functions.
 * 
 * @author Fester
 */
 // REVIEW: the class name and the file name did not match
public class TestArrays {

	private ArraysTask arr = new ArraysTask();

	/**
	 * main.
	 */
	public static void main() {

	}

	/**
	 * testing minimum element function.
	 */
	@Test
	public void testgetMinElement() {
		final int[] z = { 2, 6, 9, 4, 2, 1 };
		final int[] z2 = { 100, 43, 65, 324, 767, 41 };
		assertEquals("Must return 1", 1, arr.getMinElement(z));
		assertEquals("Must return 41", 41, arr.getMinElement(z2));
	}

	/**
	 * testing sum of element function.
	 */
	@Test
	public void testgetsum() {
		final int[] z = { 2, 6, 9, 4, 2, 1 };
		final int[] z2 = { 100, 12, 12, 1, 2, 3 };
		assertEquals("Must return 24", 24, arr.getSum(z));
		assertEquals("Must return 130", 130, arr.getSum(z2));
	}

	/**
	 * testing print of array function.
	 */
	@Test
	public void testPrintArray() {
		final int[] z = { 2, 6, 9, 4, 2, 1 };
		final int[] z2 = { 100, 12, 12, 1, 2, 3 };
		assertEquals("Must return 24", "2, 6, 9, 4, 2, 1", arr.printArray(z));
		assertEquals("Must return 130", "100, 12, 12, 1, 2, 3", arr.printArray(z2));
	}

}
