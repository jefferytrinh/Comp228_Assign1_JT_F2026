package com.va.week1.assign1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MilestoKilo {
	public void MitoKm() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length in miles");
		BigDecimal Mi = scanner.nextBigDecimal();
		scanner.close();
		
		BigDecimal toKm = new BigDecimal("1.609344");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(Mi + " Miles to Kilometers is: " + df.format(Mi.multiply(toKm)) + "km");
	}

}
