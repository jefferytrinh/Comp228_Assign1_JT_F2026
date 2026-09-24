package com.va.week1.assign1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class LitertoGallon {
	public void LtoGal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter volume in liters");
		BigDecimal Liter = scanner.nextBigDecimal();
		scanner.close();
		
		BigDecimal toGal = new BigDecimal("0.26417205236");
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println(Liter + "L to Gallons is: " + df.format(Liter.multiply(toGal)) + " gal");
	}

}
