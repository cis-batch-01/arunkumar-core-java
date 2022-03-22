package com.technocis.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArray {
	public static void main(String[] args) {
		int totaldoctors, doctorsduty = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total no of Doctors to store in the memory : ");
		totaldoctors = scan.nextInt();
		int[] totalDoctorsArray = new int[totaldoctors];
		System.out.println("Enter the S.No of the doctors :");
		for (int i = 0; i < totaldoctors; i++) {
			totalDoctorsArray[i] = scan.nextInt();
		}
		System.out.println("TotalDoctors List in the hospitals are: ");
		for (int i = 0; i < totaldoctors; i++) {
			System.out.println(totalDoctorsArray[i]);
		}
		System.out.print("Enter the total no of Duty Doctors to store in the memory : ");
		int doctorsOnDuty = scan.nextInt();
		int[] doctorsOnDutyArray = new int[doctorsOnDuty];
		System.out.println("Enter the S.No of the doctors on duty :");
		for (int i = 0; i < doctorsOnDuty; i++) {
			doctorsOnDutyArray[i] = scan.nextInt();
		}
		System.out.println("Duty Doctors List in the hospital are: ");
		for (int i = 0; i < totalDoctorsArray.length; i++) {
			System.out.println(totalDoctorsArray[i]);
		}
		int[] NonDutyDoctors = new int[totalDoctorsArray.length];
		for (int outter = 0; outter < totaldoctors; outter++) {
			int flag = 0;
			for (int inner = 0; inner < doctorsOnDuty; inner++) {
				if (totalDoctorsArray[outter] == doctorsOnDutyArray[inner]) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}

			}
			if (flag == 1) {
				NonDutyDoctors[outter] = totalDoctorsArray[outter];
			}

		}
		System.out.println("The Duty Doctors in the Hospital are"+Arrays.toString(doctorsOnDutyArray));
		System.out.println("The Non Duty Doctors in the Hospital are"+Arrays.toString(NonDutyDoctors));
	}
}
