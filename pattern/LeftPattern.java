package com.technocis.pattern;

import java.util.Scanner;

public class LeftPattern {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows = Integer.parseInt(scan.nextLine());
		{
			int a, l;
			for (a = 0; a < rows; a++) {
				for (l = 2 * (rows - a); l >= 0; l--) {
					System.out.print(" ");
				}
				for (l = 0; l <= a; l++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	}
}
