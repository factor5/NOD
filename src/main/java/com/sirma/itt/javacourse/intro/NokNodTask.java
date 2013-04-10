package com.sirma.itt.javacourse.intro;

import java.util.Scanner;

/**
 * REVIEW: write more meaningful comments
 * asd.
 * 
 * @author Fester
 */
public class NokNodTask {

	/**
	 * REVIEW: missing comment
	 * REVIEW: all variables,fields, arguments, class names, interfaces must have meaningful names
	 * @param x
	 *            integer
	 * @param y
	 *            integer
	 * @return GCD of x and y
	 */
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
	 * REVIEW: Към всяка задача трябва да има "run" клас, който да съдържа main method, изпълняващ задачата
	 * main should be in separated class
	 * main.
	 * 
	 * @param args
	 *            x
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(nok(x, y));
	}
}
