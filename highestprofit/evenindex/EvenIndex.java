package com.technocis.highestprofit.evenindex;

import java.util.Scanner;

public class EvenIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("Enter the elements in the Array");
		num = Integer.parseInt(scan.nextLine());
		if (num < 0) {
			System.out.println("Please enter the positive Values");
			System.exit(0);
		} else {
			System.out.println("Please enter the values One by One");
			int[] arr = new int[num];
			
			for (int index = 0; index < num; index++) {
				arr[index] = scan.nextInt();
				if(arr[index]<0) {
					System.out.println("Please enter the positive Values");
					System.exit(0);
				}
			}
			for (int index = 0; index < num; index++) {
				if (index % 2 == 0) {
					sum = sum + arr[index];
				}
			}
			System.out.println("The sum of Even Index values are :" + sum);
		}
	}
}
