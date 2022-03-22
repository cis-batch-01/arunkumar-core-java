package com.technocis.highestprofit;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProfitAmongHighValues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter the number in (+)ve only");
			System.out.println("Enter no of elements :");
			int noofele = Integer.parseInt(scan.nextLine());
			if (noofele < 0) {
				System.out.println("enter Positive Numbers");
			} else {
			
			int[] noofeleArray = new int[noofele];
			System.out.println("Please enter Year and Amount in (+)ve only");
			System.out.println("enter the elements One by One :");
			for (int index = 0; index < noofele; index++) {
				noofeleArray[index] = Integer.parseInt(scan.nextLine());
				if (noofeleArray[index] < 0) {
					System.out.println("enter Positive Numbers");
				}
			}
			int max = noofeleArray[0];
			int resindex = -1;
			for (int i = 1; i < noofeleArray.length; i++) {
				if (noofeleArray[i] > max) {
					max = noofeleArray[i];
					resindex = i;

				}
			}
			System.out.println(Arrays.toString(noofeleArray));
			System.out.println("The highest profit is : " + max);
			if (resindex > 0) {
				System.out.println("The highest profit year is : " + noofeleArray[resindex - 1]);
			} else {
				System.out.println("Please provide only +ve values");
			}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
