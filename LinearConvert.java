package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the length: ");

		double length = input.nextDouble();
		input.nextLine();

		System.out.print("is the measurment in (m)eters or (f)eet? ");

		String lengthType = input.nextLine();

		System.out.println(length + lengthType + " is " + doConversion(length, lengthType) + (lengthType.toLowerCase().startsWith("m") ? "f" : "m"));
	}

	public static double doConversion(double length, String lengthType) {


		if(lengthType.toLowerCase().startsWith("m")) {
			double resultFeet = length * 3.2808399;
			return resultFeet;
		} else {
			double resultMeters = length * 0.3048;
			return resultMeters;
		}
	}
}

