package com.sirma.itt.javacourse.intro;

/**
 * NOT READY!!!.
 * 
 * @author Fester
 */
public class CenterWeight {

	/**
	 * @param args
	 *            x
	 */
	public static void main(String[] args) {
		int[] arr = { 12, 3, 2, 4, 3, 1, 1, 1, 1, 8 };
		System.out.println(arr[arrWeight(arr)]);
	}

	// REVIEW: check arguments
	// REVIEW: optimize loops by caching calculated variables and object lookups before the loop
	public static int arrWeight(int[] arr) {
		int x1 = arr[0], x2 = arr[arr.length - 1], countLeft = 1, countRight = 1;
		for (int i = 1; i < arr.length - 2; i++) {
			if (x1 < x2) {
				x1 += arr[i];
				countLeft++;
			} else if (x1 > x2) {

				x2 += arr[arr.length - i];
			}
		}
		return countLeft;
	}

}
