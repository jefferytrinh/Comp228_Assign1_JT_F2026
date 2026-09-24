package com.va.week1.assign1.Driver;

import java.util.Scanner;

import com.va.week1.assign1.GradeCalculation;
import com.va.week1.assign1.MilestoKilo;
import com.va.week1.assign1.LitertoGallon;
import com.va.week1.assign1.CADtoUSD;

public class DriverMain {

	public static void main(String[] args) {


		/*
		 * Create objects for classes of Task a-d.
		 *
		 *
		 */
		
		
		GradeCalculation gc = new GradeCalculation();
		MilestoKilo mk = new MilestoKilo();
		LitertoGallon lg = new LitertoGallon();
		CADtoUSD cu = new CADtoUSD();

		System.out.println("Enter the choice for operation \n1. Grade calculation \n2. Miles to Km \n3. Liters to Gallons \n4. CAD to USD");
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Doing Grade Calculation.. ");
				gc.GradeCalc();
				break;
			case 2:
				System.out.println("Doing Miles to Km.. ");
				mk.MitoKm();
				break;
			case 3:
				System.out.println("Doing Liters to Gallons.. ");
				lg.LtoGal();
				break;
			case 4:
				System.out.println("Doing CAD to USD.. ");
				cu.CAtoUS();
				break;
			default:
				System.out.println("Closing program. On Run: enter 1, 2, 3, or 4 to run respective programs");
				// yes i wrote it like this because idk how to loop in this situation
				break;
			}
		}

	}

}
