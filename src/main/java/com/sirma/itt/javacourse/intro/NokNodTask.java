package com.sirma.itt.javacourse.intro;

import java.util.Scanner;

/**
 * asd.
 * 
 * @author Fester
 */
public class NokNodTask {

	/**
	 * @param x
	 *            integer
	 * @param y
	 *            integer
	 * @return GCD of x and y
	 */
	  // REVIEW: give better names to variables
	public static int nod(int x, int y) {
		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}
		return x;
	}

	/**
	 * @param x
	 *            integer
	 * @param y
	 *            integer
	 * @return LCM of x and y
	 */
	public static int nok(int x, int y) {

		return x * y / (nod(x, y));
	}

	/**
	 * main.
	 * 
	 * @param args
	 *            x
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		// REVIEW: scanner is not closed at the end!
		System.out.println(nok(x, y));
	}
}
