package com.va.week1.assign1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeCalculation {

	public void GradeCalc() {
		
	/*
	 * Logic for grade calculation...	
	 */
		
		DecimalFormat df = new DecimalFormat("0.00");
		int marks[] = new int[6];
		int i;
		float total = 0, avg;

		try (Scanner scanner = new Scanner(System.in)) {
			for (i = 0; i < 6; i++) {

				System.out.print("Enter Marks of Subject" + (i + 1) + ": ");
				marks[i] = scanner.nextInt();
				total = total + marks[i];
			}
			scanner.close();
		}

		// Calculating average here
		avg = total / 6;
		
		/*
		 * modify this as per your outline... 
		 */

		System.out.print("Your average is: " + df.format(avg) + "%\nThe student Grade is: ");
		if (avg >= 80) {
			System.out.print("A");
		} else if (avg >= 70 && avg < 80) {
			System.out.print("B");
		}
		//..  complete this... as outline ... specification.. 

		else if (avg >= 60 && avg < 70) {
			System.out.print("C");
		}

		else if (avg >= 50 && avg < 60) {
			System.out.print("D");
		}
		
		else {
			System.out.print("F");
		}
		
	}
	
}
