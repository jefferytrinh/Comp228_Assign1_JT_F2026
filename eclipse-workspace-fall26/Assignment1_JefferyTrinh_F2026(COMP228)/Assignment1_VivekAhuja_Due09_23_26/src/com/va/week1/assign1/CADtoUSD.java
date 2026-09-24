package com.va.week1.assign1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CADtoUSD {
	
	public void CAtoUS() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value in CAD");
		BigDecimal CAD = scanner.nextBigDecimal();
		scanner.close();
		
		BigDecimal toUSD = new BigDecimal("0.714700");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(CAD + " CAD to USD is: " + "$" + df.format(CAD.multiply(toUSD)));
	}

}
