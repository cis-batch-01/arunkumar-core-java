package com.technocis.User.services;

import java.util.Scanner;

public class AttendanceTest {
public static void main(String[] args) {
	int a,b,c,temp, large;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 1st value");
	a=scan.nextInt();
	System.out.println("enter the 2nd value");
	b=scan.nextInt();
	System.out.println("enter the 3rd value");
	c=scan.nextInt();
	large = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
System.out.println("Three largest value among the values are "+large);
}
}
