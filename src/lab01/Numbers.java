/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Ryan Nguyen
 * Student Number: 041137485
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * @author/Professor James Mwangi PhD. 
 * 
  */
package lab01;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float[] numbers;

	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Default Constructor
	 */
	public Numbers() {
		numbers = new Float[5];
		numItems = 0;
	}

	/**
	 * Constructor that initializes the numbers array.
	 * 
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		numbers = new Float[size];
		numItems = 0;
	}

	/**
	 * Adds a value in the array
	 * 
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array

		float newFloat;

		// Get value from the user
		if (numItems < numbers.length) {
			System.out.printf("Enter value: ");
			newFloat = keyboard.nextFloat();
			numbers[numItems] = newFloat; // Add the new value to the array
			numItems++;
		} else {
			// If array is already full, alert the user
			System.out.println("Array full");
		}

	}

	/**
	 * Calculates the average of all the values in the numbers array.
	 * 
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		
		float total = (float) 0.0;
		float result = (float) 0.00;
		
		// Only calculate average if array is non-empty
		if (numItems > 0) {
			for (int i = 0; i < numItems; i++) {
				total += numbers[i];
			}
			result = (float) (Math.round(total / numItems * 100.0) / 100.0);
		}
		
		return result;
	}
	
	/**
	 * Calculates the minimum and maximum of the array and
	 * the result of the maximum modulo the minimum.
	 * 
	 * @return float array containing min, max, max mod min
	 */
	public float [] findMinMax() {
		float [] result = new float[3]; // {min, max, max % min}
		
		// Only do calculations if array is non-empty
		if (numItems == 1) {
			result[0] = numbers[0];
			result[1] = numbers[0];
		}
		else if (numItems > 1) {
			// Min
			float min = numbers[0];
			for (int i = 1; i < numItems; i++) {
				if (numbers[i] < min) {
					min = numbers[i];
				}
			result[0] = min;
			}
			
			// Max
			float max = numbers[0];
			for (int i = 1; i < numItems; i++) {
				if (numbers[i] > max) {
					max = numbers[i];
				}
			}		
			result[1] = max;
			
			// Max mod min
			//(float) (Math.round(total / numItems * 100.0) / 100.0);
			result[2] = (float) (Math.round(result[1] % result[0] * 100.0) / 100.0);
		}
		
		return result;
	}
	@Override
	public String toString() {
		// TODO Write code for an appropriate toString method
		String result = "";

		if (numItems > 0) {
			for (int i = 0; i < numItems; i++) {
				result += numbers[i] + "\n";
			}
		}

		return result;
	}

}
