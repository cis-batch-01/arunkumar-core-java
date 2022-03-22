package com.technocis.pattern;

import java.util.Scanner;

public class NumPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How the number of rows");
		int rows = scan.nextInt();
		System.out.println("");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}