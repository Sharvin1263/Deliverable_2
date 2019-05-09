package Deliverable2;

import java.util.Scanner;

public class unicodeCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String string1 = ("");
		String string2 = ("");
		int stringSum1 = 0;
		int stringSum2 = 0;
		int i;
		int stringDiff = 0;

// Prompt for and receive user event type input.		

		System.out.println("This program calculates the unicode difference of two strings");
		System.out.println("Enter 2 strings separated by a space: ");
		string1 = scnr.next();
		string2 = scnr.next();
		System.out.println("First string: " + string1 + "  Second string: " + string2);

// Get number of characters in each string for 
// loop iterations.		

		int N1 = string1.length();
		int N2 = string2.length();

// Print string characters and their unicode values.		

		for (i = 0; i < N1; ++i) {
			System.out.println("∎  " + string1.charAt(i) + ": " + string1.codePointAt(i));
		}

		for (i = 0; i < N2; ++i) {
			System.out.println("∎ " + string2.charAt(i) + ": " + string2.codePointAt(i));
		}

// Sum each string's unicode values.		

		for (i = 0; i < N1; ++i) {
			stringSum1 = stringSum1 + string1.codePointAt(i);

		}
		for (i = 0; i < N2; ++i) {
			stringSum2 = stringSum2 + string2.codePointAt(i);
		}

// Take the difference of the string sums and print out result.		

		stringDiff = stringSum2 - stringSum1;
		System.out.println(
				"The absolute value of the numerical difference between the strings is:  " + Math.abs(stringDiff));

	}

}
