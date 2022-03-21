package com.technocis.addition;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThreeNumbersAddition {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Array elements are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int sum = 0;
		for (int i = array.length - 1; i >= array.length - 3; i--) {
			System.out.println(array[i]);
			// sum = 1;
			sum = sum + array[i];
		}
		System.out.println("sum:" + sum);
	}
}