package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		//call Scanner object to read user input
		Scanner input = new Scanner(System.in);

		//prompt user for temperature in number format (read as a String)
		System.out.print("Enter a temperature: ");
		String value = input.nextLine();
		int tempToConvert = Integer.parseInt(value);

		System.out.println("Is the temperature in Celsius or Fahrenheit? (Enter C for Celsius and F for Fahrenheit) ");
		value = input.nextLine();
		String natureOfTemp = value;

		if (natureOfTemp.equals("C")) {
			int tempFahrenheit = (int) (tempToConvert * 1.8 + 32);
			System.out.println(tempToConvert + "C is " + tempFahrenheit + "F.");
		}
		else if(natureOfTemp.equals("F")) {
			int tempCelsius = (int) ((tempToConvert - 32) / 1.8);
			System.out.println(tempToConvert + "F is " + tempCelsius + "C.");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
