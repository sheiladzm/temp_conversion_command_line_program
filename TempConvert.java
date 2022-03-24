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
		int tempToConvert = Integer.parseInt(value); //since input value is accepted as a String, we have to parse it into an Integer in order to calculate it later

		//prompt user for unit of measurement
		System.out.println("Is the temperature in Celsius or Fahrenheit? (Enter C for Celsius and F for Fahrenheit) ");
		value = input.nextLine();
		String natureOfTemp = value;

		if (natureOfTemp.equals("C")) {
			int tempFahrenheit = (int) (tempToConvert * 1.8 + 32); //formula to convert Celcius to Fahrenheit
			System.out.println(tempToConvert + "C is " + tempFahrenheit + "F."); //output of conversion
		}
		else if(natureOfTemp.equals("F")) {
			int tempCelsius = (int) ((tempToConvert - 32) / 1.8); //formula to convert Fahrenheit to Celcius
			System.out.println(tempToConvert + "F is " + tempCelsius + "C."); //output of conversion
		}
		else {
			System.out.println("Invalid"); //if input is not "C" or "F" output the entry as "Invalid"
		}
	}
}
