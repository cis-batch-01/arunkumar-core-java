package com.technocis.discount;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		double initalprice = 0;
		double discount = 0;
		Scanner scan = new Scanner(System.in);
		double totalprice = 0;
		System.out.println("Enter the Total price");
		totalprice = Integer.parseInt(scan.nextLine());
		System.out.println("Enter your choice for discount");
		int choice = Integer.parseInt(scan.nextLine());
		switch (choice) {
		case 1:
			discount = (10 * totalprice) / 100;
			totalprice = totalprice - discount;
			break;
		case 2://
			discount = (5 * totalprice) / 100;
			totalprice = totalprice - discount;
			break;

		}
		System.out.println("your final price is :Rs. " + totalprice + "\nyou have saved : Rs." + discount);

	}
}