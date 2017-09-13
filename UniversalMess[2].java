
package testingProj;

//@SuppressWarnings("resource")
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//@SuppressWarnings("unused")

import org.omg.PortableServer.THREAD_POLICY_ID;

public class UniversalMess {
	static Scanner scan = new Scanner(System.in);
	// final static String ESC = "\033[";
	static double[] lol;
	// DECLARATION OF STATIC VARIABLES AND PACKAGES FINALISED.

	public static void PrintLarge(double[] Numbers) {// Secondary method
		// Compares two numbers
		if (Numbers[0] > Numbers[1]) {
			System.out.println(Numbers[0] + " is larger than " + Numbers[1]);
		}
		if (Numbers[0] < Numbers[1]) {
			System.out.println(Numbers[1] + " is larger than " + Numbers[0]);
		}
		if (Numbers[0] == Numbers[1]) {
			System.out.println("Both values are the same.");
		}

	}

	public static void Calculate(double[] lol2) {// Secondary method
		int sum = 0;
		for (double i : lol2) { // Scans through all values of the array and adds it to a local variable 'sum'
			sum += i;
		}
		System.out.println("Sum of numbers: " + sum);
	}

	public static void main(String args[]) throws InterruptedException {
		// Starting main method (with timer InterupttedException)
		System.out.println("How many values do you want to add? (if 2 then values will be compared) [INT]");
		int Values = scan.nextInt();
		// Takes user input, This value will determine how many values will be input
		// into an array
		lol = new double[Values];
		for (int i = 0; i < Values; i++) { // For loop to input values into a empty array (repeats)
			System.out.println("Enter index: " + (i + 1) + " number.");
			double InputtedValue = scan.nextDouble();
			lol[i] = InputtedValue;

		}
		Calculate(lol); // Finds the sum of the values in an array
		if (Values == 2) {
			PrintLarge(lol); // Should there be two values, fire method to compare values
		}

	}
}
