package com.technocis.pattern;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rows = Integer.parseInt(scan.nextLine());
		int i, j;
		for (i = 0; i < rows; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}