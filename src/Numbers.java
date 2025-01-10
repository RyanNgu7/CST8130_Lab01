import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Ryan Nguyen
 * Student Number: 041137485
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * @author/Professor James Mwangi PhD. 
 * 
  */
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
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
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		numbers = new Float[size];
		numItems = 0;
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array
		
		Float newFloat;

		// Get value from the user
		if (numItems < numbers.length) {
			System.out.printf("Enter value: ");
			newFloat = keyboard.nextFloat();
			numbers[numItems] = newFloat; // Add the new value to the array
			numItems++;
		} else {
			// If array is already full, print error message
			System.out.println("Array full");
		}

	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		return (float) 0.0;
	}

	@Override
	public String toString() {
		// TODO Write code for an appropriate toString method
		return "";
	}
	
}
